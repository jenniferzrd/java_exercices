import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Exercice_flot {
    public static void main (String[]args){

    try {

        URL webURL= new URL ("http://www.sample-videos.com/text/Sample-text-file-10kb.txt");
        BufferedReader line = new BufferedReader (new InputStreamReader(webURL.openStream()));

        // Flot de traitement pour les caractères ( buffer ).
        // Ce flot est chaîné au FileReader

        String ligne =line.readLine() ; // contiendra chaque ligne
        System.out.println(ligne);

    } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();

    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    }
}
