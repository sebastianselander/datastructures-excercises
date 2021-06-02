package linked_list_exercises;

public class LinkedList<E> {

    Node<E> first;

    public LinkedList(){

    }

    public void append(E value){
        if (first == null){
            first = new Node<>(value);
        } else {
            while (first.next != null){
                first = first.next;
            }
            first.addAfter(value);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        while(first != null){
            sb.append(first.data.toString());
            first = first.next;
        }
        return sb.toString();
    }
}
