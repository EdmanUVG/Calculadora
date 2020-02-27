/**
 @author olivverde
 * @param <E>
 * @since 26/02/2020
 * @version 26/02/2020
 * Retrieved from: "Chapter 9.4) Singly Linked Lists"
 * 
 * Class's purpose: Creates the Singly format of lists.
 * 
 * */
import java.util.List;

public class SimplementeE<E> extends AbstractList<E> {
	//Creates data list
	protected List<E> data;
	
	//size
	protected int amount;
	//First element of the list
	protected Node<E> head;

	/**
	 * Creates a single linked list
	 */
	public void SinglyLinkedList(){
	      head = null;
	      amount = 0;
	   }
	   
	   /**
		 *Gets last element of the list
		 * @return head.value
		 * post: Returns last value of the list
		 */
	@Override
	public E peek() {
		  {
		      return head.value();
		  }
	}
	/**
	 * Adds an element at the end of the list
	 * post: A new element is added
	 * @param value 
	 */
	@Override
	public void add(E value) 
	// post: value is added to beginning of list
	  {
	     // note order that things happen:
	     // head is parameter, then assigned
	     head = new Node<E>(value, head);
	     amount++;
	  }
	/**
	 *Remove and return last value of the list
	 * pre: List must no be empty
	 * post: Last element is removed
	 * @return value
	 */
	@Override
	public E remove() {
	     Node<E> temp = head;
	     head = head.next(); 
	     amount--;
	     return temp.value();
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