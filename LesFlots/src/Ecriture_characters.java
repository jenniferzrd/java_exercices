import java.io.FileWriter;
import java.io.IOException;


public class Ecriture_characters {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter ("MonFic.txt");
				
			fw.write("13424324\n25425435\n1254354365\n54364365365\n+-(*-)\n+-(*-)\n+-(*-)\nehgdfekuzfezfg\nehgdfekuzfezfg\nehgdfekuzfezfg");
			fw.close();
			
		} catch (IOException ex) { ex.printStackTrace();
		
		}
	}

}
