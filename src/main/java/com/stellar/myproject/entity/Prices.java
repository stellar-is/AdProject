package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    private Channels channels;
}
