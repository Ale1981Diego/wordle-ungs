package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

public class InterfazTutorial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazTutorial window = new InterfazTutorial();
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
	public InterfazTutorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1000, 722);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane tutorialScroll = new JScrollPane();
		tutorialScroll.setBounds(237, 47, 724, 557);
		frame.getContentPane().add(tutorialScroll);
		
		JLabel etiquetaTutorial = new JLabel("");
		etiquetaTutorial.setIcon(new ImageIcon(InterfazTutorial.class.getResource("/recursos/Tutorial.png")));
		tutorialScroll.setViewportView(etiquetaTutorial);
	
		
		JButton btnSiguienteTutorial = new JButton("Siguiente ->");
		btnSiguienteTutorial.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnSiguienteTutorial.setBounds(831, 653, 130, 36);
		frame.getContentPane().add(btnSiguienteTutorial);
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
