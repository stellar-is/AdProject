package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int discount;
    private Date startDate;
    private Date endDate;
    private int minDays;
    @ManyToOne
    private Channels channels;
}
