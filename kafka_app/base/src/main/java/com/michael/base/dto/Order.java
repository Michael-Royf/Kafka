package com.michael.base.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@ToString
public class Order {
    private String orderId;
    private String name;
    private  int qty;
    private double price;
}
