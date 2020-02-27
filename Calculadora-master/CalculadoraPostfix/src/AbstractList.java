import java.util.List;

public abstract class AbstractList<E> implements iList<E>, iStack<E>{

    // Amount of elements that the list contains
    protected int count;

    /**
     * Add elements at the end of the list
     * post: A new element is added
     * @param value 
     */
    public abstract void add(E value);

    /**
     * Se encarga de eliminar y retornar el ultimo valor ingresado
     * @pre la lista no debe de estar vacia
     * @pos se elimina el ultimo elemento de la lista
     * @return el valor eliminado
     */
    public abstract E remove();

    /**
     * Se encarga de conseguir el tamañoñ de la lista
     * @return el tamaño de la lista
     */
    public int getSize(){
        return count;
    }

}