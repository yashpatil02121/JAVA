package com.company;

import java.util.Scanner;

public class clg_classes_objects {

    class student{
        String s_name;
        int s_no;
        int total_marks;
        int obtained_marks;
        float percent;

//        void cal1()
//        {
//            percent=total_marks/obtained_marks;
//            return percent;
//        }

        //default
        void cal1()
        {
            percent=obtained_marks*100/total_marks;
            System.out.println("Name:"+s_name+"Roll no:"+s_no+"Percentage:"+percent);
        }

        //return type
        float cal2()
        {
            return obtained_marks*100/total_marks;
        }

        //parameter
        void cal3(String s, int r, int t, int ob)
        {
            s_name=s;
            s_no=r;
            total_marks=t;
            obtained_marks=ob;
        }



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    }
}
