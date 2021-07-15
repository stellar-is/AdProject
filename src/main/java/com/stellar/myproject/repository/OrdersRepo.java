package com.stellar.myproject.repository;

import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.entity.dto.OrdersDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends JpaRepository<Orders,Long> {
}