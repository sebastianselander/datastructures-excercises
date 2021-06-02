package linked_list_exercises;

public class Main {
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.addAfter(2);
        node = node.next;
        node.addAfter(3);
        node = node.next;
        node.addAfter(4);
        node = node.next;

        System.out.println(node.next.data);
    }
}
