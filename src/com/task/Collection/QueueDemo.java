package task.Collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        LinkedList<Integer> queueLinkList = new LinkedList<>();
        queueLinkList.offer(60);
        queueLinkList.offer(20);
        queueLinkList.offer(10);
        queueLinkList.offer(50);
        queueLinkList.offer(30);

        System.out.println(queueLinkList);

        queueLinkList.offerFirst(40);
        queueLinkList.offerLast(80);

        System.out.println(queueLinkList);

        queueLinkList.peek();
        queueLinkList.peekFirst();
        queueLinkList.peekLast();


    }
}

class PriorityQueueDemo{
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer(60);
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);
        queue.offer(40);

        System.out.println(queue);
        queue.stream().peek(x -> System.out.println(x)).findFirst().get();
        queue.poll();
        System.out.println(queue);
    }
}
