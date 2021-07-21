package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "order_days")
public class OrdersDays {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_days_id")
    private Long id;
    private Date day;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orders_details_id")
    private OrdersDetails ordersDetails;
}
