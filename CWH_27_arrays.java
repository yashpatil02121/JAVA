package com.company;

public class CWH_27_arrays {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79, 99, 80};
//        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
//        String [] students= {"Harry","Yash","Rohan","Lovish"};
        System.out.println(marks.length);
//        System.out.println(students[2]);

//        Displaying the array (Naive way)
        System.out.println("printing using naive");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

//        Displaying the array (For loop)
        System.out.println("printing using for loop");
        for(int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("reverse order");
        for (int i=marks.length-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }
        for (int element: marks)
        {
            System.out.println(element);
        }
    }
}
