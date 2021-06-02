package stacks_and_queues_exercises;

import java.util.Arrays;

public class UnboundedQueue<E> implements Queue<E> {

    private int capacity;
    private BoundedQueue<E> bq;

    public UnboundedQueue(){
        this.capacity = 10;
        this.bq = new BoundedQueue<>(capacity);
    }

    @Override
    public void enqueue(E item) {
        if (size() <= 0) {
            this.bq = doubleQueue();
        }
        bq.enqueue(item);
    }

    @Override
    public E dequeue() {
        return bq.dequeue();
    }

    @Override
    public int size() {
        return bq.size();
    }

    private BoundedQueue<E> doubleQueue(){
        BoundedQueue<E> newQ = new BoundedQueue<>(capacity*2);
        for (int i = 0; i < bq.size(); i++){
            newQ.enqueue(bq.dequeue());
        }
        return newQ;
    }

    public String toString(){
        return bq.toString();
    }
}
