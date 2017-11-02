import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Exo_HashTable_2 {
    Hashtable clientAccounts;
    Scanner scan;

    public Exo_HashTable_2() {
        this.clientAccounts = new Hashtable();
        this.scan = new Scanner(System.in);
    }

    public void addAccount(){
        System.out.println("Saisissez le numero de compte");
        int account = scan.nextInt();
        System.out.println("Saisissez le nom du client");
        String client= scan.next();
        if(client != null && account != 0) {
            this.clientAccounts.put(client, account);
        }
    }

    public void removeAccount(){
        System.out.println("Saisissez le client a supprimer");
        String client = scan.next();
        if(this.clientAccounts.containsKey(client)){
            this.clientAccounts.remove(client);
            System.out.println("Le numéro de compte a été supprimé\n");
        } else {
            System.out.println("Ce numéro de compte n'existe pas\n");
        }
    }

    public void displayAccounts(){
        Enumeration clientAccountsEnum = this.clientAccounts.keys();
        List clientList = Collections.list(clientAccountsEnum);
        Collections.sort(clientList);

        for(Object name: clientList) {
            Object client = name;
            System.out.println("Client: " + client + ", Compte: " + this.clientAccounts.get(client));
        }
    }

    public static void main(String[] args){

        Exo_HashTable_2 instance = new Exo_HashTable_2();

        instance.addAccount();
//        instance.addAccount();
//        instance.addAccount();

        instance.removeAccount();

        instance.displayAccounts();

    }
}
