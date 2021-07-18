package com.stellar.myproject.repository;

import com.stellar.myproject.entity.OrdersDetails;
import com.stellar.myproject.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderDetailsRepo extends JpaRepository<OrdersDetails,Long> {
    List<OrdersDetails> findAllByOrders(Orders orders);
}
