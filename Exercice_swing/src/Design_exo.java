import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;


public class Design_exo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design_exo frame = new Design_exo();
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
	public Design_exo() {
		setTitle("Simple complain dialog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblShortDescription = new JLabel("Short Description");
		lblShortDescription.setBounds(10, 25, 95, 14);
		contentPane.add(lblShortDescription);
		
		textField = new JTextField();
		textField.setBounds(101, 22, 204, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 75, 95, 14);
		contentPane.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 72, 204, 54);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(335, 21, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(335, 55, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(335, 88, 89, 23);
		contentPane.add(btnHelp);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 240, 95, 14);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 212, 46, 14);
		contentPane.add(lblPhone);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 209, 204, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 237, 204, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D"}));
		comboBox.setBounds(101, 163, 58, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox_1.setBounds(247, 163, 58, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setBounds(191, 166, 46, 14);
		contentPane.add(lblPriority);
		
		JLabel lblServering = new JLabel("Servering");
		lblServering.setBounds(10, 166, 46, 14);
		contentPane.add(lblServering);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(10, 278, 46, 14);
		contentPane.add(lblSex);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(101, 274, 89, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(216, 274, 89, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblIdNumber = new JLabel("Id number");
		lblIdNumber.setBounds(10, 307, 95, 14);
		contentPane.add(lblIdNumber);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 304, 204, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
