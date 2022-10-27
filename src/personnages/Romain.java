package personnages;

public class Romain{
	private String nom;
	private int force;
	private int nbEquipement=0;
	private Equipement equipement[] = new Equipement[2];
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert(this.force>0);
	}
	public String getNom() {
		return nom;
	}
	public int getnbEquipement() {
		return nbEquipement ;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert(this.force>0);
		int forceDebut = this.force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert(forceDebut>=this.force);
	}
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat "+this.nom+" est déjà bien protégé !");
			break;
		case 1:
			if (this.equipement[0] == equipement) {
				System.out.println("Le soldat "+this.nom+" possède déjà "+ equipement.getNom());
			}
			else {
				this.equipement[1]=equipement;
				nbEquipement+=1;
				System.out.println("le soldat "+this.nom+ " s'équipe avec un "+ equipement.getNom());
			}
			break;
		case 0:
			this.equipement[0]=equipement;
			nbEquipement+=1;
			System.out.println("le soldat "+this.nom+" s'équipe avec un "+ equipement.getNom());
			break;
		}
	}

	public static void main(String[] args) {
		Romain caesus = new Romain("Caesus", 6);
		caesus.sEquiper(Equipement.CASQUE);
		System.out.println(caesus.getnbEquipement());
		caesus.sEquiper(Equipement.CASQUE);
		System.out.println(caesus.getnbEquipement());
		caesus.sEquiper(Equipement.BOUCLIER);
		System.out.println(caesus.getnbEquipement());
		caesus.sEquiper(Equipement.CASQUE);
		System.out.println(caesus.getnbEquipement());
		
		
	}
}
