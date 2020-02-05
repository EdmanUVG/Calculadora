import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author olivverde
 */

//Lista de importaciones
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Calculadora {

	public static void main(String[] args) throws IOException {

		//Embajadores de clases
		Stack<Integer> miStack = new StackArrayList<Integer>();
		CalculadoraImplementacion calculadora = new CalculadoraImplementacion();
		
		//Atributos
		int operandoB = 0;
		int operandoA = 0;
		int result = 0;
		String expresion;
		ArrayList<String> operacionArray = new ArrayList<String>();
		
		
		// Busca y carga el archivo datos.txt donde se guardan los datos.
		BufferedReader in = new BufferedReader(new FileReader("src/calculadora/datos.txt"));
		
		// Corre mientras hay datos para leer
		while((expresion = in.readLine()) != null)
		{
			// Se separa cada componente del String y se
			//guarda en un ArrayList
			for(int s = 0; s < expresion.length(); s++) {
				String cut = expresion.substring(s,s+1);
				operacionArray.add(cut);
			}
			
			// Recorre todos los elementos de del arreglo
			for (int i = 0; i < operacionArray.size(); i++) {
				
				// Si el elemento es un signo "+" entonces es una suma
				if (operacionArray.get(i).equalsIgnoreCase("+")) {
					
					//Se eliminan los operadores del stack
					//mientras retorna el valor de cada uno
					operandoA = miStack.pop();
					operandoB = miStack.pop();
					//calcula resultado
					result = calculadora.sumar(operandoA, operandoB);
					//Sube el resultado al stack
					miStack.push(result);
					
				// Si el elemento es un signo "-" entonces es una resta
				} else if (operacionArray.get(i).equalsIgnoreCase("-")) {
					
					//""
					operandoA = miStack.pop();
					operandoB = miStack.pop();
					result = calculadora.restar(operandoA, operandoB);
					
					miStack.push(result);
					
					// Si el elemento es un signo "*" entonces es una multiplicacion
				} else if (operacionArray.get(i).equalsIgnoreCase("*")) {
					
					operandoA = miStack.pop();
					operandoB = miStack.pop();
					result = calculadora.multiplicar(operandoA, operandoB);

					result = operandoA * operandoB;
					miStack.push(result);

					// Si el elemento es un signo "/" entonces es una division
				} else if (operacionArray.get(i).equalsIgnoreCase("/")) {
					
					operandoA = miStack.pop();
					operandoB = miStack.pop();
					
					result = calculadora.dividir(operandoA, operandoB);
					miStack.push(result);
					
					// Si el elemento es un numero, entonces se agrega al stack
				} else {
					Integer num = Integer.parseInt(operacionArray.get(i));
					miStack.push(num);
				}
			}
			// Al final de correr en cada elemento se despliega el resultado de las operaciones
			System.out.println("El resultado de la operacion es: "+miStack.pop());
		}
		in.close(); // Cierra el BufferReader cuando finalizamos en buscar todos los datos	
	}
}
