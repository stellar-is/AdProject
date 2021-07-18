package com.stellar.myproject.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "channels")
public class Channels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "channels_id")
    private Long id;
    private String name;
    private String logo;
    private boolean isActive;


}
