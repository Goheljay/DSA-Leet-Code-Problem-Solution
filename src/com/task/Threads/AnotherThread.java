package task.Threads;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        for (int i=10; i >= 1; i--){
            System.out.println("thread 2: "+i);

        }
    }
}
