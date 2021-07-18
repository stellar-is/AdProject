package com.stellar.myproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "clients")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clients_id")
    private Long id;
    @Column(unique = true)
    private String phone;
    @Column(nullable = false)
    private String name;
    private String eMail;
}
