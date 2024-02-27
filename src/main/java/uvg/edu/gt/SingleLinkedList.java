package uvg.edu.gt;

public class SingleLinkedList<T> implements UVGLList<T>{
    private class Node<T>{
        /*
        Single Linked List Node
        No utiliza key, solo guarda data, porque no voy a hacer
        search.
         */
        public T data;
        public Node<T> next = null;
        public Node(T cData){
            data = cData;
        }
    }
    private Node<T> head = null;
    @Override
    public void addLast(T item) {
        Node <T> newNode = new Node<T>(item);
        if (head == null){
            head = newNode;
        } else {
            Node <T> curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    @Override
    public void removeLast() {
        Node <T> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr = null;
    }

    @Override
    public T getLast() {
        Node <T> curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        return curr.data;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }
}
