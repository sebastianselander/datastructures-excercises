package stacks_and_queues_exercises;

public interface Queue<E> {
    void enqueue(E item);
    E dequeue();
    int size();
}
