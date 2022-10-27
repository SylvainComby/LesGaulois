package personnages;

public enum Equipement {
	CASQUE("Casque"), BOUCLIER("Bouclier");
	
	private String nom;
	
	public String getNom() {
		return nom;
	}
	private Equipement(String nom) {
		this.nom = nom;
	}
	public String toString() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void afficherEquipement () {
		System.out.println("les équipements sont :");
		for ( Equipement equipement : Equipement.values()) {
			System.out.println("-"+ equipement);
		}	
	}

}
