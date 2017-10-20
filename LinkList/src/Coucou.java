import java.util.Scanner;
import java.util.ArrayList;

public class Coucou {
    public static void main (String[] args) {

        Scanner entry = new Scanner(System.in);
        ArrayList<Double> notreArray = new ArrayList<Double>();

      
        while (notreArray.size() < 20) {
            Double numeroUtilisateur = entry.nextDouble();
            notreArray.add(numeroUtilisateur);
        }

        System.out.println("c\'est bon");
        System.out.println(notreArray);


//        for(int i = 0; i < notreArray.size() ; i++) {
//
//            double sum = 0;
//
//            sum += notreArray.get(i);
//
//            double moyenne = sum / notreArray.size();
//
//            if(notreArray.get(i)>moyenne) {
//
//                
//
//            }
//
//        }
//
        
    }
}