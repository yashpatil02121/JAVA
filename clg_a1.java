package com.company;
import java.util.Scanner;

public class clg_a1 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Year: ");
        int Year=Sc.nextInt();
        if (Year%4==0)
        {
            System.out.println("Entered year is a Leap year");
        }
        else
        {
            System.out.println("Entered year is Not a Leap year");
        }
    }
}