
public class exercice_43 {

	public static void main (String[] args) {

		int numberOfSpaces = 7;
		//String space = String.format("%" +numberOfSpaces + "s", "");
		String space= String.format("%", +numberOfSpaces +"s","");

		System.out.println("Twinkle, twinkle, little star,");
		System.out.println(space + "How I wonder what you are!");
		System.out.println(space + space + "Up above the world so high,");
		System.out.println(space + space + "Like a diamond in the sky. ");
		System.out.println("Twinkle, twinkle, little star,");
		System.out.println(space + "How I wonder what you are");
	}

}
