package task.opps;

public class ConstructorExample {
    public static void main(String[] args) {
        //Default Constructor
        DefaultCon defaultCon = new DefaultCon();
        int ans  = defaultCon.a+ defaultCon.b;
        System.out.println("Default "+ans);

        //No - Argument
        NoArg noArg = new NoArg();
        int noArgsAns = noArg.a + noArg.b;
        System.out.println("No - Argument "+noArgsAns);

        //Parameterized
        Parameterized parameterized = new Parameterized(10,20);
        int peraAns = parameterized.a+ parameterized.b;
        System.out.println("Parameterized "+peraAns);
    }
}

class DefaultCon{
    //Default Constructor
    DefaultCon(){}
    int a = 10;
    int b = 20;
}

class NoArg{
    //No - Argument
    NoArg(){
        System.out.println("Ans is: ");
    }
    int a = 10;
    int b = 20;
}

class Parameterized{
    int a;
    int b;

    public Parameterized(int a, int b) {
        this.a = a;
        this.b = b;
    }
}