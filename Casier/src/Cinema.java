import java.util.ArrayList;

public class Cinema {

    static String nomFilm;
    static ArrayList acteurs = new ArrayList();
    static String dateDeSortie;
    static int rate;

   
    public static String getMonFilm() {
        return nomFilm;
    }

   
    public static void setMonFilm(String film) {
        nomFilm = film;
    }

    
    public static String getDate() {
        return dateDeSortie;
    }

    

    public static void setDate(String date) {
        dateDeSortie = date;
    }


    public static int getRate() {
        return rate;
    }

    
    public static void setRate(int note) {
        rate = note;
    }

    

    public static ArrayList getActeurs() {
        return acteurs;
    }

  

    public static void setActeurs(ArrayList acteur) {
        acteurs = acteur;
    }



    public static void main(String[] args) {

        // TODO Auto-generated method stub

        setMonFilm("Pokemon le film");
        String f = getMonFilm();
        System.out.println(f);

        setDate("10 octobre 2017");
        String d = getDate();
        System.out.println(d);
    
        setRate(4);
        int r = getRate();
        System.out.println(r);
        
        ArrayList acteur = new ArrayList();
        acteur.add("Pika");
        acteur.add("Salameche");
        
        setActeurs(acteur);
        ArrayList a = getActeurs();
        System.out.println(a);
    }



}