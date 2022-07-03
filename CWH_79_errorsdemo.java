package com.company;

import java.util.Scanner;

public class CWH_79_errorsdemo {
    public static void main(String[] args) {
        //SYNTAX ERROR DEMO
//        int a = 0;  //error: no semicolon
//        b = 4;   //error: b not declared

        // LOGICAL ERROR DEMO
        // write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<10; i++)
        {
            System.out.println(2*i+1);
        }

        // RUN TIME ERROR
         int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);

    }
}
