package com.stellar.myproject.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private int amount;
    private boolean status;
    @ManyToOne
    private Clients clients;

}
