package task.opps;

/**
 * Interface:- collection of abstract classes.
 */
interface FirstInterface {
    void myMethod();
}
interface SecondInterface {
    void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    @Override
    public void myMethod() {
        System.out.println("Some text..");
    }
    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

/**
 * Abstract class.
 * @abstractShape is an abstract method which using we can be accessing the multiple inheritance.
 */

abstract class abstractShape{
    abstract void draw();
}

    /**
     * implementation is provided by others i.e. unknown by end user
     */

class abstractRectangle extends abstractShape{
    void draw(){System.out.println("drawing rectangle");}
}

class Circle1 extends abstractShape{
    void draw(){System.out.println("drawing circle");}
}

    /**
     * method is called by programmer or user
     */

class TestAbstraction1{
    public static void main(String args[]){
        abstractShape s = new Circle1();//object is provided through method, e.g., getShape() method
        s.draw();
    }
}