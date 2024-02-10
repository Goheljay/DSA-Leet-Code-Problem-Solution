package task.Threads.SynchronizationThread;

public class Concumer extends Thread{
    Company c;

    Concumer(Company c){
        this.c = c;
    }

    @Override
    public void run() {
        int i = 1;
        while (true){
            this.c.consume_item();
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
