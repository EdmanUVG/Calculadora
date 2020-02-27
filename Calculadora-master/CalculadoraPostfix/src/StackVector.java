
import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {
	
	protected Vector<E> data;
	
	public StackVector()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
	}

	public void push(E item) {
		// post: the value is added to the stack
		//          will be popped next if no intervening push
		data.add(item);
		
	}

	@Override
	public E pop() {
		// pre: stack is not empty
		// post: most recently pushed item is removed and returned
		return data.remove(size()-1);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return data.get(size() - 1);
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return data.isEmpty();
	}

	@Override
	public int size() {
		// post: returns the number of elements in the stack
		return data.size();
	}

}
