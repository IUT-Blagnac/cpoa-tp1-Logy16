package appli;

import behaviors.ComportementArme;

public class Personnage {
	
	ComportementArme arme;
	
	public void combattre() {
		this.arme.utiliserArme();
	}

}
