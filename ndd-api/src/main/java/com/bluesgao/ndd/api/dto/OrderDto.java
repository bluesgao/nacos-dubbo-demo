package com.bluesgao.ndd.api.dto;

import java.io.Serializable;

public class OrderDto implements Serializable {
    private String orderNo;
    private String orderUserId;
    private Long orderPrice;

    public OrderDto() {
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(String orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }
}
