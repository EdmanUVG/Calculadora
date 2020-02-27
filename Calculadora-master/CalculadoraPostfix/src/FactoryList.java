
public class FactoryList<E> {
	
	public AbstractList<E> getList(String implementacion) {
		
		if(implementacion == null) {
			return null;
		}
		if(implementacion.equalsIgnoreCase("Simplemente")) {
			return new SimplementeE();
		}
		if(implementacion.equalsIgnoreCase("Doblemente")) {
			return new DoblementeE();
		}
		if(implementacion.equalsIgnoreCase("Circular")) {
			return new Circular();
		}
		return null;
	}
}
