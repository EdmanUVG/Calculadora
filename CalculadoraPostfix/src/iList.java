
public interface iList<E>  {
	
	
	public void add(E item);
	// pre: 
	// post: value is added to tail of list
	
	public E getFirst();
	// pre: list is not empty
	// post: returns first value in list

	public E getLast();
	// pre: list is not empty
	// post: returns last value in list
	
	public E removeFirst();
	// pre: list is not empty
	// post: removes first value from list
	
	public E removeLast();
	// pre: list is not empty
	// post: removes last value from list

	public boolean isEmpty();
	// post: returns true iff list has no elements

	public int size();
	// post: returns number of elements in list
}
