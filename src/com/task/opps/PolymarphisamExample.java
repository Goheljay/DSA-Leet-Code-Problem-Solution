package task.opps;

public class PolymarphisamExample {
    /**
     * there are two way todeclare the polymarphisam
     * 1. Compile time
     * 2. Run time
     */

    public static void main(String[] args) {

        /**
          Below both example of runtime polymorphism and method overriding
         */
        parent a = new subclass1();
        a.Print();

        parent b = new subclass2();
        b.Print();
    }
}

class parent{
    void Print(){
        System.out.println("Print parent class");
    }
}


class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}
class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}
class TestDog {
    public static void main(String args[]) {
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object
        a.move(); // runs the method in Animal class
        b.move(); // runs the method in Dog class
    }
}

class subclass1 extends parent{
    void Print(){
        System.out.println("Print subclass1");
    }
}

class subclass2 extends parent{
    void Print(){
        System.out.println("Print subclass2");
    }
}



class Helper{
    static void multiplication(int a, int b){
        System.out.println(a*b);
    }
    static void  multiplication(int a, int b, int c){
        System.out.println(a*b*c);
    }
}

class Main {
    public static void main(String[] args) {
        Helper.multiplication(2,3);
        Helper.multiplication(15,12,8);
    }
}
