/**
 * 
 * @author Edman Cota
 * @author Oliver de Leon
 * @version 1.0.0
 * 
 */

public interface CalculadoraInterface {

	/**
	 * @param operandoA
	 * @param operandoB
	 * @return
	 */

	/**
	*pre:
	*pos:  Retorna el resultado de la suma
	*/
	public int sumar(int operandoA, int operandoB);


	/**
	 * @param operandoA
	 * @param operandoB
	 * @return
	 */

	/**
	*pre:
	*pos:  Retorna el resultado de la resta
	*/
	public int restar(int operandoA, int operandoB);


	/**
	 * @param operandoA
	 * @param operandoB
	 * @return
	 */

	/**
	*pre:
	*pos:  Retorna el resultado de la multiplicacion
	*/
	public int multiplicar(int operandoA, int operandoB);


	/**
	 * @param operandoA
	 * @param operandoB
	 * @return
	 */

	/**
	*pre: Verifica que la division no contenga un numero 0
	*pos: Retorna el resultado de la division
	*/
	public int dividir(int operandoA, int operandoB);

}
