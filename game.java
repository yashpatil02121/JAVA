package com.company;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the item from menu:\t");
        System.out.println("1:Rock");
        System.out.println("2:Paper");
        System.out.println("3:Scissor");
        int item = s.nextInt();
        String [] arr = {"Rock", "Paper", "Scissor"};
        Random random = new Random();
        int select = random.nextInt(arr.length) +1;

        if(item==1)
            System.out.println("Player:Rock");
        if(item==2)
            System.out.println("Player:Paper");
        if(item==3)
            System.out.println("Player:Scissor");

        if(select==1)
            System.out.println("PC:Rock");
        if(select==2)
            System.out.println("PC:Paper");
        if(select==3)
            System.out.println("PC:Scissor");
        if (item==1)
        {
            if(select==2)
                System.out.println("You Lose");
            else if (select==3)
                System.out.println("You Win");
            else
                System.out.println("Tie");
        }
        if(item==2)
        {
            if(select==1)
                System.out.println("You Win");
            else if (select==3)
                System.out.println("You Lose");
            else
                System.out.println("Tie");
        }
        if (item==3)
        {
            if (select==1)
                System.out.println("You Lose");
            else if (select==2)
                System.out.println("You Win");
            else
                System.out.println("Tie");
        }
    }
}