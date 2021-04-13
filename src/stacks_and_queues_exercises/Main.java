package stacks_and_queues_exercises;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> CircularQueue = new BoundedQueueCircular<>(10);
        CircularQueue.enqueue(5);
        CircularQueue.enqueue(10);

        System.out.println(CircularQueue.toString());
        System.out.println(CircularQueue.dequeue());
        System.out.println(CircularQueue.toString());

        System.out.println("------------------------------------------------------------------------------");

        Queue<Integer> UnboundedQueue = new UnboundedQueue<>();
        UnboundedQueue.enqueue(1);
        System.out.println(UnboundedQueue.toString());
        UnboundedQueue.enqueue(2);
        UnboundedQueue.enqueue(3);
        UnboundedQueue.enqueue(4);
        UnboundedQueue.enqueue(5);
        UnboundedQueue.enqueue(6);
        UnboundedQueue.enqueue(7);
        UnboundedQueue.enqueue(8);
        UnboundedQueue.enqueue(9);
        UnboundedQueue.enqueue(10);
        UnboundedQueue.enqueue(11);
        System.out.println(UnboundedQueue.toString());
        System.out.println(UnboundedQueue.dequeue());
        System.out.println(UnboundedQueue.toString());
        UnboundedQueue.enqueue(12);
        UnboundedQueue.enqueue(13);
        System.out.println(UnboundedQueue.toString());
        UnboundedQueue.dequeue();
        UnboundedQueue.dequeue();
        UnboundedQueue.dequeue();
        System.out.println(UnboundedQueue.toString());
    }
}
