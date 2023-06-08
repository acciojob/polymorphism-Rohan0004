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
        System.out.println(p.product(4,5));
        System.out.println(p.product(4,5,9));
        System.out.println(p.product(5.3,9.4));
    }
}