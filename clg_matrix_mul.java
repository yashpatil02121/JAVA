package com.company;

import java.util.Scanner;

public class clg_matrix_mul {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int c[][]=new int[3][3];

        System.out.println("Entering elements");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Enter A"+i+j+":");
                a[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Enter B"+i+j+":");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The multiplied matric is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}


