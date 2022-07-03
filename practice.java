package com.company;

class math{
    int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return fact(n) * fact(n - 1);
        }

    }
}

public class practice {
    public static void main(String[] args) {
        math fac = new math();
        int r = fac.fact(6);
        System.out.println(r);
    }
}
