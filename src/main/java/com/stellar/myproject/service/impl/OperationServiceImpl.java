package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.dto.*;
import com.stellar.myproject.entity.objects.ChannelDays;
import com.stellar.myproject.entity.objects.FinalResponse;
import com.stellar.myproject.entity.objects.InputData;
import com.stellar.myproject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private ClientsService clientsService;
    @Autowired
    private OrdersService orderService;
    @Autowired
    private OrderDetailsService orderDetailsService;
    @Autowired
    private DiscountsService discountsService;
    @Autowired
    private PricesService pricesService;
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private OrderDaysService orderDaysService;

    @Override
    public FinalResponse operation(InputData inputData) {
        FinalResponse finalResponse = new FinalResponse();
        ClientsDto clientsDto = clientsService.findByPhone(inputData.getPhone());
        if(clientsDto == null){
            clientsDto = new ClientsDto();
            clientsDto.setEMail(inputData.getEMail());
            clientsDto.setName(inputData.getName());
            clientsDto.setPhone(inputData.getPhone());
            clientsDto = clientsService.save(clientsDto);
        }

        OrdersDto ordersDto = new OrdersDto();
        String str = inputData.getText().replaceAll("\\s+","");
        int symbolAmount = str.length();
        ordersDto.setAmount(symbolAmount);
        ordersDto.setClients(clientsDto);
        ordersDto.setStatus(false);
        ordersDto.setText(inputData.getText());
        OrdersDto ordersDto1 = orderService.save(ordersDto);

        double totalSum = 0;

        List<ChannelDays> channelDays = inputData.getChannelDays();
        channelDays.stream()
                .forEach(x->{
                    OrdersDetailsDto ordersDetailsDto = new OrdersDetailsDto();
                    ordersDetailsDto.setOrders(ordersDto1);
                    ordersDetailsDto.setChannels(x.getChannelsDto());

                    int days = x.getDays().size();

                    DiscountsDto discountDto = discountsService.findByChannelsAndMinDay(days, x.getChannelsDto().getId());
                    Long tvChanelId = x.getChannelsDto().getId();
                    PricesDto pricesDto=  pricesService.findByChannelsAndDate(tvChanelId);
                    double pricePerSymbol = pricesDto.getPrice();

                    OrdersDetailsDto ordersDetailsDto1;

                    if(discountDto != null){
                        int percent = discountDto.getDiscount();
                        double withoutDiscount = symbolAmount*pricePerSymbol;
                        double discountInSum = withoutDiscount*percent/100;
                        double sum = withoutDiscount-discountInSum;
                        double sumForChanel = sum*days;
                        ordersDetailsDto.setPrice(sumForChanel);
                        ordersDetailsDto1 = orderDetailsService.save(ordersDetailsDto);

                    }else {
                        double withoutDiscount = symbolAmount * pricePerSymbol * days;
                        ordersDetailsDto.setPrice(withoutDiscount);
                        ordersDetailsDto1 = orderDetailsService.save(ordersDetailsDto);
                    }
                    List<Date>day = x.getDays();
                    day.stream().forEach(d->{
                        orderDaysService.saveDate(d,ordersDetailsDto1);
                    });
                });

        List<OrdersDetailsDto> ordersDetailsDtoList = orderDetailsService.findAllByOrders(ordersDto1);
        totalSum = ordersDetailsDtoList.stream().mapToDouble(x->x.getPrice()).sum();
        ordersDto1.setTotalSum(totalSum);
        orderService.save(ordersDto1);

        finalResponse.setMessage("Заказ успешно добавлен!");
        finalResponse.setStatus(1);
        finalResponse.setText(ordersDto1.getText());
        finalResponse.setTotalSum(totalSum);

        String code = generateCode();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("crauseetic@gmail.com");
        message.setTo(inputData.getEMail());
        message.setSubject("Оповещение о подаче рекламы!");
        message.setText("Ваше обявление:"+"«"+ inputData.getText()+"»"+" успешно добавлено!"+"\nСумма к оплате :"+totalSum+"\nВаш код оплаты: "+code);
        javaMailSender.send(message);

        return finalResponse;
    }

    public String generateCode(){
        int randomPIN = (int)(Math.random()*9999)+1000;
        String val = ""+randomPIN;
        return val;
    }

}
