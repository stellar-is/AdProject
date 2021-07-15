package com.stellar.myproject.repository;

import com.stellar.myproject.entity.OrderDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDaysRepo extends JpaRepository<OrderDays,Long> {
}
