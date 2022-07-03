package com.company;
import java.util.Random;
import java.util.Scanner;
public class CWH_20_rock_paper_scissor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    int i = 1;
    while(i<6) {
        System.out.println("Enter '1' for ROCK, '2' for PAPER and '3' for SCISSOR");
        int player = sc.nextInt();
        int comp = r.nextInt(4);

        if (comp == player) {
            System.out.println("It is a TIE!!");
        } else if (comp == 1 && player == 2 || comp == 2 && player == 3 || comp == 3 && player == 1) {
            System.out.println("You WON!!");
        } else if (comp == 2 && player == 1 || comp == 3 && player == 2 || comp == 1 && player == 3) {
            System.out.println("Computer WON!!");
        } else {
            System.out.println("INVALID ENTRY!!!");
        }
        i++;
    }

    }
}
