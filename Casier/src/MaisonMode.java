import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;


public class MaisonMode {

	int idMaisonMode;
	String nameMaisonMode;
	Hashtable topModel = new Hashtable();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaisonMode instance = new MaisonMode();
		instance.topModel.put("Gwen", 5);
		instance.topModel.put("Jenny", 5);
		instance.topModel.put("Hayet", 5);
		instance.topModel.put("Amina", 5);
		instance.topModel.put("Agathe", 5);
		
		List e = Collections.list(instance.topModel.keys());
		Collections.sort(e);
		ListIterator i = e.listIterator();
		while(i.hasNext()) {
			System.out.println("Le TOP MODEL:" + i.next() + "ID:" + instance.idMaisonMode);
			
		}
			
	
	}

}
