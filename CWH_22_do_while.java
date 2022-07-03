package com.company;

public class CWH_22_do_while {
    public static void main(String[] args) {
        int a = 10;
        while(a<5)
        {
            System.out.println(a);
            a++;
        }
        do {
            System.out.println(a);
            a++;
        }while(a<5);

        //Q.Q
        int n=30;
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=n);

    }
}
