import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;

//Un prog Hastable
//1. stocker les telephones services des départements différent banque
//2. L'utilisateur donnant le nom d'un service peut le supprimer s'il existe
//3. Puis afficher les enregistrements sous la forme :
//	
//		Département: XXXXXXXXX Téléphone: XXXXXX

// 		Commercial/Com/Informatique/SAV

// 4. Stocker les comptes des clients différents de banque
// 5. Le responsable d'accueil peut gérer les comptes ajouter et 
// supprimer des comptes clients s'ils existent
// 6. Trier les clients par ordre alphab
// 7. Puis afficher les enregistrements sous la forme :
// client : XXXXX Compte : XXXXX

public class exercice {

	public static void main(String[] args) {

		Scanner saisieUtilisateur = new Scanner(System.in);
		
		Hashtable banque = new Hashtable();
		banque.put("compta","0132467893");
		banque.put("agence","0145679837");
		banque.put("communication","0183672920");
		banque.put("commercial","0173920217");
		
		System.out.println("Choisissez un département");
		String departement = saisieUtilisateur.next();
		
		if(banque.containsKey(departement)) {
			banque.remove(departement);
		} else {
			System.out.println("Le département n'est pas reconnu");
		}
		
		Enumeration e = banque.keys();
	    while (e.hasMoreElements()) {
	      String key = (String) e.nextElement(); // renvoie la clé
	      System.out.println(key + " : " + banque.get(key));
	    }
	}

}
