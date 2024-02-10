package task.FileIo;

import java.io.*;
import java.util.Scanner;

public class FileIoDemo {
    public static void main(String[] args) throws Exception{
        //Creat File
        String fileName = "E:\\tutorials\\daily-Dsa\\src\\task\\FileIo\\test.txt";
        File f = new File(fileName);
        f.createNewFile();

        //File output Stream
        FileOutputStream write = new FileOutputStream(fileName);
        BufferedOutputStream bout=new BufferedOutputStream(write);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        write.close();
        System.out.println("success");

        //usign file
        FileWriter myfile = new FileWriter(fileName);
        myfile.write("Hello My self Jay Gohel");
        myfile.close();

        //Read File usign file Input Stream
        FileInputStream read = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(read);
        int i;
        while ((i = bis.read())!= -1){
            System.out.print((char)i);
        }
        bis.close();
        read.close();
        System.out.println("\n");

        //separator
        for (int j = 0; j< 100; j++){
            System.out.print("*");
        }
        System.out.println();

        //read using File function
        File fileReader = new File(fileName);
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }

        //usign inbult file reader
        FileReader fileRead = new FileReader(fileName);
        Scanner scRead = new Scanner(fileRead);
        while (scRead.hasNext()){
            System.out.println(scRead.nextLine());
        }

        //create directory
        String dirname = "E:\\tutorials\\daily-Dsa\\src\\task\\FileIo\\dir";
        File makedir = new File(dirname);
        makedir.mkdirs();

        //List dir

        String listDirt = "E:\\tutorials\\daily-Dsa\\src\\task\\FileIo";

        File listDir = new File(listDirt);
        String[] path = listDir.list();
        for (String dirNames: path) {
            System.out.println(dirNames);
        }


    }

}
