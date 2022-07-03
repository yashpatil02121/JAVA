package com.company;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();

        System.out.println("Enter + to add, - to sub, * to mul, / to div, % to mod, s to square");
        String choice=sc.next();
        float result;

        switch(choice)
        {
            case "+":
                result= a+b;
                System.out.println(a+"+"+b+"="+result);
                break;

            case "-":
                result= a-b;
                System.out.println(a+"-"+b+"="+result);
                break;

            case "*":
                result= a*b;
                System.out.println(a+"x"+b+"="+result);
                break;

            case "/":
                result= (float)a/b;
                System.out.println(a+"/"+b+"="+result);
                break;

            case "%":
                result= a%b;
                System.out.println(a+"%"+b+"="+result);
                break;

            case "s":
                result= a*a;
                System.out.println(a+"*"+a+"="+result);
                result= b*b;
                System.out.println(b+"*"+b+"="+result);
                break;


        }

    }
}
