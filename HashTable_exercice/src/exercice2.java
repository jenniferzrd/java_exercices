import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;


public class exercice2 {

	Scanner saisieUtilisateur = new Scanner(System.in);
	Hashtable compteClient = new Hashtable();
	
	public void addAccount(){
		System.out.println("Entrez le numéro de compte");
		int account = saisieUtilisateur.nextInt();
		System.out.println("Entrez le nom du client");
		String nomClient = saisieUtilisateur.next();
	}
	
	public static void main(String[] args) {
	
		}
		
//		compteClient.put("Jean","0132467893");
//		compteClient.put("Marie","0145679837");
//		compteClient.put("Barbelampino","0183672920");
//		compteClient.put("Marc","0173920217");

//		System.out.println("Entrez le numéro de compte");
//		String numeroCompte = saisieUtilisateur.next();
//
//		if(compteClient.containsKey(numeroCompte)) {
//			compteClient.remove(numeroCompte);
//		} else {
//			System.out.println("Le numéro de compte n'est pas reconnu");
//		}
//		
//		System.out.println("Entrez votre nom");
		
//		if(!compteClient.containsKey(numeroCompte)) {
//			compteClient.Add()
//		} else {
//			System.out.println("Le numéro de compte n'est pas reconnu");
//		}
		
//		Enumeration e = compteClient.keys();
//	    while (e.hasMoreElements()) {
//	      String key = (String) e.nextElement(); // renvoie la clé
//	      System.out.println(key + " : " + compteClient.get(key));
//	    }
//	}

}
