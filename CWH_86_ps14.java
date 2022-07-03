package com.company;

import java.util.Scanner;

public class CWH_86_ps14 {
    public static void main(String[] args) {
//        Q.1
//        int a=7    ->  syntax error
//        int age = 78;
//        int year_born = 2000-78; // -> logical error
//        System.out.println(6/0);

//        Q.2
//        try{
//            int a = 666/0;
//        }
//        catch(IllegalAccessError e){
//            System.out.println("Hehe");
//        }
//        catch(ArithmeticException e){
//            System.out.println("Haha");
//        }

//        Q.3
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        int i=0;
        while(flag && i<4) {
            try {
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
    }
}
