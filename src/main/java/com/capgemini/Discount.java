package com.capgemini;

public class Discount {

    Product product;

    int amountForDiscount;

    int discountPrice;

    String name;

    public Discount(Product product, int amountForDiscount, int discountPrice) {
        this.product = product;
        this.amountForDiscount = amountForDiscount;
        this.discountPrice = discountPrice;
        this.name = product.getProductName();
    }

    public Product getProduct() {
        return product;
    }

    public int getAmountForDiscount() {
        return amountForDiscount;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public String getName() {
        return name;
    }
}
