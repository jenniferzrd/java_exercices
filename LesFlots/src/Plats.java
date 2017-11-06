import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String plat = "";

		try {
			FileWriter fr = new FileWriter("Mesplats.txt", true);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			for (int i = 0; i < 5; i++) {
				System.out.println("Saisissez un plat");
				plat = br.readLine();
				fr.write(plat + "\r\n");
			}
			fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Merci, votre dernier plat est : " + plat);
	}
}

//CTRL SHIFT F INDENTATION
