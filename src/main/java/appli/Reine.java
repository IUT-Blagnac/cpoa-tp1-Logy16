package appli;

import behaviors.ComportementArme;

public class Reine extends Personnage{

	public Reine(ComportementArme a) {
		super(a);

	}
	
	public void combattre() {
		System.out.print("Je suis une reine et ");
		super.combattre();
	}
}
