package uvg.edu.gt;

public interface UVGLList<T> {
    public void addLast(T item);
    public void removeLast();
    public T getLast();
    public boolean isEmpty();
}