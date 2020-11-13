package appli;

import behaviors.ComportementArme;

abstract public class Personnage {
	
	ComportementArme arme;
	
	public Personnage(ComportementArme a) {
		this.setArme(a);
	}
	
	public void combattre() {
		this.arme.utiliserArme();
	}
	
	private void setArme(ComportementArme a) {
		this.arme = a;
	}

}
