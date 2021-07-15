package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Orders orders;
    @ManyToOne
    private Channels channels;
    private double price;

}
