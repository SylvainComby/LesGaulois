package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scénario {

	public static void main(String[] args) {
		Druide panoramix =new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obélix", 255);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus",30);
		panoramix.parler("Je vais aller préparer une petite potion");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Belenos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
