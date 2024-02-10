package task.ExceptionHandling;

import java.util.Scanner;

public class CustomExcpDemo {
    public static void main(String[] args) {
        System.out.println("Program Start");
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 18) {

                throw  new CustomException("Not Eligiable to vote");
            }else {
                System.out.println("welcome to vote");
            }
        } catch (CustomException e) {
            System.out.println("Caught the exception");
            System.out.println(e);
        }

        System.out.println("Program Terminated...");

    }
}

class CustomException extends Exception{

    //constructor
    public CustomException(String str){
        super(str);
    }
}
