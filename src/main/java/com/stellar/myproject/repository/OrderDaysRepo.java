package com.stellar.myproject.repository;

import com.stellar.myproject.entity.OrdersDays;
import com.stellar.myproject.entity.dto.OrdersDaysDto;
import com.stellar.myproject.entity.dto.OrdersDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrderDaysRepo extends JpaRepository<OrdersDays,Long> {

//    OrdersDaysDto saveDate(Date date, OrdersDetailsDto orderDetailsDto);
}
