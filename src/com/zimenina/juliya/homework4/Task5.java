package com.zimenina.juliya.homework4;

/*
Suppose 1 item costs $24.5
Display a table of prices
2, 3 .... 20 pieces of this product
 */
public class Task5 {
    public static void main(String[] args) {
        double priceItem = 24.5;
        for (int i = 0; i < 21; i++) {
            System.out.println("The cost of goods in quantity " + i +
                    " pieces is equal to " + i * priceItem);
        }
    }
}
