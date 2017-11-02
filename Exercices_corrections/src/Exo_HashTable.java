import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Exo_HashTable {


    public static void main(String[] args){

        Hashtable banque = new Hashtable();
        Scanner scan = new Scanner(System.in);

        banque.put("Comptabilité", "014566984566");
        banque.put("Ressources Humaines", "014566984567");
        banque.put("Informatique", "014566984568");
        banque.put("Direction", "014566984569");
        banque.put("Commercial", "014566984560");

        System.out.println("Choisissez un département à supprimer");
        String departement = scan.next();

        if(banque.containsKey(departement)){
            banque.remove(departement);
        } else {
            System.out.println("Le département n'existe pas\n");
        }


        Enumeration banqueList = banque.keys();

        while(banqueList.hasMoreElements()){
            String key = (String) banqueList.nextElement();
            System.out.println(key + " : " + banque.get(key));
        }

    }
}
