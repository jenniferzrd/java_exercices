import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("NUMERO 1");
		lblNumero.setBounds(24, 26, 78, 14);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("NUMERO 2");
		lblNumero_1.setBounds(24, 51, 78, 14);
		contentPane.add(lblNumero_1);
		
		textField = new JTextField();
		textField.setBounds(112, 23, 198, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 48, 198, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JLabel label = new JLabel("");
		label.setBounds(36, 126, 46, 14);
		contentPane.add(label);
		
		JButton button = new JButton("+");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int n1 = Integer.parseInt(textField.getText());
				int n2 = Integer.parseInt(textField_1.getText());
				int total = n1 + n2;
				label.setText(String.valueOf(total));
			}
		});
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				label.setText("");
			}
		});
		btnClear.setBounds(133, 143, 89, 23);
		contentPane.add(btnClear);
		
		button.setBounds(41, 99, 41, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(94, 99, 41, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.setBounds(147, 99, 41, 23);
		contentPane.add(button_2);
		

		

	}
}
