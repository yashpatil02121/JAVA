package com.company;

public class CWH_17_logicals {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("For AND");
        if (a && b )
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }
        System.out.println("For OR");
        if (a || b )
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println("For NOT");
        System.out.print("Not(A) gives ");
        System.out.print(!a);
        System.out.print(("\nNot(B) gives "));
        System.out.print(!b);
    }
}
