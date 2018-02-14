package com.capgemini;

public class NewCustomer extends Customer {
    //apply customer name
    public NewCustomer(String name) {
        super(name);

    }


    /**
     * Prints out a greeting to a new customer.
     */
    public String greetCustomer() {
        return "Welcome to our store " + getName() + "!";

    }

    /**
     * Adds a product to ArrayList basket.
     *
     * @param product
     */
    @Override
    public void addToBasket(Product product) {
        System.out.println("Thank you for choosing " + product.getProductName() + ", "+ getName()+".");
    }


}
