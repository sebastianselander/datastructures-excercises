package stacks_and_queues_exercises;

import java.util.Arrays;
import java.util.List;

public class BoundedQueueCircular<E> implements Queue<E>{

    private int size = 0;
    private int front = 0;
    private int back = 0;
    private Object[] array;

    public BoundedQueueCircular(int capacity){
        this.array = new Object[capacity];
    }

    @Override
    public void enqueue(E item) {
        if (size == array.length) throw new RuntimeException("Full queue");
        array[back] = item;
        back = increment(back);
        size++;
    }

    @Override
    public E dequeue() {
        if (size == 0) throw new RuntimeException("Empty queue");
        E item = (E) array[front];
        array[front] = null;
        front = increment(front);
        size--;
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    private int increment(int c){
        return (++c % array.length);
    }

    private int decrement(int c){
        return (--c % array.length);
    }

    public String toString(){
        return Arrays.toString(array);
    }
}
