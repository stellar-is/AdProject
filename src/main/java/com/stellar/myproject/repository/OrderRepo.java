package com.stellar.myproject.repository;

import com.stellar.myproject.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Long> {
    Orders findByName(String name);
}
