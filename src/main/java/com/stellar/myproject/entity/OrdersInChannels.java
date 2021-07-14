package com.stellar.myproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orders_in_channels")
public class OrdersInChannels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_channel_id")
    private Long id;
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private OrderEntity order;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    private Channels channel;
    private String days;
    private double amount;

}
