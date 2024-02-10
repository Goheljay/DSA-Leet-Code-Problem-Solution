package task.Threads;

import java.util.Scanner;

class SetBooking{
    int totalSeats = 10;
    synchronized public void setBook(int numberSeats){

        if (numberSeats <= totalSeats){
            totalSeats=totalSeats-numberSeats;
            System.out.println("Your "+numberSeats+" number of sets Booked");
            System.out.println("Available Seats: "+ totalSeats);
        }else {
            System.out.println("Seats are Full");
        }
    }
}

class SetBooking1 extends Thread{

    SetBooking setBooking;
    int numberSeats;
    SetBooking1(SetBooking setBooking,int numberSeats){
        this.numberSeats = numberSeats;
        this.setBooking = setBooking;
    }

    @Override
    public void run() {
        setBooking.setBook(numberSeats);
    }
}


public class SetBookingSystem {

    public static void main(String[] args) {
        SetBooking sets = new SetBooking();
        int userSeats=0;
        Scanner sc = new Scanner(System.in);

        while (sets.totalSeats >= userSeats){
            System.out.println("Enter your Seats: ");
            userSeats = sc.nextInt();
            SetBooking1 booking1 = new SetBooking1(sets,userSeats);
            booking1.start();
        }
//        SetBooking1 booking3 = new SetBooking1(sets,1);
//        booking3.start();
//
//        SetBooking1 booking2 = new SetBooking1(sets,4);
//        booking2.start();
    }
}
