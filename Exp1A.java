package com.company;

import java.util.*;

public class Exp1A {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        if(a%2==0)
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");
        while (a>0){
            int b=a%10;
            sum=sum+b;
            a=a/10;
        }
        System.out.printf("sum of the individual digits is: %d",sum);
    }
}
