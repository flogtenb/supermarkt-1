package com.capgemini;

import java.util.ArrayList;

public abstract class Customer {

    public Customer(String name) {
        this.name = name;
    }

    private String name;

    private ArrayList<Product> basket = new ArrayList<Product>();

    /**
     * Prints out a greeting to a regular or a new customer.
     */
    public abstract String greetCustomer();

    /**
     * Adds a product to ArrayList basket.
     *
     * @param product product
     */
    public void addToBasket(Product product) {
        basket.add(product);
        System.out.println(getName() + " added " + product.getProductName() + " to the basket.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

}
