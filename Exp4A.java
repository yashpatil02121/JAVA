package com.company;
import java.util.*;
public class Exp4A {
    static float cal_area(float a){
        return(a*a);
    }
    static float cal_area(float a,float b){
        return(a*b);
    }
    static double cal_area(double a){
        return (3.14*a*a);
    }
    static double cal_area(double a,double b){
        return (0.5*a*b);
    }
    static float cal_area(float a,float b,float c){
        return(float)(c*(a+b)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AREA OF SQUARE\nEnter the value of side of square:");
        float s = sc.nextFloat();
        System.out.println("Area of square is:" + cal_area(s));
        System.out.println("AREA OF RECTANGLE\nEnter the length and breadth of rectangle:");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area of rectangle is:" + cal_area(l, b));
        System.out.println("AREA OF CIRCLE\nEnter the radius of the circle:");
        double r = sc.nextDouble();
        System.out.println("Area of circle is:" + cal_area(r));
        System.out.println("AREA OF TRIANGLE\nEnter the base and height of triangle:");
        double base = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of triangle is:" + cal_area(base, h));
        System.out.println("AREA OF TRAPEZOID\nEnter the bases and height of trapezoid:");
        float b1 = sc.nextFloat();
        float b2 = sc.nextFloat();
        float h1 = sc.nextFloat();
        System.out.println(("Area of trapezoid is:" + cal_area(b1, b2, h1)));
    }
}