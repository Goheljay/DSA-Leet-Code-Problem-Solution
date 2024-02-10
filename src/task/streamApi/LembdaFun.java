package task.streamApi;

/**
 * Implement Interface using Lembda function
 */
public interface  LembdaFun{
//    void walk(int step, String name);
    int subtract(int s1,int s2);
}
class main{
    public static void main(String[] args) {
        LembdaFun lembdaFun = (s1,s2) -> s1-s2;

        System.out.println(lembdaFun.subtract(5,5));

    }
}
