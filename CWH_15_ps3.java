package com.company;

import java.util.Locale;

public class CWH_15_ps3 {
    public static void main(String[] args) {
        // Q.1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Q.2
        String text = "To My   Friend";
        text = text.replace(" ","_");
        System.out.println(text);

        //Q.3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Harry");
        System.out.println(letter);

        //Q.4
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Q.5
        String myLetter = "Dear Harry, \n\tThis Java Course is Nice. \n\t\tThanks!";
        System.out.println(myLetter);

    }
}
