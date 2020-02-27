import java.time.temporal.TemporalAccessor;

/**
 @author olivverde
 * @param <E>
 * @since 26/02/2020
 * @version 26/02/2020
 * Retrieved from: "Chapter 9.5) Doubly Linked Lists"
 * 
 * Class's purpose: Creates the doubly format of lists.
 * 
 * */
public class DoblementeE<E> extends AbstractList<E>{

	protected DobleNode<E> head, tail;

	/**
	 * Doubly constructor, creates a head and a tail
	 * pre: Creates a constructor
	 */
	public DoblementeE(){
		head = tail = null;
		count = 0;
	}

	/**
	 * Enters a element at the end of the list
	 * @param value 
	 */
	@Override
	public void add(E value) {
		if(count == 0){
		    head = new DobleNode<E>(value, head, null);
		    if(tail == null) tail = head;
        }else {
		    tail = new DobleNode<E>(value, null, tail);
		    if(head == null) head = tail;
        }
		count++;
	}

	/**
	 * Remove and return the last value of the list
	 * pre: List must no be empty
	 * pos: Last element of the list is removed
	 * @return value
	 */
	@Override
	public E remove() {
		DobleNode<E> temp = tail;
        tail = tail.getPrevious();
		if(head == tail){
			head = null;
		}else {
			tail.setNext(null);
		}
		count--;
		return temp.data;
	}

	/**
	 * Gets the size of the list
	 * @return size
	 */
	@Override
	public E peek() {
		return tail.data;
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