package uvg.edu.gt;

public class StackFactory<T> {
    public UVGStack<T> createStack(String type){
        switch (type){
            case "vector":
                return new StackVector<T>();
            case "arraylist":
                return new StackArrayList<T>();
            case "double":
                return new StackLL<T>("double");
            case "single":
                return new StackLL<T>("single");
            default:
                return null;
        }
    }
}