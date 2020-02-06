
/**
 * 
 * @author Edman Cota
 * @author Oliver de Leon
 * @version 1.0.0
 * 
 */
public class CalculadoraImplementacion implements CalculadoraInterface {
	
	/**
	 * Ingresan dos parámetros enteros, suma los parámetros
	 *  y retorna su resultado
	 */
	@Override
	public int sumar(int paramA, int paramB) {
		// TODO Auto-generated method stub
		int result = paramA + paramB;
		return result;
	}
	/**
	 * Ingresa dos parámetros enteros, resta los parámetros
	 * y retorna su resultado
	 */
	@Override
	public int restar(int paramA, int paramB) {
		int result = paramA - paramB;
		return result;
	}

	/**
	 * Ingresa dos parámetros enteros, multiplica los parámetros
	 * y retorna su resultado
	 */
	@Override
	public int multiplicar(int paramA, int paramB) {
		// TODO Auto-generated method stub
		int result = paramA * paramB;
		return result;
	}
	/**
	 * Ingresa dos parámetros enteros, divide los parámetros
	 * y retorna su resultado
	 */
	@Override
	public int dividir(int paramA, int paramB) {
		// TODO Auto-generated method stub
		int result = paramA / paramB;
		return result;
	}

	

}
