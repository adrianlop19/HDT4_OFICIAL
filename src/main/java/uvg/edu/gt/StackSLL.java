package uvg.edu.gt;

public class StackSLL<T> implements UVGStack<T>{
    private SingleLinkedList<T> stack;
    public StackSLL(){
        stack = new SingleLinkedList<T>();
    }
    @Override
    public void push(T item) {
        stack.addLast(item);
    }

    @Override
    public T pop() {
        T tempItem = stack.getLast();
        stack.removeLast();
        return tempItem;
    }

    @Override
    public T peek() {
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}