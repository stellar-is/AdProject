package com.stellar.myproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Channels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String logo;
    private boolean isActive;
    private double pricePerSymbol;
    private double pricePerBanner;
    @ManyToMany(mappedBy = "channel")
    @Transient
    @JsonIgnore
    private List<Orders> order;
    @ManyToOne
    @JoinColumn(name = "order_channel_id")
    private OrdersInChannels ordersInChannels;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn
//    private OrderEntity order;


}
