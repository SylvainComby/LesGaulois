package personnages;

import java.util.Arrays;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois ;
	private Gaulois villageois[]= new Gaulois [0];
	public Village(String nom, int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.villageois =new Gaulois [nbVillageoisMaximum];
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois nouvelHabitant) {
		villageois[nbVillageois] = nouvelHabitant;
		nbVillageois += 1;
	}
	public Gaulois trouverHabitant(int n) {
		return villageois[n];
	}
	public void afficherHabitant() {
		System.out.println("Dans le village du Chef "+this.getNom()+" vivent les non moins légendaires gaulois :" );
		int i = 0;
		for (;i < this.getNbVillageois(); i+=1) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	public int getNbVillageois() {
		return nbVillageois;
	}
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		Chef abraracoursix = new Chef("Abraracoursix",6,village);
		Gaulois asterix=new Gaulois("Astérix",8);
		Gaulois obelix=new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.ajouterHabitant(asterix);
		village.afficherHabitant();

		//		Gaulois gaulois = village.trouverHabitant(1);
		//		System.out.println(village);
		//		Gaulois gaulois = village.trouverHabitant(30);
		//		30 est trop grand, out of bound

	}
	@Override
	public String toString() {
		return "Village [nom=" + nom + ", chef=" + chef + ", nbVillageois=" + nbVillageois + ", villageois="
				+ Arrays.toString(villageois) + "]";
	}
}
