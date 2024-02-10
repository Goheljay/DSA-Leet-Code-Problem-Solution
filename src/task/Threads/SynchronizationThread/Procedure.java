package task.Threads.SynchronizationThread;

public class Procedure extends Thread{

    Company c;
    Procedure(Company c){
        this.c = c;
    }

    @Override
    public void run() {
        int i = 1;
        while (true){
            this.c.produce_item(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
