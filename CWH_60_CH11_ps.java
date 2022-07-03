package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("Refilling");
    }
    void changeNib() {
        System.out.println("Changing the Nib");
    }
}

class Monkey{
    public void jump(){
        System.out.println("jumping...");
    }
    public void bite(){
        System.out.println("bitting..");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}

public class CWH_60_CH11_ps {
    public static void main(String[] args) {
        // Q.1 Q.2
//        FountainPen pen = new FountainPen();
//        pen.changeNib();

        //Q.3
//        Human H = new Human();
//        H.sleep();

        //Q.5
        Monkey m = new Human();
//        m.speak();   --> cannot use speak method because the reference is monkey which doe not have speak method

        BasicAnimal luv = new Human();
//        luv.speak();  --> error
        luv.eat();
        luv.sleep();

    }
}
