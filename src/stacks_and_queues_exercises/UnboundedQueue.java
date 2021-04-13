package stacks_and_queues_exercises;

import java.util.Arrays;

public class UnboundedQueue<E> implements Queue<E> {

    private int size = 0;
    private int front = 0;
    private int back = 0;
    private Object[] array;

    public UnboundedQueue() {
        this.array = new Object[10];
    }

    @Override
    public void enqueue(E item) {
        if (size == array.length) {
            copy();
        }
        array[back] = item;
        back++;
        size++;
    }

    @Override
    public E dequeue() {
        E item = (E) array[front];
        array[front] = null;
        front++;
        size--;
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    private void copy() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public String toString(){
        return Arrays.toString(array);
    }
}
