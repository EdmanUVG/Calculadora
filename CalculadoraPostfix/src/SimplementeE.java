import java.util.List;

public class SimplementeE<E> extends AbstractList<E> {
	
	protected List<E> data;
	

	@Override
	public void add(E item) {
		
		data.add(item);
	}

	@Override
	public E getFirst() {

		return data.get(0);
	}

	@Override
	public E getLast() {
		
		return data.get(size());
	}

	@Override
	public E removeFirst() {
		
		return data.remove(0);
	}

	@Override
	public E removeLast() {
		
		return data.remove(size());
	}

	@Override
	public boolean isEmpty() {
		
		return size() == 0;
	}

	@Override
	public int size() {

		return data.size();
	}

}
