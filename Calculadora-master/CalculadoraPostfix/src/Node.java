/**
 @author olivverde
 * @param <E>
 * @since 26/02/2020
 * @version 26/02/2020
 * Retrieved from: "Chapter 9.4, 9.6) Singly & Circular Linked Lists"
 * 
 * Class's purpose: Allow the creation and implementation of node's methods within the class
 * and classes like: Singly Linked Lists and Circular Linked Lists
 * 
 * In collaboration with:
 * @luis
 * */
public class Node<E> {
	 protected E data;
	 //Referring to the next element
	   protected Node<E> nextElement;
	   
	   /**
	    * post:New head is implemented   	  
	    * @param v
	    * @param next
	    */
	   public Node(E v, Node<E> next)
	   
	   {
	       data = v;
	       nextElement = next;
	   }

	   /**
	    * @post constructs a new tail of a list with value v
	    * @param v
	    */
	   public Node(E v)
	   
	   {
	      this(v,null);
	   }

	   /**
	    * @post: returns reference to next value in list
	    * @return nextElement
	    */
	   public Node<E> next(){
	      return nextElement;
	   }

	   /**
	    * @post: Refers to the next element
	    * @param next
	    */
	   public void setNext(Node<E> next){
	      nextElement = next;
	   }

	   /**
	    * @post: Returns a value of E element
	    */
	   public E value(){
	      return data;
	   }

	   /**
	    * @post: sets value associated with this element
	    * @param value
	    */
	   public void setValue(E value){
	      data = value;
	   }
}