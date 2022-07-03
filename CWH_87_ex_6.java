package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class MasledarCalculator extends Exception{

    public int add(int a, int b) {
        try {
            int res = a + b;
            return res;
        }
        catch(InputMismatchException e){
            System.out.println("MAxInputException");
        }
        return 0;
    }
    public int sub(int a, int b) {
        if (a<b){
            throw new InputMismatchException();
        }
        try {
            int res = a - b;
            return res;
        }
        catch(Exception e){
            System.out.println("MAxInputException");
        }
        return 0;
    }
    public int mul(int a, int b) {
        try {
            if (a<100000 && b<100000){
                int res = a * b;
                return res;
            }
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("MAxInputException");
            System.out.println(e);
        }
        return 0;
    }
    public double div(double a, double b) {
        try {
            if ((a<100000 && b<100000) && (a!=0 && b!= 0)){
                double res = a / b;
                return res;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
        return 0;
    }
}

public class CWH_87_ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MasledarCalculator msc = new MasledarCalculator();
        int n = 1;
        while(n!=5){
            System.out.println("\nEnter your choice");
            System.out.println("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 to exit ");
            n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.print("Addition:");
                    System.out.println(msc.add(a,b));
                    continue;
                case 2:
                    System.out.print("Subtraction:");
                    System.out.println(msc.sub(a,b));
                    continue;
                case 3:
                    System.out.print("Multiplication:");
                    System.out.println(msc.mul(a,b));
                    continue;
                case 4:
                    System.out.print("Division:");
                    System.out.println(msc.div(a,b));
                    continue;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }


    }
}
