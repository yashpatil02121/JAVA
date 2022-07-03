package com.company;
class Exp9
{
    public static void main(String args[])
    {
        Results s=new Results();
        s.getMarks(22.5,50);
        s.display();
    }
}
class Test extends Student
{
    double Marks1,Marks2;
    void getMarks(double M1,double M2)
    {
        Marks1=M1;
        Marks2=M2;
    }
    void displayMarks()
    {
        System.out.println("Marks obtained:");
        System.out.println("Sub 1="+Marks1);
        System.out.println("Sub 2="+Marks2);
    }
}

interface Activity
{
    double activitywt=7;
    void displaywt();
}
class Results extends Test implements Activity
{
    double total;
    public void displaywt()
    {
        System.out.println("Activity weightage="+activitywt);
    }
    void display()
    {
        total=Marks1+Marks2+activitywt;
        displayMarks();
        displaywt();
        System.out.println("Total marks:"+total);
    }
}
class Student1
{
    int r_no;
    void getNumber(int n)
    {
        r_no=n;
    }
    void displayNumber()
    {
        System.out.println("Roll no:" +r_no);
    }
}