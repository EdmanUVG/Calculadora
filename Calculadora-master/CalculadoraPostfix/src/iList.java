/**
 @author olivverde
 * @param <E>
 * @since 26/02/2020
 * @version 26/02/2020
 * 
 * In collaboration with other students
 * @brandon
 * Interface's purpose: Creates an ADT contract for lists.
 * 
 * */
public interface iList<E> {

    /**
     * Add an element at the end of the list
     * post:A new element is added
     * @param value 
     */
    public void add(E value);

    /**
     * Remove and return the last value
     * pre: List must not be empty
     * post: Last element is removed
     * @return value
     */
    public E remove();

    /**
     * Gets the list's size
     * @return size
     */
    public int getSize();
}