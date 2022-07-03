package com.company;

public class CWH_31_methods {
    static int logic(int x, int y)
    {
        int sum;
        sum=x+y;
        return sum;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        if (a>b)
        {
            c=a+b;
        }
        else
        {
            c=(a+b)*5;
        }
        int a1=2;
        int b1=1;
        int c1;
        if (a1>b1)
        {
            c1=a1+b1;
        }
        else
        {
            c1=(a+b)*5;
        }

        System.out.println(c);
        System.out.println(c1);
        System.out.println(logic(a,b));
    }
}
