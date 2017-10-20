import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class convertisseur extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					convertisseur frame = new convertisseur();
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
	public convertisseur() {
		setTitle("Mon convertisseur\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 189);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(134, 27, 89, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Convertisseur");
		lblNewLabel.setBounds(10, 30, 95, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int celcius = Integer.parseInt(textField.getText()); // on traduit notre string en int
				double farenheit = (double) celcius * 1.8 + 32;
				String st = String.valueOf(farenheit); // on traduit notre double en string
				lblNewLabel_1.setText(st);
				System.out.println("");
			}
		});
		btnValider.setBounds(134, 58, 89, 23);
		contentPane.add(btnValider);
		
		lblNewLabel_1 = new JLabel("Resultat");
		lblNewLabel_1.setToolTipText("Resultat");
		lblNewLabel_1.setBounds(10, 62, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
				lblNewLabel_1.setText("");
			}
		});
		btnReset.setBounds(134, 88, 89, 23);
		contentPane.add(btnReset);
	}
}
