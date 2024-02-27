package uvg.edu.gt;

public class SingleLinkedList<T> implements UVGLList<T>{
    private class Node<T>{
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
        if (head.next == null){
            head = null;
            return;
        }
        Node <T> curr = head;
        Node <T> prev = null;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
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
