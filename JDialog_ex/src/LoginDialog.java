import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private JTextField textField;
	private boolean succeeded;
	static LoginDialog frame1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frame1 = new LoginDialog(null);
			//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frame1.setModal(true);
			frame1.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginDialog(Frame parent) {
		super (parent, "Login", true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsername = new JLabel("Username :");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblUsername.setBounds(73, 67, 122, 38);
			contentPanel.add(lblUsername);
		}
		{
			JLabel lblPassword = new JLabel("Password :");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPassword.setBounds(73, 116, 122, 38);
			contentPanel.add(lblPassword);
		}
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 127, 202, 20);
		contentPanel.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(156, 78, 202, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("LOGIN");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (Login.authenticate(getUsername(), getPassword())) {
							JOptionPane.showMessageDialog(LoginDialog.this,
									"Hi" + getUsername() + "You have succesfully logged in.",
									"Login",
									JOptionPane.INFORMATION_MESSAGE);
							succeeded = true;
							dispose();
						} else {
							JOptionPane.showMessageDialog(LoginDialog.this,
									"Invalid username or password",
									"Login",
									JOptionPane.ERROR_MESSAGE);
							textField.setText("");
							passwordField.setText("");
							succeeded = false;
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
