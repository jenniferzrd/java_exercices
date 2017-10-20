
public class Habitation {
	String proprietaire;
	String adresse;
	private double surface;
	
	public Habitation(String proprietaire, String adresse, double surface) {
		
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.surface = surface;
		
	}
	
	public void Affiche() {
		System.out.println("Propietaire: " + this.proprietaire + " Adresse: " + this.adresse + "Surface: " + this.surface);
	}
	
	public double Impot() {
		double impot = 2 * this.surface;
		return impot;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Habitation maison = new Habitation("Steve", "2 rue des Sangliers 76016 PARIS", 155.00);
			maison.Affiche();
			System.out.println("merci de payer:" + maison.Impot()+ "$");
		}

}
