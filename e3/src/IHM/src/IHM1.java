import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class IHM1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHM1 frame = new IHM1();
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
	public IHM1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DES TACHES");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 47);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.RED);
		separator.setBounds(0, 45, 434, 2);
		contentPane.add(separator);
		
		JLabel lblChoisirUnEmploye = new JLabel("CHOISIR UN EMPLOYE");
		lblChoisirUnEmploye.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChoisirUnEmploye.setBounds(10, 68, 184, 23);
		contentPane.add(lblChoisirUnEmploye);
		
		JRadioButton rdbtnFrauciel = new JRadioButton("FRAUCIEL");
		rdbtnFrauciel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFrauciel.setBounds(20, 98, 109, 23);
		contentPane.add(rdbtnFrauciel);
		
		JRadioButton rdbtnTerlonge = new JRadioButton("TERLONGE");
		rdbtnTerlonge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnTerlonge.setBounds(170, 98, 109, 23);
		contentPane.add(rdbtnTerlonge);
		
		JRadioButton rdbtnFoumann = new JRadioButton("FOUMANN");
		rdbtnFoumann.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnFoumann.setBounds(315, 98, 109, 23);
		contentPane.add(rdbtnFoumann);
		
		JLabel lblEcrire = new JLabel("ECRIRE  UN MESSAGE");
		lblEcrire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEcrire.setBounds(10, 144, 173, 14);
		contentPane.add(lblEcrire);
		
		textField = new JTextField();
		textField.setBounds(20, 169, 351, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("VALIDER");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(315, 227, 109, 23);
		contentPane.add(btnNewButton);
	}
}
