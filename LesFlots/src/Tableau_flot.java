import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tableau_flot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] t = {1, 2, 3, 4};
		try {
		DataOutputStream os = new DataOutputStream (
//				new FileOutputStream ("C:\\Users\Simplon\workspace\LesFlots\src\data.bin"));
				new FileOutputStream ("data.bin"));
				
		for (int j=0; j < t.length; j++) 
			os.writeInt(t[j]);
			os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
