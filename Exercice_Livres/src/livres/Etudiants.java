package livres;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Etudiants extends JFrame {

	public enum Sport {

        TENNIS,
        FOOTBALL,
        NATATION,
        RIEN
    }
	
	public Etudiants() {

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

		public void main(String[] args) {
	        new Etudiants().setVisible(true);
	    }

	    
	
}
