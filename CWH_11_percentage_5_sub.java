package com.company;

import java.util.Scanner;

public class CWH_11_percentage_5_sub {
    public static void main(String[] args) {
        System.out.println("enter subject 1 marks:");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        System.out.println("enter subject 2 marks:");
        int s2 = sc.nextInt();
        System.out.println("enter subject 3 marks:");
        int s3 = sc.nextInt();
        System.out.println("enter subject 4 marks:");
        int s4 = sc.nextInt();
        System.out.println("enter subject 5 marks:");
        int s5 = sc.nextInt();
        float sum = s1 + s2 + s3 + s4 + s5;
        float avg = sum/5;
        System.out.println("Marks obtained="+sum+"/500");
        System.out.println("You scored "+ avg + "%");
    }
}
