package com.capgemini;

import java.util.ArrayList;

public interface IRegister {

    /**
     * Calculates the price to pay.
     *
     * @param customer
     * @return toPay
     */
    void checkOut(Customer customer);

    /**
     * calculates the amount of discount
     * @param basket items in the basket
     * @return discount amount
     */
    double productDiscount(ArrayList<Product> basket);


}
