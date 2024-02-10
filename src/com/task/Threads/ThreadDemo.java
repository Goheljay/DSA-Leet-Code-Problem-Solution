package task.Threads;

public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        ThreadDemo newThread = new ThreadDemo();
        Thread t1 = new Thread(newThread);
        AnotherThread t2 = new AnotherThread();
        t1.start();
        t2.start();
    }
}
