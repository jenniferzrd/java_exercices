import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChangeDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private JTextField textField;
	private boolean succeeded;
	static LoginDialog frame1;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;


	/**
	 * Create the dialog.
	 */
	public ChangeDialog(Frame parent) {
		super (parent, "Login", true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsername = new JLabel("Username :");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblUsername.setBounds(61, 11, 122, 38);
			contentPanel.add(lblUsername);
		}
		{
			JLabel lblPassword = new JLabel("Password :");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPassword.setBounds(61, 60, 122, 38);
			contentPanel.add(lblPassword);
		}
		
		passwordField = new JPasswordField();
		passwordField.setText(Login.Password);
		passwordField.setBounds(144, 71, 202, 20);
		contentPanel.add(passwordField);
		
		textField = new JTextField();
		textField.setText(Login.Login);
		textField.setBounds(144, 22, 202, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			JLabel lblNewmdp = new JLabel("New password :");
			lblNewmdp.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewmdp.setBounds(25, 116, 104, 17);
			contentPanel.add(lblNewmdp);
		}
		{
			JLabel lblRetaper = new JLabel("Confirm :");
			lblRetaper.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblRetaper.setBounds(61, 145, 73, 14);
			contentPanel.add(lblRetaper);
		}
		{
			passwordField_1 = new JPasswordField();
			passwordField_1.setBounds(144, 116, 202, 20);
			contentPanel.add(passwordField_1);
		}
		{
			passwordField_2 = new JPasswordField();
			passwordField_2.setBounds(144, 144, 202, 20);
			contentPanel.add(passwordField_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("CONFIRM");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
//						if (!(passwordField_1.equals(""))) {
						if (Arrays.equals(passwordField_1.getPassword(), passwordField_2.getPassword())) {
							JOptionPane.showMessageDialog(ChangeDialog.this,
									"Password changed",
									"Login",
									JOptionPane.INFORMATION_MESSAGE);
							String newpwd = new String (passwordField_1.getPassword());
							Login.Password = newpwd;
							dispose();
						} else {
							JOptionPane.showMessageDialog(ChangeDialog.this,
									"New password not match",
									"Login",
									JOptionPane.ERROR_MESSAGE);
							textField.setText("");
							passwordField.setText("");
							passwordField_1.setText("");
							passwordField_2.setText("");
							
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						passwordField.setText("");
						textField.setText("");
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public boolean isSucceeded() {
		return succeeded;
	}
	
	public String getUsername() {
		// TODO Auto-generated method stub
		return textField.getText().trim();
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return new String (passwordField.getPassword());
	}
	
}
