package appli;

import behaviors.ComportementArme;

public class Roi extends Personnage{

	public Roi(ComportementArme a) {
		super(a);
	}
	
	public void combattre() {
		System.out.print("Je suis un roi et ");
		super.combattre();
	}
}
