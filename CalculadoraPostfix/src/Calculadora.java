import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora {

	public static void main(String[] args) throws IOException {

		Stack<Integer> miStack = new StackArrayList<Integer>();

		

		int operandoB = 0;
		int operandoA = 0;

		int result = 0;
		
		
		// Busca y carga el archivo datos.txt donde se guardan los datos.
		BufferedReader in = new BufferedReader(new FileReader("src/datos.txt"));
		
		// Variable para guardar uno a uno los datos sacados del txt
		String expresion;
		
		// Corre mientras hay datos para leer
		while((expresion = in.readLine()) != null)
		{
			// Se divide la cadena en arreglos para mas facil la busqueda letra por letra
			String[] opercionArray = expresion.split(" ");

			// Recorre todos los elementos de del arreglo
			for (int i = 0; i < opercionArray.length; i++) {
				
				// Si el elemento es un signo + entonces es una suma
				if (opercionArray[i].equals("+")) {
					
					operandoA = miStack.pop();
					operandoB = miStack.pop();
					
					result = operandoA + operandoB;
					miStack.push(result);
					
					// Si el elemento es un signo - entonces es una resta
				} else if (opercionArray[i].equalsIgnoreCase("-")) {
					
					operandoA = miStack.pop();
					operandoB = miStack.pop();
					
					result = operandoA - operandoB;
					miStack.push(result);
					
					// Si el elemento es un signo * entonces es una multiplicacion
				} else if (opercionArray[i].equalsIgnoreCase("*")) {
					
					operandoA = miStack.pop();
					operandoB = miStack.pop();

					result = operandoA * operandoB;
					miStack.push(result);

					// Si el elemento es un signo / entonces es una division
				} else if (opercionArray[i].equalsIgnoreCase("/")) {
					
					operandoA = miStack.pop();
					operandoB = miStack.pop();
					
					result = operandoA / operandoB;
					miStack.push(result);
					
					// Si el elemento es un numero, entonces se agrega al stack
				} else {
					Integer num = Integer.parseInt(opercionArray[i]);
					miStack.push(num);
				}
			}
			// Al final de correr en cada elemento se despliega el resultado de las operaciones
			System.out.println(miStack.pop());
		}
		in.close(); // Cierra el BufferReader cuando finalizamos en buscar todos los datos
		
		
		
		
		

	}

}
