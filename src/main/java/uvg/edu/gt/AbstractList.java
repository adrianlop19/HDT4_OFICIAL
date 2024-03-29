


/**
* Universidad Del Valle de Guatemala
* @author Adrián López 21357
* @author Antonio Merida 201105
 * Esta clase implementa la interface lista
 * y contiene los metodos que son generales a todas las
 * implementaciones de lista. El unico metodo que tiene
 * esta clase es isEmpty, que se utiliza para saber si
 * esta o no vacia una lista.
 * 
*/

/**
 *
 * @param <T>
 */
public abstract class AbstractList<T> implements ILista<T>{
    private Nodo<T> Cabeza;
    private int tamaño;
      
   /**
    * Permite saber si una lista esta o no vacia.
    * @return true, si esta vacia o false si no esta vacia
    */
   @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return getTamaño() == 0;
   }
   //es lo mismo tener un método en la clase abstracta o en la interfaz
   //la idea es que todas las clases puedan utilizar todos los metodos
   public abstract T Remover(T valor);
}
