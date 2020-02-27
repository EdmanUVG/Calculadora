
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
		
		
		return null;
	}

}
