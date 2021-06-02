package stacks_and_queues_exercises;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> bQueue = new BoundedQueue<>(10);
        for (int i = 1; i <= 10; i++){
            bQueue.enqueue(i);
        }
        System.out.println(bQueue.toString());
        System.out.println(bQueue.size());

        System.out.println("------------------------------------------------------------------------------");

    }
}
