package task.Collection;

import java.util.ArrayDeque;

public class ArrayDeadQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> queues = new ArrayDeque<>();
        queues.offer(23);
        queues.offer(12);
        queues.offer(45);
        queues.offer(26);
        queues.offer(33);

        System.out.println(queues);

        queues.poll();
        System.out.println(queues);

        System.out.println(queues.peek());

    }
}
