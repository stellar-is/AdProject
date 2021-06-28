package com.stellar.myproject.repository;

import com.stellar.myproject.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity,Long> {
    OrderEntity findByName(String name);
}
