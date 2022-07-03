package com.company;

import javax.swing.*;

public class CWH_35_ps_methods {
//Q.1
    static void multiply(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }
    }

//    Q.2
    static void pattern(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Q.3
    static int sumrec(int n)
    {
        if(n==1)
            return 1;
        else
            return n + sumrec(n-1);
    }

//    Q.4
static void pattern2(int n)
{
    for (int i=n;i>0;i--)
    {
        for (int j=0;j<i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}

//Q.5
    static int fibonacci_series(int n)
    {
        if(n<=2)
            return n-1;

        else
            return fibonacci_series(n-1) + fibonacci_series(n-2);

    }

//    Q.6
    static float average(int ...arr)
    {
        int sum=0;
        float avg;
        float k=0;
        for (int i:arr)
        {
            sum += i;
            k++;
        }
        avg=(sum/k);
        return avg;
    }

//    Q.8
    static void pattern_rec(int n)
    {
        if (n>0) {
            pattern_rec(n-1);
            for (int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//    multiply(7);
//        pattern(9);
//        System.out.println(sumrec(4));
//        pattern2(5);
//        System.out.println(fibonacci_series(5));
//        System.out.println(average(3,4,5,6,7,8,9));
        pattern_rec(3);

    }
}
