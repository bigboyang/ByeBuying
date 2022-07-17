package com.encore.byebuying.domain.order.dto;

import com.encore.byebuying.domain.common.Address;
import com.encore.byebuying.domain.order.Order;
import com.encore.byebuying.domain.order.OrderItem;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class OrderResponseDTO {
    /** 
     *  주문 아이템 목록
     *  배송지 주소
     *  주문일자
     *  주문상태
     */
    private List<OrderItemResponseDTO> items;
    private Address address;
    private LocalDateTime orderDate;
    private String orderState;

    public OrderResponseDTO(Order order) {
        this.items = orderItemInfoDTOList(order.getOrderItems());
    }

    private List<OrderItemResponseDTO> orderItemInfoDTOList(List<OrderItem> orderItems) {
        return orderItems.stream().map(OrderItemResponseDTO::new).collect(Collectors.toList());
    }
}
