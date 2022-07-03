package com.company;
public class Exp4 {
        String pname , address;
        Exp4()
        {
            pname = "unknown";
            address = "NA";
            System.out.println("The name of the student is - : "+ pname);
            System.out.println("The address of the student is - : "+ address);
        }
        Exp4(String name, String addr)
        {
            System.out.println("The name of the student is - : "+ name);
            System.out.println("The address of the student is - : "+ addr);
        }
        public static void main(String args[])
        {
            Exp4 p= new Exp4();
            Exp4 p1= new Exp4("Yash Patil", "Bhayandar East");
            System.out.println();

        }
    }