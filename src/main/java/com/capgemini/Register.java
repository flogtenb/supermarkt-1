package com.capgemini;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;

public class Register implements IRegister {

    private ArrayList<Product> allProducts = new ArrayList<Product>();
    private ArrayList<Discount> discounts = new ArrayList<Discount>();
    private double total;
    private double grandTotal;
    private double discountAmount;
    private Customer customer;

    /**
     * Initialise the register, add all the products to the register
     */
    public void initialize(ArrayList<Product> products, ArrayList<Discount> discounts) {
        this.allProducts = products;
        this.discounts = discounts;

    }

    /**
     * Calculates the price to pay.
     *
     * @param customer for this customer
     * @return amount toPay
     */
    public void checkOut(Customer customer) {
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println(customer.greetCustomer());
        System.out.println(" ");
        this.total = calculateTotal(customer.getBasket());
        productDiscount(customer.getBasket());
        System.out.println(" ");
        System.out.println("Total amount    : €" + this.total);
        System.out.println("Total discounts : €" + this.discountAmount);
        System.out.println("                 ----------- -");
        this.grandTotal = this.total - this.discountAmount;
        System.out.println("grand total due : €" + this.grandTotal);
        System.out.println(" ");
        System.out.println("Thank you for shopping at our store!");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------");

    }

    private double calculateTotal(ArrayList<Product> products) {
        this.total = 0;
        for (Product product : products) {
            this.total += product.getNormalPrice();

        }
        return this.total;
    }

    /**
     * this method calculates the discount per item
     *
     * @param basket the products to purchase
     * @return total amount of discount
     */
    public double productDiscount(ArrayList<Product> basket) {
        double discount = 0;

        //for each product that is also in allproducts, start the loop
        for (Product product : this.allProducts) {
            int nrOfProducts = 0;
            // for each product that is also in the basket, start this loop
            for (Product totalproducts : basket) {
                // for each products that is the same as the product in the first loop
                // (meaning it is in the glossary) add 1 to the nr of products
                if (totalproducts.equals(product)) {
                    nrOfProducts++;
                }

            }
// calculate the discount for this product with the product and the nr of products
            double discountPerProduct = calculateDiscount(product, nrOfProducts);
            discount += discountPerProduct;


        }


        return discount;
    }

    /**
     * this method calculated the amount of discount allowed
     *
     * @param product      specifies which product it is calculating for
     * @param nrOfProducts the amount of this product being bought
     * @return the amount of discount eligible
     */
    private double calculateDiscount(Product product, int nrOfProducts) {
        double productDiscountAmount = 0;
        // for each discount that is in the glossary of discounts
        for (Discount discount : this.discounts) {
            //if the product is the same as product in discount
            if (product.equals(discount.product) && nrOfProducts > 0) {
                //nr of discounts is the nr of products divided by the nr needed for the discount
                // it is an int because the amount of discounts can only be applied if the entire amount needed is met
                int nrOfDiscounts = nrOfProducts / discount.getAmountForDiscount();
                productDiscountAmount = nrOfDiscounts * discount.discountPrice;
            }
        }
        this.discountAmount += productDiscountAmount;
        if (nrOfProducts > 0) {
            System.out.println("BLIEP - " + nrOfProducts + " x " + product.getProductName() + " added, price " + nrOfProducts + " x €" + product.getNormalPrice() + " - €" + productDiscountAmount + " discount");
        }
        return this.discountAmount;
    }
}
