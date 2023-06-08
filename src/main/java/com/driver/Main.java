package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y,int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p=new Product();

        //method overloading
        p.product(4,5);
        p.product(4,5,9);
        p.product(5.3,9.4);
    }
}