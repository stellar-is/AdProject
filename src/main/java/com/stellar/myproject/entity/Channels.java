package com.stellar.myproject.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Channels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String logo;
    private boolean isActive;


}
