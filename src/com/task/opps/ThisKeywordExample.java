package task.opps;

public class ThisKeywordExample {
    public static void main(String[] args) {
        A a = new A();
        A b  = new A();
        A c = new A(10);
        a.n();
        System.out.println(A.count);

    }
}
class A{
    static int count;
    A(){
        count++;
    }
    int val;

    public A(int val) {
        this();
        this.val = val;
    }

    void m(){
        System.out.println("M value" + val);
    }
    void  n(){
        System.out.println("N value");
        m();
    }
}



