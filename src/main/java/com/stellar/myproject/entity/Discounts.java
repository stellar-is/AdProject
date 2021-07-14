package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int days;
    private double percent;
    @ManyToOne
    private Channels channel;

}
