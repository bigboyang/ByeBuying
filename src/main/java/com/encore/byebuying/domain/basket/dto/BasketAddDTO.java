package com.encore.byebuying.domain.basket.dto;

import lombok.Data;

@Data
public class BasketAddDTO {
    private Long item_id;
    private Long user_id;
    private int count;
}