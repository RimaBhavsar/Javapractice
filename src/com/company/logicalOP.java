package com.company;

public class logicalOP {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(x > 12 && y < 10);

        System.out.println(x < 5 || y > 15);

        System.out.println(!(x > 12 && y < 10));
    }
}