
/**
 * 
 * @author Edman Cota
 * @author Oliver de Leon
 * @version 1.0.0
 * 
 */
public class CalculadoraImplementacion implements CalculadoraInterface {


	/**
	 * @param operandoA
	 * @param operandoB
	 */
	@Override
	public int sumar(int operandoA, int operandoB) {
		//pre:
		//pos:  Retorna el resultado de la suma

		// Realiza la operacion de sumar
		return operandoA + operandoB;
	}


	/**
	 * @param operandoA
	 * @param operandoB
	 */
	@Override
	public int restar(int operandoA, int operandoB) {
		//pre:
		//pos:  Retorna el resultado de la resta

		// Realiza la operacion de restar
		return operandoA - operandoB;
	}


	/**
	 * @param operandoA
	 * @param operandoB
	 */
	@Override
	public int multiplicar(int operandoA, int operandoB) {
		//pre:
		//pos:  Retorna el resultado de la multiplicacion

		// Realiza la operacion de multiplicar
		return operandoA * operandoB;
	}


	/**
	 * @param operandoA
	 * @param operandoB
	 */
	@Override
	public int dividir(int operandoA, int operandoB) {
		//pre: Verifica que la division no contenga un numero 0
		//pos: Retorna el resultado de la division

		// Retorna cero si alguno de los operandos es cero
		if(operandoA == 0 || operandoB == 0) {
			return 0;
		}

		// Realiza la operacion de dividir
		return operandoA / operandoB;
	}



}
