package appli;

import behaviors.ComportementArme;

abstract public class Personnage {
	
	ComportementArme arme;
	
	public Personnage() {

	}
	
	public Personnage(ComportementArme a) {
		this.setArme(a);
	}
	
	public void combattre() {
		this.arme.utiliserArme();
	}
	
	public void setArme(ComportementArme a) {
		this.arme = a;
	}

}
