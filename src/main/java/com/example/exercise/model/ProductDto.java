package com.example.exercise.model;


public class ProductDto {
    private Long id;

    private final String productName;
    private final String category;
    private final String size;
    private final int price;
    private final String currency;
    private final String color;

    public ProductDto(Long id, String productName, String category, String size, int price, String currency, String color) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.size = size;
        this.price = price;
        this.currency = currency;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getColor() {
        return color;
    }

    
    
    
    
}