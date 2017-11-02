import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nb = new Scanner(System.in);
		System.out.println("Insérer un nombre: ");
		double nombre = nb.nextDouble();
		
		if ( nombre == 0){
			System.out.println("est égal à 0");
		} 
		else if ( nombre < 0) {
			System.out.println("est négatif");
		}
		
		else {
			System.out.println("est positif");
		}
		
		double nombreAbsolu = Math.abs(nombre);
		
		if( nombreAbsolu < 1) {
			System.out.println("est petit");
		} else if (nombreAbsolu > 1000000) {
			System.out.println("est grand");
			
		}
	}

}
