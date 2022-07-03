package com.company;
import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
//        if(age>56)
//        {
//            System.out.println("You are experienced");
//        }
//        else if(age>36){
//            System.out.println("You are semi-experienced");
//        }
//        else
//        {
//            System.out.println("You are unexperienced");
//        }
//        if(age>2)
//        {
//            System.out.println("You are not a baby!");
//        }

        switch (age){
            case 18:
                System.out.println("You are going to become an Adult");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your Life!");
        }
        System.out.println("Thanks for using my Java code!");
    }
}
