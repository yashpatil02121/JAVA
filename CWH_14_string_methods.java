package com.company;

import java.util.Locale;

public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name = "HaRrY";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString="   Harry   ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(2,4));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("RrY","Ri"));

        System.out.println(name.startsWith("Ha")); //true
        System.out.println(name.endsWith("Ha"));  //false

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("r",3)); //starts from index 0
        System.out.println(name.lastIndexOf("r",2));  //starts from end of string

        System.out.println(name.equals("Harry")); // case sensitive
        System.out.println(name.equalsIgnoreCase("hArRy")); // irrespective of upper or lower case

        System.out.println("I am escape \t sequence \" double \\ quote");
    }
}
