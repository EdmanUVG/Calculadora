/**
 * 
 * @author Edman Cota
 * @author Oliver de Leon
 * @version 1.0.0
 * 
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
		
		int operandoB;
		int operandoA;
		int result;
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
			
			int a = 0;
			// Recorre todos los elementos de del arreglo
			for (int i = 0; i < operacionArray.size(); i++) {
				a = 0;
				
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
					if(operandoB != 0) {
						result = calculadora.dividir(operandoA, operandoB);
						miStack.push(result);
					}else {
						a += 1;
					}
					
					// Si el elemento es un numero, entonces se agrega al stack
				} else {
					try {
						Integer num = Integer.parseInt(operacionArray.get(i));
						miStack.push(num);
					}catch(Exception e) {
						
					}
					
				}
			}
			// Al final de correr en cada elemento se despliega el resultado de las operaciones
			if (a == 0) {
				System.out.println("El resultado de la operacion es: "+miStack.pop());
			}else {
				System.out.println("ERROR: operacion invalida");
			}
			
			
		}
		in.close(); // Cierra el BufferReader cuando finalizamos en buscar todos los datos	
	}
}
