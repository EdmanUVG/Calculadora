
public class Calculadora {

	public static void main(String[] args) {

		Stack<Integer> miStack = new StackArrayList<Integer>();

		String expresiones = "6 2 3 + *";

		Integer operandoB = 0;
		Integer operandoA = 0;

		Integer result = 0;

		String[] opercionArray = expresiones.split(" ");

		// print elements of String array
		for (int i = 0; i < opercionArray.length; i++) {

			if (opercionArray[i].equals("+")) {
				
				operandoA = miStack.pop();
				operandoB = miStack.pop();
				
				result = operandoA + operandoB;
				miStack.push(result);
				
			} else if (opercionArray[i].equalsIgnoreCase("-")) {
				
				operandoA = miStack.pop();
				operandoB = miStack.pop();
				
				result = operandoA - operandoB;
				miStack.push(result);
				
			} else if (opercionArray[i].equalsIgnoreCase("*")) {
				
				operandoA = miStack.pop();
				operandoB = miStack.pop();

				result = operandoA * operandoB;
				miStack.push(result);

			} else if (opercionArray[i].equalsIgnoreCase("/")) {
				
				operandoA = miStack.pop();
				operandoB = miStack.pop();
				
				result = operandoA / operandoB;
				miStack.push(result);
				
			} else {
				Integer num = Integer.parseInt(opercionArray[i]);
				miStack.push(num);
			}
		}
		
		System.out.println(miStack.pop());

	}

}
