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
