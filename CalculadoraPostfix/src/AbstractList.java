import java.util.List;

public abstract class AbstractList<E> implements iList<E> {
	
	public abstract void add(E item);
	// pre: 
	// post: value is added to tail of list
	
	public abstract E getFirst();
	// pre: list is not empty
	// post: returns first value in list

	public abstract E getLast();
	// pre: list is not empty
	// post: returns last value in list
	
	public abstract E removeFirst();
	// pre: list is not empty
	// post: removes first value from list
	
	public abstract E removeLast();
	// pre: list is not empty
	// post: removes last value from list

	public abstract boolean isEmpty();
	// post: returns true iff list has no elements

	public abstract int size();
	// post: returns number of elements in list

}
