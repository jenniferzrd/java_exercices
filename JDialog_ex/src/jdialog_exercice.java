import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class jdialog_exercice extends JFrame {

	private JPanel contentPane;
	static jdialog_exercice frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new jdialog_exercice();
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
	public jdialog_exercice() {
		setTitle("JDialog Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton btnChangeMdp = new JButton("Change MDP");
		btnChangeMdp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangeDialog changeDlg = new ChangeDialog(frame);
				changeDlg.setVisible(true);
				
			}
		});
		
		final JButton btnClickMe = new JButton("Click Me !");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginDialog loginDl = new LoginDialog (frame);
				loginDl.setVisible(true);
				
				if (loginDl.isSucceeded()) {
					btnClickMe.setText("Hi" + loginDl.getUsername() + "!");
					btnChangeMdp.setVisible(true);
				}
			}
		});


		btnChangeMdp.setBounds(220, 53, 136, 23);
		contentPane.add(btnChangeMdp);
		btnClickMe.setBounds(220, 169, 136, 31);
		contentPane.add(btnClickMe);
		btnChangeMdp.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Simplon\\java\\cours\\snap2.jpg"));
		lblNewLabel.setBounds(10, 11, 414, 239);
		contentPane.add(lblNewLabel);
	}
}
