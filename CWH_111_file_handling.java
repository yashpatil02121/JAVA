package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_file_handling {
    public static void main(String[] args) {

        //create
//        File myFile = new File("cwh111file.txt");
//        try{
//            myFile.createNewFile();
//        }
//        catch(IOException e){
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }

        //write
//        try {
//            FileWriter filewriter = new FileWriter("cwh111file.txt");
//            filewriter.write("This is our first file from this java course\nOkay now bye ");
//            filewriter.close();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }

        //reading
//        File myFile = new File("cwh111file.txt");
//        try{
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                String Line = sc.nextLine();
//                System.out.println(Line);
//            }
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        //delete
        File myFile = new File("cwh111file.txt");
        if (myFile.delete()){
            System.out.println("I have deleted : "+myFile.getName());
        }
        else{
            System.out.println("Some error occured while deleting a File");
        }


    }
}
