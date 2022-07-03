package com.company;
import java.util.Scanner;
public class CWH_19_CH4_ps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Q.1
        // I am not 11

        //Q.2
//        byte p,c,m;
//        System.out.println("Enter Physic's Marks:");
//        p = sc.nextByte();
//
//        System.out.println("Enter Chemistry's Marks:");
//        c = sc.nextByte();
//
//        System.out.println("Enter Mathematics's Marks:");
//        m = sc.nextByte();
//
//        float avg = ( p + c + m )/3.0f;
//        if (avg>40 && p>33 && c>33 && m>33)
//        {
//            System.out.println("Congratulations!! You have been Promoted.");
//        }
//        else
//        {
//            System.out.println("Sorry. You have not been Promoted. Please try again.");
//        }
//        System.out.println("You scored "+avg+"%");

        //Q.3
//        float tax=0;
//
//        System.out.println("Enter you income in lakhs per annum:");
//        float income = sc.nextFloat();
//
//        if(income<=2.5)
//        {
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f)
//        {
//            tax = tax+ 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10f)
//        {
//            tax = tax+ 0.05f * (5.0f - 2.5f);
//            tax = tax+ 0.2f * (income - 5f);
//        }
//        else if(income>10f)
//        {
//            tax = tax+ 0.05f * (5.0f - 2.5f);
//            tax = tax+ 0.2f * (income - 5f);
//            tax = tax+ 0.3f *(income-10f);
//        }
//        System.out.println(tax);

        //Q.4
//        int day = 5;
//        switch (day)
//        {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //Q.5
//        int year;
//        System.out.println("Enter a year:");
//        year = sc.nextInt();
//        boolean leap= false;
//        if (year%4==0)
//        {
//            leap=true;
//            System.out.println("It is a Leap Year");
//        }
//        else
//        {
//            System.out.println("Not a Leap Year");
//        }

        //Q.6
        System.out.println("Enter your Website:");
        String website = sc.next();

        if (website.endsWith(".org"))
        {
            System.out.println("This is an Organisation website");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("This is an Commercial website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian website");
        }

    }
}
