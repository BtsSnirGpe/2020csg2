package ihm_test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ihm1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ihm1 frame = new ihm1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ihm1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 397);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNouveau = new JMenu("Fichier");
		menuBar.add(mnNouveau);
		
		JMenu mnNouveau_1 = new JMenu("Nouveau");
		mnNouveau.add(mnNouveau_1);
		
		JMenu mnFermer = new JMenu("Fermer");
		mnNouveau.add(mnFermer);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 46, 617, 2);
		contentPane.add(separator);
		
		JLabel lblGesionDesTaches = new JLabel("GESTION DES TACHES");
		lblGesionDesTaches.setHorizontalAlignment(SwingConstants.CENTER);
		lblGesionDesTaches.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblGesionDesTaches.setBounds(0, 0, 617, 48);
		contentPane.add(lblGesionDesTaches);
		
		JLabel lblNewLabel_1 = new JLabel("Choisir un employe");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 99, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnFoumann = new JRadioButton("FRAUCIEL");
		rdbtnFoumann.setBounds(173, 96, 109, 23);
		contentPane.add(rdbtnFoumann);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("TERLONGE");
		rdbtnNewRadioButton.setBounds(314, 96, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FOUMANN");
		rdbtnNewRadioButton_1.setBounds(453, 96, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Ecrire un message");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 189, 120, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(173, 172, 389, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(518, 303, 89, 23);
		contentPane.add(btnNewButton);
	}
}
