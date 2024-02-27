package uvg.edu.gt;

public class StackLL<T> implements UVGStack<T>{
    private UVGLList<T> stack;
    private LListFactory<T> listFactory;
    public StackLL(String type){
        listFactory = new LListFactory<>();
        stack = listFactory.createList(type);
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