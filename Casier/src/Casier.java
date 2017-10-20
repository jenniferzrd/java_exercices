import java.util.Scanner;

public class Casier {
	
	static int[] tab = new int [10];
	
	public static void StockageEntier() {
		
		for (int i=0; i<10; i++) {
			Scanner s = new Scanner(System.in);
			int number = s.nextInt();
			tab[i] = number;
			}	
	}
	
	//Pour afficher le tableau on fait une autre méthode
	
	public static void AffichageEntiers(int[] tableau) {
		for (int i=0; i<tableau.length; i++) {
		System.out.println(tableau[i]);
		}
	}
	
	public static void main (String[] args) {
		
		Casier nombres = new Casier();
		StockageEntier();
		AffichageEntiers(tab);
	}
	
}
