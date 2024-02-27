package uvg.edu.gt;

public class StackFactory<T> {
    public UVGStack<T> createStack(String type){
        switch (type){
            case "vector":
                return new StackVector<T>();
            case "arraylist":
                return new StackArrayList<T>();
            case "singlelinkedlist":
                return new StackSLL<T>();
            default:
                return null;
        }
    }
}