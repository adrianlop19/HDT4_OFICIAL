

/**
* Universidad Del Valle de Guatemala
 * @author Adrián López 21357
 * @author Antonio Merida 201105
*/

/**
 *
 * @param <T>
 */
public class BaseNodo<T> implements Comparable{

    protected T _valor;  //valor del nodo
    protected BaseNodo<T> _siguiente; //apuntar al siguiente
    protected  NodoDoble<T> _anterior;
    
    public BaseNodo<T> getSiguiente() {
        return _siguiente;
    }

    public void setSiguiente(BaseNodo<T> _siguiente) {
        this._siguiente = _siguiente;
    }

    public T getValor() {
        return _valor;
    }

    public void setValor(T _valor) {
        this._valor = _valor;
    }
    
    @Override
    public boolean equals(Object other){
        
        return this._valor.equals(((Nodo)other).getValor());
    }
    
    @Override
    public int compareTo(Object other) {
        return (((Comparable)this._valor)).compareTo(other);
        
    }
    
}
