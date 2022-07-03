package com.company;

import java.util.Scanner;
public class number_guess
{
    public static void main(String args[])
    {
        int attempt = 1;
        int guessedNumberByUser = 0;
        int expectedNumber = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Number guessing Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                guessedNumberByUser = userInput.nextInt();
                if (guessedNumberByUser == expectedNumber)
                {
                    System.out.println("Your Number is right. You Win the Game!");
                    break;
                }
                else if (guessedNumberByUser< expectedNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (guessedNumberByUser > expectedNumber)
                    System.out.println("Your Guess Number is Greater.");
                if(attempt == 5) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Guessed number is not valid integer");
                break;
            }
        } while (guessedNumberByUser != expectedNumber);
    }
}