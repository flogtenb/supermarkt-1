package com.capgemini;

public class Product {

    public Product(String productName, double normalPrice) {
        this.productName = productName;
        this.normalPrice = normalPrice;

    }

    private String productName; // The name of the product
    private double normalPrice; // Normal price per unit

    /**
     * getters
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    public double getNormalPrice() {
        return normalPrice;
    }
}
