package uvg.edu.gt;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArrayList<T> implements UVGStack<T> {
    ArrayList<T> arrayList;

    public StackArrayList() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        arrayList.add(item);
    }

    @Override
    public T pop() {
        T tempItem = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return tempItem;
    }

    @Override
    public T peek() {
        if (arrayList.isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

}
