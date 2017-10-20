
public class exercice_20 {
int a;
	public static String integerToHexa (int b) {
	String hexa = Integer.toHexString(b).toUpperCase();
	return hexa;
	}
	
	public static void main (String[] args) {
		String str = integerToHexa(15);
		System.out.println(str);
		}
}
