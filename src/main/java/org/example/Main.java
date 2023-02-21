package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String sum = bins.sum("1001", "1101"), mult = bins.mult("1001", "1101");//1001 = 9   1101 = 13

        System.out.println(sum);
        System.out.println(mult);
        System.out.println();
        System.out.println(Integer.parseInt(sum, 2));
        System.out.println(Integer.parseInt(mult, 2));
    }
}