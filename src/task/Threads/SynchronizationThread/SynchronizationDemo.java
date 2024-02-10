package task.Threads.SynchronizationThread;

public class SynchronizationDemo {
    public static void main(String[] args) {
        Company company = new Company();
        Procedure procedure = new Procedure(company);
        Concumer concumer = new Concumer(company);

        procedure.start();
        concumer.start();
    }
}
