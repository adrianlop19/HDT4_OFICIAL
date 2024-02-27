
/**
* Universidad Del Valle de Guatemala
* @author Adrián López 21357
 * @author Antonio Merida 201105
*/

/**
 *
 */
public class FactoryNodos<T> {

    public BaseNodo<T> getNodo(String entry, T valor, NodoDoble<T> Cola){
        switch (entry) {
            case "1":
                return new Nodo<>(valor);//post: regresa un nodo simple
            default:
                return new NodoDoble<>(valor, null, Cola);//post: regresa un nodo doble

        }
    }
}
