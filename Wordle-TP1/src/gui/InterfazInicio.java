package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Rectangle;

public class InterfazInicio {

	private JFrame frame;
	private JTextField txtJuan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazInicio window = new InterfazInicio();
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
	public InterfazInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.getContentPane().setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		frame.getContentPane().setLayout(null);
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon(InterfazInicio.class.getResource("/recursos/Logo.png")));
		logo.setBounds(190, 41, 598, 175);
		frame.getContentPane().add(logo);
		
		JLabel etiquetaNombre = new JLabel("Nombre / Name:");
		etiquetaNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		etiquetaNombre.setBounds(232, 267, 130, 29);
		frame.getContentPane().add(etiquetaNombre);
		
		txtJuan = new JTextField();
		txtJuan.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		txtJuan.setBounds(372, 267, 150, 29);
		frame.getContentPane().add(txtJuan);
		txtJuan.setColumns(10);
		
		JLabel etiquetaIdioma = new JLabel("Idioma / Language:");
		etiquetaIdioma.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		etiquetaIdioma.setBounds(212, 318, 136, 29);
		frame.getContentPane().add(etiquetaIdioma);
		
		JComboBox idioma = new JComboBox();
		idioma.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol - ES", "English - EN"}));
		idioma.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		idioma.setBounds(372, 318, 150, 29);
		frame.getContentPane().add(idioma);
		
		JLabel etiquetaDificultad = new JLabel("Dificultad / Difficulty:");
		etiquetaDificultad.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		etiquetaDificultad.setBounds(190, 372, 158, 29);
		frame.getContentPane().add(etiquetaDificultad);
		
		JComboBox dificultad = new JComboBox();
		dificultad.setModel(new DefaultComboBoxModel(new String[] {"Facil / Easy", "Dificil / Hard"}));
		dificultad.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		dificultad.setBounds(372, 372, 150, 29);
		frame.getContentPane().add(dificultad);
		
		JButton btnSiguiente = new JButton("Siguiente ->");
		btnSiguiente.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnSiguiente.setBounds(616, 437, 130, 36);
		frame.getContentPane().add(btnSiguiente);
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
