package com.example.myapp_03032022.models;

public class Product {
    private int ProductId;
    private String ProductName;
    private double price;

    public Product(int productId, String productName, double price) {
        ProductId = productId;
        ProductName = productName;
        this.price = price;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
