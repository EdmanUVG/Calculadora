/**
 @author olivverde
 * @param <E>
 * @since 26/02/2020
 * @version 26/02/2020
 * Retrieved from: "Chapter 9.5) Doubly Linked Lists"
 * 
 * Class's purpose: Creates the DoubleNode methods in order to be used in 
 * Doubly Linked Lists.
 * 
 * In collaboration with
 * @brandon
 * @luis
 * 
 * */

public class DobleNode<E> {

    protected E data;
    protected DobleNode<E> nextE, previousE;

    /**
     * DoubleNode Constructor
     * post: A DoubleNode constructor is created
     * @param newData 
     */
    public DobleNode(E newData){
        this(newData, null, null);
    }

    /**
     * DoubleNode's Constructor
     * @pos A node with previous and next values is created
     * @param newData 
     * @param next 
     * @param previous 
     */
    public DobleNode(E newData, DobleNode<E> next, DobleNode<E> previous){
        data = newData;
        nextE = next;

        if(nextE != null){
            nextE.previousE = this;
        }

        previousE = previous;

        if(previousE != null){
            previousE.nextE = this;
        }
    }

    /**
     * Return the value of a previous element
     * @return previousE
     */
    public DobleNode<E> getPrevious(){
        return previousE;
    }

    /**
     *Establish a value to the node
     * @param next 
     */
    public void setNext(DobleNode<E> next){
        nextE = next;
    }

}