package com.stellar.myproject.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orders_id")
    private Long id;
    @Column(length = 500)
    private String text;
    private int amount;
    @Column(name = "status")
    private boolean status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clients_id")
    private Clients clients;
    private double totalSum;

}
