
public class exercices_day2_java {

	double height;
	double width;
	
	public static void perimetre(float width, float height) {
		float perimetre =  2 * (height + width);
		System.out.println("le Premietre est de " + perimetre);
	}

	public static void area (float width, float height) {
		float area =  height * width;
		System.out.println("l'Area est de " + area);
	}

	public static void main (String[] args) {
		area(8.5f, 5.6f);
		perimetre(8.5f, 5.6f);
	}

}