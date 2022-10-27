package personnages;

import java.util.Random;

public class Druide{
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion =1;  
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom=nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}
	public void preparerPotion () {
		Random r=new Random();
		forcePotion=r.nextInt(effetPotionMin, effetPotionMax+1);
		if (forcePotion > 7) {
			this.parler("J'ai préparé un super potion de force"+forcePotion);
		}
		else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+forcePotion);
		}
		
		}
	public int getForcePotion() {
		return forcePotion;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void booster(Gaulois nom) {
		if (nom.getNom()=="Obélix") {
			this.parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}
		else {
			nom.boirePotion(forcePotion);
		}
	}
	public static void main(String[] args) {
		Druide panoramix=new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}


}
