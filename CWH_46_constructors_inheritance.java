package com.company;

class Base1{
    public int x;
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value a as:"+x);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    Derived1(){
//    super(8);
    System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor with value y as:"+y);
    }


}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of Derived with value of z as:"+z);
    }
}

public class CWH_46_constructors_inheritance {
    public static void main(String[] args) {
//    Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(4,9);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(3,4,5);
    }
}
