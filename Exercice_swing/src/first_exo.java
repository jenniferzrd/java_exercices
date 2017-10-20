
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class first_exo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first_exo frame = new first_exo();
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
	public first_exo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Simplon\\Pictures\\malediction.png"));
		setTitle("Ma petite fenetre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThisIsMy = new JLabel("This is my first Application !! :D");
		lblThisIsMy.setToolTipText("Ceci est une application SO FASHION DE OUF DE SA MERE");
		lblThisIsMy.setFont(new Font("DejaVu Sans", Font.BOLD, 11));
		lblThisIsMy.setBounds(27, 82, 235, 55);
		contentPane.add(lblThisIsMy);
		
		JButton btnMonBouton = new JButton("Mon bouton");
		btnMonBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "Java is fun");
			}
		});
		btnMonBouton.setBackground(new Color(255, 204, 153));
		btnMonBouton.setBounds(27, 139, 103, 23);
		contentPane.add(btnMonBouton);
		
		JButton btnPasToucher = new JButton("Pas toucher !");
		btnPasToucher.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnPasToucher.setBounds(140, 139, 97, 23);
		contentPane.add(btnPasToucher);
		
		JLabel label = new JLabel("");
		label.setToolTipText("Barry WHITE");
		label.setIcon(new ImageIcon("C:\\Users\\Simplon\\Pictures\\la_barry_white.jpg"));
		label.setBounds(10, 11, 252, 73);
		contentPane.add(label);
	}
}
