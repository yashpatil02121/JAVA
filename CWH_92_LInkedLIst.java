package com.company;

import java.util.*;

public class CWH_92_LInkedLIst {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();

        l2.add(16);
        l2.add(18);
        l2.add(13);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(7);
        l1.add(0,5);
        l1.add(0,1);

        l1.addAll(0,l2);  // to add from start..
        l1.addAll(l2);  // to add at end..

        l1.addLast(576);

//        l1.clear();   //cleans the array.

        System.out.println(l1.contains(27));

        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(7));

        l1.set(1,567);

        for (int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }

        System.out.println(l1);

    }
}
