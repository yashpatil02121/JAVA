package com.company;

import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATOR USING SWITCH CASE\nEnter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        float res = 0;
        System.out.println("Enter 1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
        int c=sc.nextInt();
        switch (c){
            case 1:
                res=a+b;
                break;
            case 2:
                res=a-b;
                break;
            case 3:
                res=a*b;
                break;
            case 4:
                res=(float)a/b;
                break;
            default:
                System.out.println("INVALID CHOICE");

        }
        System.out.println("The result is:"+res);

    }
}
