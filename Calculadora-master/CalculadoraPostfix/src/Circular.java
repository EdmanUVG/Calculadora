/**
 * 
 * @author olivverde
 * @param <E>
 * @since 26/02/2020
 * @version 26/02/2020
 * Retrieved from: "Chapter 9.6) Circular Linked Lists"
 * 
 * Class's purpose: Creates the circular format of lists.
 * 
 * */

public class Circular<E> extends AbstractList<E>{
	
	//Attributes
	protected Node<E> tail;
	protected int count;

	/**
	 * Circular constructor, creates a tail
	 * pre: Creates a constructor
	 */
	public Circular()
	{
	   tail = null;
	   count = 0;
	}
	
	/**
	 * post: Insert elements at the beginning of the list
	 * @param value
	 */
	public void addFirst(E value){

	   Node<E> temp = new Node<E>(value);
	   //Insert a new value
	   if (tail == null) { 
	       tail = temp;
	       tail.setNext(tail);
	   } else { 
		   //If there is a element already
	       temp.setNext(tail.next());
	       tail.setNext(temp);
	   }
	   count++;
	}
	/**
	 * Adds a new element at the end of the list
	 * pos: A new element is added
	 * @param value 
	 */

	@Override
	public void add(E value) {
		   addFirst(value);
		   tail = tail.next();
		
	}
	/**
	 * Remove and return the last value
	 * pre: List must not be empty
	 * post: Last element is removed
	 * @return value
	 */
	@Override
	public E remove(){
	   Node<E> stick = tail;
	   while (stick.next() != tail) {
	       stick = stick.next();
	   }
	   // stick now points to second-to-last value
	   Node<E> temp = tail;
	   if (stick == tail)
	   {
	       tail = null;
	   } else {
	       stick.setNext(tail.next());
	       tail = stick;
	   }
	   count--;
	   return temp.value();
	}

	/**
	 * Get last value entered
	 * pre: List must no be empty
	 * @return value
	 */
	@Override
	public E peek() {
		  {
		      return tail.value();
		  }
	}

	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}