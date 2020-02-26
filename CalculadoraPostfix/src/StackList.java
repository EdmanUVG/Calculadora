import java.util.ArrayList;
import java.util.List;

public class StackList<E> extends AbstractStack<E> {
	
	protected List<E> data;
	
	public StackList()
	// post: constructs a new, empty stack
	{
		//data = new List<E>();
	}

	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		data.add(item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
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
