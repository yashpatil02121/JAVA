package com.company;

class Area{
    public void cal_area(int side){
        System.out.println("Area of a square is "+(side*side));
    }
    public void cal_area(int length, int breadth){
        System.out.println("Area of a rectangle is "+(length*breadth));
    }
    public void cal_area(double pi,int radius){
        System.out.println("Area of a circle is " + (pi*radius*radius));
    }
    public void cal_area(double base, double height){
        System.out.println("Area of triangle is "+(0.5*base*height));
    }
    public void cal_area(int base1, int base2, int height){
        System.out.println("Area of trapezoid is "+((base1+base2)/2.0)*height);
    }
}

class Student{
    Student(){
        System.out.println("Name:     Unknown");
        System.out.println("Address:  Unknown");
    }
    Student(String name, String address){
        System.out.println("Name:   "+name);
        System.out.println("Address:  "+address);
    }

}

public class clg_overloading {
    public static void main(String[] args) {
        Area a = new Area();
        a.cal_area(5);
        a.cal_area(4,6);
        a.cal_area(3.142,5);
        a.cal_area(7.8,5.6);
        a.cal_area(5,6,7);

        Student s1 = new Student();
        Student s2 = new Student("  Yash","Vcet");

    }
}
