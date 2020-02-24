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
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JButton btnCalcular;
	private JButton btnArraylist;
	private JButton btnList;
	private JButton btnVector;
	private JButton btnSimplemente;
	private JButton btnDoblemente;
	private JButton btnCircular;
	private JLabel lblSeleccionarLista;
	private JLabel test;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		FactoryStack factory = new FactoryStack();
		
		
		
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
		
		JLabel lblSeleccionarImplementacionDel = new JLabel("Seleccionar implementacion del Stack");
		lblSeleccionarImplementacionDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionarImplementacionDel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeleccionarImplementacionDel.setBounds(0, 130, 855, 23);
		panel.add(lblSeleccionarImplementacionDel);
		
		
		btnArraylist = new JButton("ArrayList");
		btnArraylist.setForeground(new Color(255, 255, 255));
		btnArraylist.setBackground(new Color(0, 153, 204));
		btnArraylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				iStack implmentacionArrayList = factory.getStack("ArrayList");
				
				test.setText("Arraylist");
				
			}
		});
		btnArraylist.setFont(new Font("Arial", Font.BOLD, 13));
		btnArraylist.setBounds(65, 197, 140, 30);
		panel.add(btnArraylist);
		
		
		btnList = new JButton("List");
		btnList.setBackground(new Color(0, 153, 204));
		btnList.setForeground(new Color(255, 255, 255));
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblSeleccionarLista.setVisible(true);
				btnSimplemente.setVisible(true);
				btnDoblemente.setVisible(true);
				btnCircular.setVisible(true);
				
				iStack implementacionVector = factory.getStack("Vector");
				
				test.setText("List");
			}
		});
		btnList.setFont(new Font("Arial", Font.BOLD, 13));
		btnList.setBounds(365, 197, 140, 30);
		panel.add(btnList);
		
		
		btnVector = new JButton("Vector");
		btnVector.setForeground(new Color(255, 255, 255));
		btnVector.setBackground(new Color(0, 153, 204));
		btnVector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test.setText("Vector");
			}
		});
		btnVector.setBorder(null);
		btnVector.setFont(new Font("Arial", Font.BOLD, 13));
		btnVector.setBounds(641, 197, 140, 30);
		panel.add(btnVector);
		
		btnSimplemente = new JButton("Simplemente encadenada");
		btnSimplemente.setVisible(false);
		btnSimplemente.setForeground(Color.WHITE);
		btnSimplemente.setFont(new Font("Arial", Font.BOLD, 13));
		btnSimplemente.setBorder(null);
		btnSimplemente.setBackground(new Color(0, 153, 204));
		btnSimplemente.setBounds(336, 291, 201, 30);
		panel.add(btnSimplemente);
		
		btnDoblemente = new JButton("Doblemente encadenada");
		btnDoblemente.setVisible(false);
		btnDoblemente.setForeground(Color.WHITE);
		btnDoblemente.setFont(new Font("Arial", Font.BOLD, 13));
		btnDoblemente.setBorder(null);
		btnDoblemente.setBackground(new Color(0, 153, 204));
		btnDoblemente.setBounds(336, 332, 201, 30);
		panel.add(btnDoblemente);
		
		btnCircular = new JButton("Circular");
		btnCircular.setVisible(false);
		btnCircular.setForeground(Color.WHITE);
		btnCircular.setFont(new Font("Arial", Font.BOLD, 13));
		btnCircular.setBorder(null);
		btnCircular.setBackground(new Color(0, 153, 204));
		btnCircular.setBounds(336, 372, 201, 30);
		panel.add(btnCircular);
		
		lblSeleccionarLista = new JLabel("Seleccionar implementacion de la Lista");
		lblSeleccionarLista.setVisible(false);
		lblSeleccionarLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionarLista.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeleccionarLista.setBounds(0, 257, 855, 23);
		panel.add(lblSeleccionarLista);
		
		test = new JLabel("");
		test.setBounds(365, 424, 131, 35);
		panel.add(test);
		
		
	}
}
