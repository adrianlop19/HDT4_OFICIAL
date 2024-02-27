package uvg.edu.gt;

public class LListFactory<T> {
    public UVGLList<T> createList(String type){
        switch (type){
            case "single":
                return new SingleLinkedList<T>();
            case "double":
                return new DoubleLinkedList<T>();
            default:
                return null;
        }
    }
}