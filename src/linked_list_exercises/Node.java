package linked_list_exercises;

public class Node<E> {
    Node<E> next, prev;
    E data;

    public Node(E data) {
        this.data = data;
        this.next = this;
        this.prev = this;
    }

    void addAfter(E data) {
        Node<E> newNode = new Node<>(data);
        this.next.prev = newNode;
        newNode.next = this.next;
        newNode.prev = this;
        this.next = newNode;

    }
}
