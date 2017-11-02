import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EcrireText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fw = new FileWriter ("MonFic.txt");
		
	fw.write("Bonjour");
	fw.close();
	
} catch (IOException ex) { ex.printStackTrace();}

	}
}
