package com.capgemini;

import java.util.ArrayList;

public interface IRegister {

    /**
     * Calculates the price to pay.
     * @param customer
     * @return toPay
     */
    double checkOut(Customer customer);

    /**
     * Calculates the discount.
     * @param customer
     * @return amountOfDiscount
     */
    double calculateDiscount(Customer customer);



}
