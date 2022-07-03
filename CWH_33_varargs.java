package com.company;

public class CWH_33_varargs {

    static int sum(int x, int ...arr)
    {
        int result=x;
        for (int a:arr)
        {
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("The sum of 4 and 8 is "+sum(4,8));
        System.out.println("The sum of 4,7 and 8 is "+sum(4,7,8));
        System.out.println("The sum of 4,5,6 and 8 is "+sum(4,5,6,8));
        System.out.println("The sum of 4,5,6,7 and 8 is "+sum(4,5,6,7,8));

    }
}
