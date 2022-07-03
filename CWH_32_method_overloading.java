package com.company;

public class CWH_32_method_overloading {
    static void tellJoke()
    {
        System.out.println("I invented a new Word!\nPlagarism");
    }

    static void change(int n)
    {
        n=98;
    }

    static void change2(int [] arr)
    {
        arr[0]=98;
    }

    static void foo()
    {
        System.out.println("Good morning Bro!");
    }

    static void foo(int a)
    {
        System.out.println("Good morning "+a+" Bro!");
    }

    static void foo(int a,int b)
    {
        System.out.println("Good morning "+a+" Bro!");
        System.out.println("Good morning "+b+" Bro!");
    }

//    static int foo(int a,int b)     // wont execute
//    {
//        System.out.println("Good morning "+a+" Bro!");
//        System.out.println("Good morning "+b+" Bro!");
//        return a;
//    }

    public static void main(String[] args) {
//        tellJoke();

//        int x=45;
//        change(x);
//        System.out.println("The value after running change is "+marks[0]);

//        int [] marks ={52,75,77,89,98,94};
//        change2(marks);
//        System.out.println("The value after running change is "+marks[0]);

//        Method overloading
//        cant overload by changing only return types
        foo();
        foo(3000);
        foo(3000,5000);

    }
}
