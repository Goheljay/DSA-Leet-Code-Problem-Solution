package com.opps;

public class oppsClass {
    public static void main(String[] args) {

        //Class, Object
        Cars car = new Cars();
        car.Name="Bugatti";
        car.engine();
        car.style();

    }
}
class Vehicals {
    String Name;
    void engine(){
        System.out.println(Name+" Engine Start");
    }
}
class Cars extends Vehicals{
    void style(){
        System.out.println(Name+" is a Sports Car");
    }
}
