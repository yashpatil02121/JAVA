package com.company;

public class CWH_10_resulting_data_type {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 6;
//        short z = 8;
//        int a = 45 + 4;
//        float b = 6.54f + x;
//        System.out.println(b);
        int i = 56;
        int b = i++;         //first b is assigned i then i is incremented
        int j = 67;
        int c = ++j;         //first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);

    }
}
