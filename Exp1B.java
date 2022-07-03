package com.company;

public class Exp1B {
    public static void main(String[] args) {
        int fib=0,a=0,b=1;
        System.out.print(a+" "+b);
        for(int n=2;n<10;n++){
            fib=a+b;
            System.out.print(" "+fib);
            a=b;
            b=fib;
        }
    }
}