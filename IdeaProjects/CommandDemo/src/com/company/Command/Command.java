package com.company.Command;

public class Command {
    private String stock;
    private int quantity;
    private  String orderType;

    public Command(String stock, int quantity, String orderType) {
        this.stock = stock;
        this.quantity = quantity;
        this.orderType = orderType;
    }

    public String getStock() {
        return stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrderType() {
        return orderType;
    }
}
