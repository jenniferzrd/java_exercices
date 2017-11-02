import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTable;


public class Etudiants_exercice extends JFrame {

public enum Sport {
	TENNIS,
	FOOTBALL,
	NATATION,
	RIEN
}
	
	public class Tableau {
		
		String [] entetes = { "Prenom", "Nom", "Couleur favorite", "Homme", "Sport" };
		Object [][] donnees = {
				{"Jo", "Sykes", Color.red, true, Sport.TENNIS},
				{"Nico", "VandeKamf", Color.black, true, Sport.FOOTBALL},
				{"Damien", "Cuthbert", Color.cyan, true, Sport.RIEN},
				{"Corinne", "Sykes", Color.blue, false, Sport.NATATION},
				{"Philippe", "Faiyech", Color.magenta, false, Sport.FOOTBALL},
				{"Emilie", "Duke", Color.yellow, false, Sport.TENNIS},
				{"Eric", "Trump", Color.pink, true, Sport.FOOTBALL}
		};
		
		JTable table = new JTable(donnees, entetes);
		getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
		getContentPane().add(tableau, BorderLayout.CENTER);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tableau().setVisible(true);

	}

}
