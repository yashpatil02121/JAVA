package com.company;

class ps13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning ");
        }
    }
}

class ps13b extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome ");
        }
    }
}

public class CWH_76_ps13 {
    public static void main(String[] args) {
        ps13 p1 = new ps13();
        ps13b p2 = new ps13b();
        p1.start();

    }
}
