// Calcul de la somme des 100 premiers entier entre 1 et 100 avec une classe d�finie
// On d�finit dans la classe Somme la m�thode main qui effectue tout le traitement
// La classe comme calcule et affiche la somme des 100 premiers entiers

public class Calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("Le r�sultat est:" + sum);
	}

}
