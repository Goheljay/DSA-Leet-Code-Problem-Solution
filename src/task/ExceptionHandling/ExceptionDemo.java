package task.ExceptionHandling;


import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
       int i = 5;
       int j = 2;
       int k = 0;
       int [] a = new int[4];
       try{

           k = i/j;

           for (int c = 0; c<= 4; c++){
                a[c] = c+1;
           }
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }catch (ArrayIndexOutOfBoundsException e){
           e.getMessage();
           System.out.println("Maximum value is: "+ Arrays.toString(a));
       }
        System.out.println(k);

    }
}
