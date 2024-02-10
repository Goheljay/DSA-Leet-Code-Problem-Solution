package task.opps;

/**
 * Simple Inheritance.
 * developer class extend the person class so developer is child of person.
 */


public class Inheritanc {
    public static void main(String[] args) {
        Developer d1 = new Developer("Jay", 21);
        /**
         * walk function come from person class.
         * eat function come from person class.
         * step function come from developer class.
         */
        d1.walk();
        d1.eat();
        d1.step(30);
    }
}
class Developer extends person{

    /**
     * it is the parameterised constructor of developer class which is the property of person class.
     */
    public Developer(String name, int age) {
        super(name, age);
    }

    void step(int step){
        System.out.println(name+" is walk "+step);
    }
}
class person{
    String name;
    int age;

    public person(String name, int age) {   // Parameterised Constructor
        this.name = name;
        this.age = age;
    }
    void walk(){
        System.out.println(name + " is Walking");
    }
    void eat(){
        System.out.println(name + " is Eating");
    }
}
