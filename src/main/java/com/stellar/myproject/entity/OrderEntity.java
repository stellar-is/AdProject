package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    @ManyToMany
    @JoinTable(
            name = "orders_in_channels",
            joinColumns = @JoinColumn(name = "orderentity_id"),
            inverseJoinColumns = @JoinColumn(name = "channelsentity_id"))
    private List<ChannelsEntity> channel;
    private Date date;
    private int amount;
    private String phoneNumber;
    private String eMail;
    private String name;
    private boolean isPaid;

    public OrderEntity() {
    }

    public OrderEntity(String text, String phoneNumber, String name) {
        this.text = text;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
}
