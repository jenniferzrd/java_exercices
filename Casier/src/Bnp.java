import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ListIterator;

public class Bnp {
	
	String nameBank;
	int idBank;
	
	Hashtable noms = new Hashtable();
	
	public Bnp() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bnp instance = new Bnp();
		
		instance.noms.put("Gwen", 909776435);
		instance.noms.put("Jenny", 99976435);
		instance.noms.put("Hayet", 786776435);
		instance.noms.put("Amina", 987776435);
		instance.noms.put("Agathe", 456776435);
		
		instance.noms.remove("Agathe");
		instance.noms.remove("Amina");
//		System.out.println(instance.noms);
		
		//array length
		//size hashtable
		
			Enumeration e = instance.noms.keys();
		    while (e.hasMoreElements()) {
		      String key = (String) e.nextElement(); // renvoie la clé
		      System.out.println(key + " : " + instance.noms.get(key));
		    }
	}

}
