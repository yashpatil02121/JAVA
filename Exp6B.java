package com.company;
import java.util.*;
public class Exp6B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name=sc.nextLine();
        System.out.println("The length of the string is:"+name.length());
        System.out.println("The string starts with Sa:"+name.startsWith("Sa"));
        System.out.println("The string ends with dd:"+name.endsWith("dd"));
        System.out.println("Character at position 7 is:"+name.charAt(7));
        System.out.println("Index of k in the string is:"+name.indexOf("k"));
        System.out.println("The string in lowercase is:"+name.toLowerCase());
        System.out.println("The string in uppercase is:"+name.toUpperCase());
        System.out.println("A substring from index 0 to 6 is:"+name.substring(0,6));
        System.out.println("Index of s from 2 is: "+name.indexOf("s", 2));
        System.out.println("Last index of s from 5 is:"+name.lastIndexOf("s", 5));
        System.out.println("After replacing i with e:"+name.replace('i','e'));
        System.out.print("Enter a string to concatenate:");
        String s=sc.nextLine();
        String r= s.concat(name);
        System.out.println("Concatenated string: "+r);
    }
}
