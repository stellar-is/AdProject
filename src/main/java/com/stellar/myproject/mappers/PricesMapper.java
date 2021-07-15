package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.Prices;
import com.stellar.myproject.entity.dto.PricesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface PricesMapper {
    PricesMapper INSTANCE = Mappers.getMapper(PricesMapper.class);
    PricesDto pricesToPricesDto(Prices prices);
    Prices pricesDtoToPrices(PricesDto pricesDto);
    List<PricesDto>pricesListToPricesDtoList(List<Prices>pricesList);
    List<Prices>pricesDtoListToPricesList(List<PricesDto>pricesDtoList);

}
