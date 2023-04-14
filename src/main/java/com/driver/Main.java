package com.driver;


public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int a = p.product(5, 6);

        int b = p.product(1, 2, 3);
        double c = p.product(10, 20);

        System.out.print(a+" "+b+" "+c);
    }
}




