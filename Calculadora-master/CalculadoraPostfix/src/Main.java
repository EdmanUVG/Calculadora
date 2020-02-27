import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JButton btnCalcular;
	private JButton btnArraylist;
	private JButton btnVector;
	private JButton btnSimplemente;
	private JButton btnDoblemente;
	private JButton btnCircular;
	private JLabel lblSeleccionarLista;
	private JLabel test;

	FactoryStack factory;
	FactoryList factoryList;
	Calculadora calculos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException {

		factory = new FactoryStack();
		factoryList = new FactoryList();

		// Implementa los metods de nuestra interfaz de iCalculadora
		calculos = new Calculadora();

		frame = new JFrame();
		frame.setBounds(100, 100, 871, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, "name_441788173711200");
		panel.setLayout(null);

		JLabel lblCalculadoraPostfix = new JLabel("Calculadora Postfix");
		lblCalculadoraPostfix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCalculadoraPostfix.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraPostfix.setBounds(0, 60, 855, 23);
		panel.add(lblCalculadoraPostfix);

		JLabel lblSeleccionarImplementacionDel = new JLabel("Seleccionar calculos del Stack");
		lblSeleccionarImplementacionDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionarImplementacionDel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeleccionarImplementacionDel.setBounds(0, 130, 855, 23);
		panel.add(lblSeleccionarImplementacionDel);



		btnArraylist = new JButton("ArrayList");
		btnArraylist.setForeground(new Color(255, 255, 255));
		btnArraylist.setBackground(new Color(0, 153, 204));
		btnArraylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Metodo para hacer los calculos
				// y hace llamada al Factory class
				implementacionStack("ArrayList");

				test.setText("ArrayList implementado");

			}
		});
		btnArraylist.setFont(new Font("Arial", Font.BOLD, 13));
		btnArraylist.setBounds(65, 197, 140, 30);
		panel.add(btnArraylist);

		btnVector = new JButton("Vector");
		btnVector.setForeground(new Color(255, 255, 255));
		btnVector.setBackground(new Color(0, 153, 204));
		btnVector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Metodo para hacer los calculos
				// y hace llamada al Factory class
				implementacionStack("Vector");

				test.setText("Vector implementado");
			}
		});
		btnVector.setBorder(null);
		btnVector.setFont(new Font("Arial", Font.BOLD, 13));
		btnVector.setBounds(641, 197, 140, 30);
		panel.add(btnVector);

		btnSimplemente = new JButton("Simplemente encadenada");
		btnSimplemente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				implementacionList("Simplemente");
				test.setText("Simplemente Enlazado implementado");
			}
		});
		btnSimplemente.setVisible(true);
		btnSimplemente.setForeground(Color.WHITE);
		btnSimplemente.setFont(new Font("Arial", Font.BOLD, 13));
		btnSimplemente.setBorder(null);
		btnSimplemente.setBackground(new Color(0, 153, 204));
		btnSimplemente.setBounds(336, 291, 201, 30);
		panel.add(btnSimplemente);

		btnDoblemente = new JButton("Doblemente encadenada");
		btnDoblemente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				implementacionList("Doblemente");
				test.setText("Doblemente Enlazado implementado");
			}
		});
		btnDoblemente.setForeground(Color.WHITE);
		btnDoblemente.setFont(new Font("Arial", Font.BOLD, 13));
		btnDoblemente.setBorder(null);
		btnDoblemente.setBackground(new Color(0, 153, 204));
		btnDoblemente.setBounds(336, 332, 201, 30);
		panel.add(btnDoblemente);

		btnCircular = new JButton("Circular");
		btnCircular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				implementacionList("Circular");
				test.setText("Circular implementado");
			}
		});
		btnCircular.setForeground(Color.WHITE);
		btnCircular.setFont(new Font("Arial", Font.BOLD, 13));
		btnCircular.setBorder(null);
		btnCircular.setBackground(new Color(0, 153, 204));
		btnCircular.setBounds(336, 372, 201, 30);
		panel.add(btnCircular);

		lblSeleccionarLista = new JLabel("Seleccionar calculos de la Lista");
		lblSeleccionarLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionarLista.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeleccionarLista.setBounds(0, 257, 855, 23);
		panel.add(lblSeleccionarLista);

		test = new JLabel("");
		test.setHorizontalAlignment(SwingConstants.CENTER);
		test.setBounds(0, 424, 855, 35);
		panel.add(test);
		
		JLabel lblLista = new JLabel("Lista");
		lblLista.setBackground(new Color(0, 153, 204));
		lblLista.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblLista.setBounds(378, 196, 100, 30);
		panel.add(lblLista);

	}

	public void implementacionList(String implementation) {
		// Llama a la clase Factory y pasa parametro
		// en base a la implementacion requerida
		iList<Integer> implementacion = factoryList.getList(implementation);

		// Se guarda los resultdos de las operaciones
		int result = 0;

		// Busca y carga el archivo datos.txt donde se guardan los datos.
		BufferedReader in = null;
		try {
			//in = new BufferedReader(new FileReader("src/datos.txt"));
			in = new BufferedReader(new FileReader("datos.txt"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// Variable para guardar uno a uno los datos sacados del txt
		String expresion;
		
		System.out.println(implementacion + " Enlazada");

		// Corre mientras hay datos para leer
		try {
			while ((expresion = in.readLine()) != null) {
				// Se divide la cadena en arreglos para mas facil la busqueda letra por letra
				String[] opercionArray = expresion.split("");

				// Recorre todos los elementos de del arreglo
				for (int i = 0; i < opercionArray.length; i++) {

					// Si el elemento es un signo + entonces es una suma
					if (opercionArray[i].equals("+")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.sumar(implementacion.remove(), implementacion.remove());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.add(result);

						// Si el elemento es un signo - entonces es una resta
					} else if (opercionArray[i].equalsIgnoreCase("-")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.restar(implementacion.remove(), implementacion.remove());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.add(result);

						// Si el elemento es un signo * entonces es una multiplicacion
					} else if (opercionArray[i].equalsIgnoreCase("*")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.multiplicar(implementacion.remove(), implementacion.remove());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.add(result);

						// Si el elemento es un signo / entonces es una division
					} else if (opercionArray[i].equalsIgnoreCase("/")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.dividir(implementacion.remove(), implementacion.remove());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.add(result);

						// Si el elemento es un numero, entonces se agrega al stack
					} else {
						try {

							// Se convierte el String a enteros
							Integer num = Integer.parseInt(opercionArray[i]);

							// Se agrega el entero al stack
							implementacion.add(num);

						} catch (Exception e1) {
							// System.out.println("Operando....");
						}

					}
				}
				// Al final de correr en cada elemento se despliega el resultado de las
				// operaciones

				System.out.println(String.format("%-20s", expresion) + " = " + implementacion.remove());
			}
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // Cierra el BufferReader cuando finalizamos en buscar todos los datos
		
		

	}

	// Metodo para hacer los calculos
	// y hace llamada al Factory del Stack
	public void implementacionStack(String implementation) {

		// Llama a la clase Factory y pasa parametro
		// en base a la implementacion requerida
		AbstractStack<Integer> implementacion = factory.getStack(implementation);

		// Se guarda los resultdos de las operaciones
		int result = 0;
		
		System.out.println(implementacion + " implementado");

		// Busca y carga el archivo datos.txt donde se guardan los datos.
		BufferedReader in = null;
		try {
			//in = new BufferedReader(new FileReader("src/datos.txt"));
			in = new BufferedReader(new FileReader("datos.txt"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// Variable para guardar uno a uno los datos sacados del txt
		String expresion;

		// Corre mientras hay datos para leer
		try {
			while ((expresion = in.readLine()) != null) {
				// Se divide la cadena en arreglos para mas facil la busqueda letra por letra
				String[] opercionArray = expresion.split("");

				// Recorre todos los elementos de del arreglo
				for (int i = 0; i < opercionArray.length; i++) {

					// Si el elemento es un signo + entonces es una suma
					if (opercionArray[i].equals("+")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.sumar(implementacion.pop(), implementacion.pop());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.push(result);

						// Si el elemento es un signo - entonces es una resta
					} else if (opercionArray[i].equalsIgnoreCase("-")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.restar(implementacion.pop(), implementacion.pop());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.push(result);

						// Si el elemento es un signo * entonces es una multiplicacion
					} else if (opercionArray[i].equalsIgnoreCase("*")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.multiplicar(implementacion.pop(), implementacion.pop());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.push(result);

						// Si el elemento es un signo / entonces es una division
					} else if (opercionArray[i].equalsIgnoreCase("/")) {

						// Retorna el resultado de la operacion y lo guarda
						// @param1 = miStack.pop()
						// @param2 = miStack.pop()
						result = calculos.dividir(implementacion.pop(), implementacion.pop());

						// Se agrega el resultado a la ultima posicion del stack
						implementacion.push(result);

						// Si el elemento es un numero, entonces se agrega al stack
					} else {
						try {

							// Se convierte el String a enteros
							Integer num = Integer.parseInt(opercionArray[i]);

							// Se agrega el entero al stack
							implementacion.push(num);

						} catch (Exception e1) {
							// System.out.println("Operando....");
						}

					}
				}
				// Al final de correr en cada elemento se despliega el resultado de las
				// operaciones

				System.out.println(String.format("%-20s", expresion) + " = " + implementacion.pop());
			}
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // Cierra el BufferReader cuando finalizamos en buscar todos los datos
	}
}
