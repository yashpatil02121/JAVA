package com.company;

class Employee1{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

class CellPhone{
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void vibrate()
    {
        System.out.println("Vibrating...");
    }
    public void callFriend()
    {
        System.out.println("Calling...");
    }
}

class Square{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}

class Rectangle{
    int length,breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}

class Tommy{
    public void hit()
    {
        System.out.println("Hitting the Enemy");
    }
    public void run()
    {
        System.out.println("Running the Enemy");
    }
    public void fire()
    {
        System.out.println("Firing the Enemy");
    }
}

public class CWH_39_CH8_ps {

    public static void main(String[] args) {
//        Q.1
//        Employee1 harry = new Employee1();
//        harry.setName("YashPatil");
//        harry.salary=500;
//        System.out.println(harry.getName());
//        System.out.println(harry.getSalary());

//        Q.2
//        CellPhone asus = new CellPhone();
//        asus.callFriend();
//        asus.vibrate();
//        asus.ring();

//        Q.3
//        Square sq = new Square();
//        sq.side=3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

//        Q.4
//        Rectangle rec = new Rectangle();
//        rec.length=6;
//        rec.breadth=4;
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());

//        Q.5
        Tommy pl1 = new Tommy();
        pl1.fire();
        pl1.run();
        pl1.hit();

    }
}
