package com.capgemini;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /**
         * Create a list of products
         */
        ArrayList<Product> products = new ArrayList<Product>();

        Product robijn = new Product("Robijn", 3);
        Product brinta = new Product("Brinta", 2);
        Product chinVeg = new Product("Chinese Groente", 5);
        Product kwark = new Product("Kwark", 2);
        Product diapers = new Product("Luiers", 10);
        products.add(robijn);
        products.add(brinta);
        products.add(chinVeg);
        products.add(kwark);
        products.add(diapers);


        /**
         * create an arraylist of discounts
         */
        ArrayList<Discount> discounts = new ArrayList<Discount>();
        Discount robijnDis = new Discount(robijn, 3,2);
        Discount brintaDis = new Discount(brinta, 2,1);
        Discount diapersDis = new Discount(diapers, 4, 10);
        discounts.add(robijnDis);
        discounts.add(brintaDis);
        discounts.add(diapersDis);


        /**
         * create and initialize a register
         */

        Register register = new Register();
        register.initialize(products, discounts);

        /**
         * create new or returning customers
         */

        ReturningCustomer muriel = new ReturningCustomer("Muriel");

        muriel.addToBasket(diapers);
        muriel.addToBasket(kwark);
        muriel.addToBasket(kwark);
        muriel.addToBasket(robijn);
        muriel.addToBasket(diapers);
        muriel.addToBasket(diapers);
        muriel.addToBasket(diapers);
        muriel.addToBasket(robijn);
        muriel.addToBasket(robijn);
        muriel.addToBasket(diapers);

        register.checkOut(muriel);


    }
}
