package com.FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class creatingFile {
    public static void main(String[] args) {

        //Creating File in FileIO
        try {
            File myfile = new File("hello.txt");
            myfile.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }

        //Write in file
        try{
            FileWriter myfile = new FileWriter("hello.txt");
            myfile.write("Hello My self Jay Gohel");
            myfile.close();
        }catch (Exception e){
            System.out.println("Not modified");
            e.printStackTrace();
        }

        //File reader
        try{
            //You can read two-way
            //1. using simple File
            File fileReader = new File("hello.txt");
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            //separator
            for (int i = 0; i< 100; i++){
                System.out.print("*");
            }
            System.out.println();

            //2. Using FIle Reader
            FileReader fileRead = new FileReader("hello.txt");
            Scanner scRead = new Scanner(fileRead);
            while (scRead.hasNext()){
                System.out.println(scRead.nextLine());
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        // Deleting File
        File filedelete = new File("hello.txt");
        filedelete.delete();

    }
}
