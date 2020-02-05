/**
 * 
 * @author Edman Cota
 * @author Oliver de Leon
 * @version 1.0.0
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// Stack generico. Acepta cualquier tipo de dato
		Stack<Integer> miStack = new StackArrayList<Integer>();

		// Implementa los metods de nuestra interfaz de calculadora
		CalculadoraImplementacion implementacion = new CalculadoraImplementacion();

		// Se guarda los resultdos de las operaciones
		int result = 0;


		// Busca y carga el archivo datos.txt donde se guardan los datos.
		BufferedReader in = new BufferedReader(new FileReader("src/datos.txt"));

		// Variable para guardar uno a uno los datos sacados del txt
		String expresion;

		// Corre mientras hay datos para leer
		while((expresion = in.readLine()) != null)
		{
			// Se divide la cadena en arreglos para mas facil la busqueda letra por letra
			String[] opercionArray = expresion.split("");

			// Recorre todos los elementos de del arreglo
			for (int i = 0; i < opercionArray.length; i++) {

				// Si el elemento es un signo + entonces es una suma
				if (opercionArray[i].equals("+")) {

					// Retorna el resultado de la operacion y lo guarda
					// @param1 = miStack.pop()
					// @param2 = miStack.pop()
					result = implementacion.sumar(miStack.pop(), miStack.pop());

					// Se agrega el resultado a la ultima posicion del stack
					miStack.push(result);

					// Si el elemento es un signo - entonces es una resta
				} else if (opercionArray[i].equalsIgnoreCase("-")) {

					// Retorna el resultado de la operacion y lo guarda
					// @param1 = miStack.pop()
					// @param2 = miStack.pop()
					result = implementacion.restar(miStack.pop(), miStack.pop());

					// Se agrega el resultado a la ultima posicion del stack
					miStack.push(result);

					// Si el elemento es un signo * entonces es una multiplicacion
				} else if (opercionArray[i].equalsIgnoreCase("*")) {

					// Retorna el resultado de la operacion y lo guarda
					// @param1 = miStack.pop()
					// @param2 = miStack.pop()
					result = implementacion.multiplicar(miStack.pop(), miStack.pop());

					// Se agrega el resultado a la ultima posicion del stack
					miStack.push(result);

					// Si el elemento es un signo / entonces es una division
				} else if (opercionArray[i].equalsIgnoreCase("/")) {

					// Retorna el resultado de la operacion y lo guarda
					// @param1 = miStack.pop()
					// @param2 = miStack.pop()
					result = implementacion.dividir(miStack.pop(), miStack.pop());

					// Se agrega el resultado a la ultima posicion del stack
					miStack.push(result);

					// Si el elemento es un numero, entonces se agrega al stack
				} else {
					try {

						// Se convierte el String a enteros
						Integer num = Integer.parseInt(opercionArray[i]);

						// Se agrega el entero al stack
						miStack.push(num);

					} catch(Exception e) {
						//						System.out.println("Operando....");
					}

				}
			}
			// Al final de correr en cada elemento se despliega el resultado de las operaciones
			System.out.println("Resultado: " + miStack.pop());
		}
		in.close(); // Cierra el BufferReader cuando finalizamos en buscar todos los datos

	}

}
