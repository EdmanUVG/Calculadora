
public class FactoryStack {
	
	public iStack getStack(String implementacion) {
		if(implementacion == null) {
			return new ImplementacionVacia();
		}
		if(implementacion.equalsIgnoreCase("ArrayList")) {
			return new Stack();
		}
		if(implementacion.equalsIgnoreCase("Vector")) {
			return new StackVector();
		}
		if(implementacion.equalsIgnoreCase("List")) {
			return null;
		}
		return new ImplementacionVacia();
	}

}
