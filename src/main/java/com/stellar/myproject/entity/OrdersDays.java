package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order_days")
public class OrdersDays {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_days_id")
    private Long id;
    private int day;
    @ManyToOne
    @JoinColumn(name = "order_details_id")
    private OrdersDetails ordersDetails;
}
