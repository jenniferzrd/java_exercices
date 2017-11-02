import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class NombreLigneEtMot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File f = new File ("MonFic.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	LineNumberReader ln = new LineNumberReader(br);
	
	String ligne = null;
	String line = ln.readLine();
	
	while((ligne = br.readLine()) != null){
		System.out.println(ligne.length());
		
	}
	
	while (line != null)
	{
	   line = ln.readLine();
       System.out.println("Line Number " + ln.getLineNumber() +
               ": " + line);
	}
	
	br.close();
	ln.close();
	
	} catch (IOException a) { 
		a.printStackTrace(); 	
	}
}
	}
