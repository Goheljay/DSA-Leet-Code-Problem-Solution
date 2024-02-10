package task.Threads.SynchronizationThread;

class Company {
    int n;

    synchronized public void produce_item(int n){
        this.n = n;
        System.out.println("produce: "+n);
    }

    synchronized public int consume_item(){
        System.out.println("Consume: "+n);
        return this.n;
    }

}
