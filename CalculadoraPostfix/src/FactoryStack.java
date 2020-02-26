
public class FactoryStack<E> {
	
	public AbstractStack<E> getStack(String implementacion) {
		
		if(implementacion == null) {
			return null;
		}
		if(implementacion.equalsIgnoreCase("ArrayList")) {
			return new StackArrayList();
		}
		if(implementacion.equalsIgnoreCase("Vector")) {
			return new StackVector();
		}
		if(implementacion.equalsIgnoreCase("List")) {
			return new StackList();
		}
		
		return null;
	}

}
