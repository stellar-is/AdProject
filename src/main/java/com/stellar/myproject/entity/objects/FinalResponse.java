package com.stellar.myproject.entity.objects;

import lombok.Data;

@Data
public class FinalResponse {

    private int status;
    private String message;
    private String text;
    private double totalSum;
}
