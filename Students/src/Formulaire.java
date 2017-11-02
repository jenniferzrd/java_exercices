import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;


public class Formulaire extends JFrame {

	private JPanel contentPane;
	private JTextField tNom;
	private JTextField tPrenom;
	private JTextField tAge;
	private JTextField tVille;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulaire frame = new Formulaire();
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
	public Formulaire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{66, 86, 43, 93, 0};
		gbl_contentPane.rowHeights = new int[]{89, 52, 48, 48, 0, 0, 58, 1, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Nom");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		tNom = new JTextField();
		GridBagConstraints gbc_tNom = new GridBagConstraints();
		gbc_tNom.fill = GridBagConstraints.HORIZONTAL;
		gbc_tNom.insets = new Insets(0, 0, 5, 5);
		gbc_tNom.gridx = 1;
		gbc_tNom.gridy = 0;
		contentPane.add(tNom, gbc_tNom);
		tNom.setColumns(10);
		
		JButton btnAjout = new JButton("AJOUT");
//------
		GridBagConstraints gbc_btnAjout = new GridBagConstraints();
		gbc_btnAjout.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAjout.insets = new Insets(0, 0, 5, 0);
		gbc_btnAjout.gridx = 3;
		gbc_btnAjout.gridy = 0;
		contentPane.add(btnAjout, gbc_btnAjout);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tPrenom = new JTextField();
		GridBagConstraints gbc_tPrenom = new GridBagConstraints();
		gbc_tPrenom.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_tPrenom.gridx = 1;
		gbc_tPrenom.gridy = 1;
		contentPane.add(tPrenom, gbc_tPrenom);
		tPrenom.setColumns(10);
		
	
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 1;
		
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tAge = new JTextField();
		GridBagConstraints gbc_tAge = new GridBagConstraints();
		gbc_tAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_tAge.insets = new Insets(0, 0, 5, 5);
		gbc_tAge.gridx = 1;
		gbc_tAge.gridy = 2;
		contentPane.add(tAge, gbc_tAge);
		tAge.setColumns(10);
		

		GridBagConstraints gbc_btnModif = new GridBagConstraints();
		gbc_btnModif.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModif.insets = new Insets(0, 0, 5, 0);
		gbc_btnModif.gridx = 3;
		gbc_btnModif.gridy = 2;

		
		JLabel lblNewLabel_3 = new JLabel("Ville");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		tVille = new JTextField();
		GridBagConstraints gbc_tVille = new GridBagConstraints();
		gbc_tVille.fill = GridBagConstraints.HORIZONTAL;
		gbc_tVille.insets = new Insets(0, 0, 5, 5);
		gbc_tVille.gridx = 1;
		gbc_tVille.gridy = 3;
		contentPane.add(tVille, gbc_tVille);
		tVille.setColumns(10);
		
		JLabel lblTableau = new JLabel("Tableau Etudiants");
		GridBagConstraints gbc_lblTableau = new GridBagConstraints();
		gbc_lblTableau.insets = new Insets(0, 0, 5, 5);
		gbc_lblTableau.gridx = 0;
		gbc_lblTableau.gridy = 4;
		contentPane.add(lblTableau, gbc_lblTableau);
		
		JLabel lblNewLabel_4 = new JLabel("Pr\u00E9nom");
		lblNewLabel_4.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.gridx = 1;
		gbc_lblNom.gridy = 5;
		contentPane.add(lblNom, gbc_lblNom);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 2;
		gbc_lblAge.gridy = 5;
		contentPane.add(lblAge, gbc_lblAge);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblVille = new GridBagConstraints();
		gbc_lblVille.insets = new Insets(0, 0, 5, 0);
		gbc_lblVille.gridx = 3;
		gbc_lblVille.gridy = 5;
		contentPane.add(lblVille, gbc_lblVille);
		
		table_1 = new JTable();
		
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Pierre", "Hello", "30", "Paris"},
	            {"Nico","Van de Kampf","25","Bruxelles"},
	            {"Damien","Cuthbert","22","Lyon"},
	            {"Corinne","Sykes","70","Sevran"},
	            {"Philippe","Faiyech","40","Vaujours"},
	            {"Emilie","Duke","32","Tremblay"},
	            {"Eric","Trump","65","Aulnay sous bois"}
			},
			new String[] {
				"Prenom", "Nom", "Age", "Ville"
			}
		));
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridheight = 2;
		gbc_table_1.gridwidth = 4;
		gbc_table_1.gridx = 0;
		gbc_table_1.gridy = 6;
		contentPane.add(table_1, gbc_table_1);
		
		btnAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
			DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				
				String Prenom = tPrenom.getText();
				String Nom = tNom.getText();
				String Age = tAge.getText();
				String Ville = tVille.getText();
				
				Object[] row = { Prenom, Nom, Age, Ville };
				
				System.out.println(Prenom + "" + Nom + "" + Age + "" + Ville);
				model.addRow(row);
			}
		});
		
		
		JButton btnNewButton = new JButton("SUPPR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int selectionnercolonne = table_1.getSelectedRow();
				if(selectionnercolonne != 1) {
				int modelIndex = table_1.convertRowIndexToView(selectionnercolonne);
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				model.removeRow(modelIndex);
				}
			}
		});
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnModif = new JButton("MODIF");
		btnModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
//		btnNewButton_change.addActionListener(new ActionListener() {
//
//			public void actionPerformed(ActionEvent arg0) {
//
//				int rowIndex =  table.getSelectedRow();
//
//				String lastname = table.getValueAt(rowIndex, 0).toString();
//
//				String firstname = table.getValueAt(rowIndex, 1).toString();
//
//				String age = table.getValueAt(rowIndex, 2).toString();
//
//				String city = table.getValueAt(rowIndex, 3).toString();
//
//				textField_last_name.setText(lastname);
//
//				textField_first_name.setText(firstname);
//
//				textField_age.setText(age);
//
//				textField_city.setText(city);
//
//				btnOk.setVisible(true);
//
//				btnOk.addActionListener(new ActionListener() {
//
//					public void actionPerformed(ActionEvent e) {
//
//						String newlastname = textField_last_name.getText();
//
//						String newfirstname = textField_first_name.getText();
//
//						String newage = textField_age.getText();
//
//						String newcity = textField_city.getText();
//
//						table.setValueAt(newlastname, rowIndex, 0);
//
//						table.setValueAt(newfirstname, rowIndex, 1);
//
//						table.setValueAt(newage, rowIndex, 2);
//
//						table.setValueAt(newcity, rowIndex, 3);
//
//					}
//
//				});
//
//			}
//
//		});
		contentPane.add(btnModif, gbc_btnModif);
	}

}
