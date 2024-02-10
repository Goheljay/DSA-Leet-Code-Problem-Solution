package task.FileIo;

import java.io.*;
import java.util.Scanner;

public class StudentFind {
    public static void main(String[] args) throws IOException {
        RegisterStudent register = new RegisterStudent();
        SearchStudent search = new SearchStudent();

        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Register Student :");
        System.out.println("2 : search by studentname :");
        System.out.println("3 : exit this form : ");


        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                register.write();
                break;
            case 2:
                search.search();
                break;
            default:
                System.out.println("Exit");
                break;
        }
    }
}


class SearchStudent {
    public void search() throws IOException {
        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader bfr1 = new BufferedReader(isr1);
        FileReader fr = new FileReader("student.txt");
        BufferedReader bfw1 = new BufferedReader(fr);
        System.out.print("Search by name");
        String name = bfr1.readLine();
        String line;
        boolean result = true;
        while ((line = bfw1.readLine()) != null) {
            String word[] = line.split(" ");
            for (int i = 0; i < word.length; i++) {
                if (word[i].equalsIgnoreCase(name)) {
                    System.out.println("your finding result is : " + result);
                    System.out.println(line);
                }
            }
        }
        bfw1.close();
        fr.close();
        bfr1.close();
        isr1.close();
    }
}

class RegisterStudent {
    public void write() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        FileWriter fw = new FileWriter("Student.txt", true);
        BufferedWriter bfw = new BufferedWriter(fw);
        System.out.print("Enter your name");
        String name = bfr.readLine();

        System.out.print("Enter your Lastname");
        String lname = bfr.readLine();
        bfw.write(name);
        bfw.write(" ");
        bfw.write(lname);
        bfw.newLine();
        bfw.close();
        fw.close();
        bfr.close();
        isr.close();
    }
}




