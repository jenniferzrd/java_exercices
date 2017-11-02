import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Student_test extends JFrame {

    JTable table = new JTable();
    
	public enum Sport {
        TENNIS,
        FOOTBALL,
        NATATION,
        RIEN
    }
	
	public Student_test() {

	    String[] entete = {"Prenom", "Nom", "Couleur favorite", "Homme", "Sport"};
	    Object[][] donnees = {
	            {"Johnathan","Sykes",Color.red, true, Sport.TENNIS},
	            {"Nico","Van de Kampf",Color.black, true, Sport.FOOTBALL},
	            {"Damien","Cuthbert",Color.cyan, true, Sport.RIEN},
	            {"Corinne","Sykes",Color.blue, false, Sport.NATATION},
	            {"Philippe","Faiyech",Color.magenta, true, Sport.FOOTBALL},
	            {"Emilie","Duke",Color.yellow, false, Sport.TENNIS},
	            {"Eric","Trump",Color.pink, true, Sport.FOOTBALL}
	    };
	    JTable table = new JTable(donnees, entete);
	    
	    getContentPane().add(table.getTableHeader(), BorderLayout.NORTH);
	    getContentPane().add(table, BorderLayout.CENTER);
	    
	    }

	public int getRowCount() {
		return this.table.getRowCount();
	}
	
	public int getColumnCount() {
		return this.table.getColumnCount();
	}
	
	public Object getValueAt(int rowIndex, int columnIndex ) {
		return this.table.getValueAt(rowIndex, columnIndex);
	}
	
	public Object getColumnName(int columnIndex ) {
		return this.table.getColumnName(columnIndex);
	}
	
		public void main(String[] args) {
	        new Student_test().setVisible(true);
	    }

	    
	
}
