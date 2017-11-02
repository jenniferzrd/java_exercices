
public class Login {
	
	public static String Login = "admin";
	public static String Password = "admin";
	
	public Login () {
//		On fait ici un constructeur
//		et une méthode pour verifier le mot de passe et le nom d'utilisateur
	}
	public static boolean authenticate (String username, String password) {
		if (username.equals(Login) && password.equals(Password)) {
			return true;
		} 
		return false;
	}
	
}
