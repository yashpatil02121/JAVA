package com.company;
import java.util.Scanner;
public class Exp6A {
    public static void main(String[] args) {
        int m, n, p, q, i, j, k, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix");
        m = in.nextInt();
        System.out.println("Enter the number of columns of first matrix");
        n = in.nextInt();
        int first[][] = new int[m][n];
        System.out.println("Enter elements of first matrix");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                first[i][j] = in.nextInt();
        System.out.println("Enter the number of rows of second matrix");
        p = in.nextInt();
        System.out.println("Enter the number of columns of second matrix");
        q = in.nextInt();
        int second[][] = new int[p][q];
        int multiply[][] = new int[m][q];
        System.out.println("Enter elements of second matrix");
        for (i = 0; i < p; i++)
            for (j = 0; j < q; j++)
                second[i][j] = in.nextInt();
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++) {
                for (k = 0; k < p; k++) {
                    sum = sum + first[i][k] * second[k][j];
                }
                multiply[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("Product of the matrices:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++)
                System.out.print(multiply[i][j] + "\t");
            System.out.print("\n");
        }
    }
}

