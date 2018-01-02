package com.dkus.week1;

import java.util.Scanner;

public class APlusB {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        add(a,b);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
}