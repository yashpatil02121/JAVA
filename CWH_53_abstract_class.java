package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("mein base2 ka constructor hoom");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class CWH_53_abstract_class {
    public static void main(String[] args) {
        Child c = new Child();
//        Child2 c2 = new Child2();
    }
}
