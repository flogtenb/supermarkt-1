package com.capgemini;

public class Product {

    public Product(String productName, double normalPrice, int discountedAmount, double discountedPrice) {
        this.productName = productName;
        this.normalPrice = normalPrice;
        this.discountedAmount = discountedAmount;
        this.discountedPrice = discountedPrice;
    }

    private String productName; // The name of the product
    private double normalPrice; // Normal price per unit
    private int discountedAmount; // Amount that allows for discount
    private double discountedPrice; // The price per discountedAmount


}
