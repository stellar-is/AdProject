package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderDays {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int day;
    @ManyToOne
    private OrderDetails orderDetails;
}
