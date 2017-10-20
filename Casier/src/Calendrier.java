import java.util.Hashtable;
import java.util.Scanner;


public class Calendrier {

	int days;
	String month;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable calendar = new Hashtable();
		
		calendar.put("January",30);
		calendar.put("February",28);
		calendar.put("March",31);
		calendar.put("April",30);
		calendar.put("May",31);
		calendar.put("June",30);
		calendar.put("July",31);
		calendar.put("August",31);
		calendar.put("September",30);
		calendar.put("October",31);
		calendar.put("November",30);
		calendar.put("December",31);
		
		Scanner saisie = new Scanner(System.in);
		String month = saisie.nextLine();
		System.out.println(calendar.get(month));
	}

}
