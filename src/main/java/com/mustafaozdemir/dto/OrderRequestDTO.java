package com.mustafaozdemir.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrderRequestDTO {
    private String productId;
    private int quantity;
    private double amount;
    private String email;
}
