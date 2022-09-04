package com.michael.base.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@ToString
public class OrderEvent {
    private String message;
    private String status;
    private Order order;
}
