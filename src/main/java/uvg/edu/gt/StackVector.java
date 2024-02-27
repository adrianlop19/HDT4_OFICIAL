package uvg.edu.gt;

import java.util.ArrayList;
import java.util.Vector;

public class StackVector<T> implements UVGStack<T>{
    private Vector<T> vector;
    public StackVector(){
        vector = new Vector<T>();
    }
    public void push(T item){
        vector.add(item);
    }

    @Override
    public T pop() {
        T tempItem = vector.get(vector.size()-1);
        vector.remove(vector.size() - 1);
        return tempItem;
    }

    @Override
    public T peek() {
        return vector.get(vector.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }

}
