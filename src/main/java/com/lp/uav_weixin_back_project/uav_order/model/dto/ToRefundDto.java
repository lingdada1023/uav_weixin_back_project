package com.lp.uav_weixin_back_project.uav_order.model.dto;

public class ToRefundDto {
    private Integer userId;

    private Integer orderId;

    private String refundRes;

    private Double price;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getRefundRes() {
        return refundRes;
    }

    public void setRefundRes(String refundRes) {
        this.refundRes = refundRes;
    }
}
