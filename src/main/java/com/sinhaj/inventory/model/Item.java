package com.sinhaj.inventory.model;

public class Item {
    private String itemId;
    private Double quantity;

    public Item(String itemId, Double quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public Item() {}

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
