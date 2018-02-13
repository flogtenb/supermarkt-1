package com.capgemini;

import java.util.ArrayList;

public abstract class Customer {

    public Customer(String name) {
        this.name = name;
    }

    private String name;

    ArrayList<Product> basket = new ArrayList<Product>();

    /**
     * Prints out a greeting to a regular or a new customer.
     *
     * @param customer
     */
    public abstract void greetCustomer(Customer customer);

    /**
     * Adds a product to ArrayList basket.
     *
     * @param product
     */
    public abstract void addToBasket(Product product);

}
