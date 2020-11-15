package appli;

import behaviors.ComportementArme;

public class Chevalier extends Personnage{

	public Chevalier(ComportementArme a) {
		super(a);
	}
	
	public void combattre() {
		System.out.print("Je suis un chevalier et ");
		super.combattre();
	}
	
	
}
