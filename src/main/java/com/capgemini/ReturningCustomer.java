package com.capgemini;

public class ReturningCustomer extends Customer {
    //input customer name
    public ReturningCustomer(String name) {
        super(name);
    }



    /**
     * Prints out a greeting to a regular or a new customer.
     */
    public String greetCustomer() {
        return "Welcome back " + getName() + "!";
    }


    /**
     * Adds a product to ArrayList basket.
     *
     * @param product
     */

}
