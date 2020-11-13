package appli;

import behaviors.ComportementArme;

public class Personnage {
	
	ComportementArme arme;
	
	public void combattre() {
		this.arme.utiliserArme();
	}
	
	public void setArme(ComportementArme a) {
		this.arme = a;
	}

}
