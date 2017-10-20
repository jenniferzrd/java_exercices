import java.util.LinkedList; 
import java.util.List; 
import java.util.ListIterator; 
import java.util.Collections;


public class linkedlist_exercise {

	public static void main(String[] args) {

			List student = new LinkedList();
			student.add("Jean"); 
			student.add("Philippe"); 
			student.add("Corine"); 
			student.add("Isabelle");
			student.add("Charles");
			student.add("Paul");
			
			for(int i = 0; i < student.size(); i ++) {
				String longueur = student.get(i).toString();
				System.out.println(longueur.length());
			}
			
			ListIterator li = student.listIterator(); 
			while(li.hasNext()) 
				System.out.println(li.next()); 
			while(li.hasPrevious()) 
				System.out.println(li.previous()); 
			
			Collections.sort(student);
			System.out.println(student);
		
}
}