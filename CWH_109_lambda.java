package com.company;

interface DemoAno{
    void meth1();
    void meth2();
}

class AnonyDemo implements DemoAno {
    public void display() {
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I m meth1");
    }

    @Override
    public void meth2() {
        System.out.println("I m meth2");
    }

    public class CWH_109_lambda {
    }
        public static void main(String[] args) {
            AnonyDemo obj = new AnonyDemo();
            obj.meth1();

        }
    }
