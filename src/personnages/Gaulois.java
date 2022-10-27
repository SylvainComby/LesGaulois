package personnages; 

public class Gaulois{
	int effetPotion = 1;
	public String getNom() {
		return nom;
	}


	int force;
	private String nom;
	public Gaulois(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
				+ romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		this.parler("Merci Druiude, je sens que ma force est"+ effetPotion +"fois décuplée.");
	}
	@Override
	public String toString() {
		return " [nom=" + nom + "]";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}


	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 4);
		Romain caesus = new Romain("Caesus",7);
		System.out.println(asterix);
		asterix.parler("Les romains vous êtes tous des Romaines");
		asterix.boirePotion(7);
		asterix.frapper(caesus);
		

	}

}
