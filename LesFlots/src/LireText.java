import java.io.*;

public class LireText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File f = new File ("MonFic.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String ligne = null;
	while((ligne = br.readLine()) != null){
		System.out.println(ligne);
	}
	br.close();
	} catch (IOException ex) { ex.printStackTrace(); 	
	}
}
	}
