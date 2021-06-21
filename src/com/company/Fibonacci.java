package com.navin;

public class Fibonacci {

    public static void main(String[] args) {
        int d, a = 1, b = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        d = 0;
        while (d < 100) ;
        {
            d=a+b;
            System.out.println(d+'');
            a=b;
            b=d;
        }

    }
}
