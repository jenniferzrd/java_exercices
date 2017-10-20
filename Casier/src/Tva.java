/*
 Définir une classe avec un constructeur, une méthode et créer une instance de cette classe
 Un programme qui calcule les montants de la TVA pour 10 montants d'une table
 Le calcul sera fait dans une méthode qui accepte comme parametre : le tableau des montants
 et le taux de TVA
 La méthode calcule les montants de la TVA et les ajoute dans le tableau
 Enfin, le programme principal affiche le tableau des montants de TVA
 
 */

import java.util.Hashtable;


public class Tva {
	
	public Tva() {
	
	}
	public Hashtable calculTva(double[] tableau, double tva) {
		
		Hashtable nouveauxMontants = new Hashtable();
		for(double montant: tableau){
			double montantTva = (montant * tva) / 100;
			nouveauxMontants.put(montant, montantTva);
		}
		return nouveauxMontants;
		
	}
    public static void main(String[] args) {
    	
    	Tva instance = new Tva();
    	double[] table = {12,34,45,56,76,67,78,12,67,8,78,34};
    	
    	Hashtable tableau = instance.calculTva(table, 20);
    	System.out.println(tableau);
    	for(double i : table) {
    		System.out.println("montant: " + i + " tva:" + tableau.get(i));
    	}
    
    }
	
}
