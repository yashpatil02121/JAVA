package com.company;

public class CWH_80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        //without TRY
//         int c  = a/b;
//        System.out.println("The result is "+ c);



        //with TRY
        try{
            int c = a/b;
            System.out.println("The result is "+ c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
