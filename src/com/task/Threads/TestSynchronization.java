package task.Threads;

class Table{
    synchronized void printTable(int n){
        for (int i=1; i<5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread{

    Table t;
    MyThread1(Table t){
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}
public class TestSynchronization {
    public static void main(String[] args) {
        Table newTable = new Table();

        MyThread1 thread1 = new MyThread1(newTable);
        MyThread2 thread2 = new MyThread2(newTable);

        thread1.start();
        thread2.start();
    }
}
