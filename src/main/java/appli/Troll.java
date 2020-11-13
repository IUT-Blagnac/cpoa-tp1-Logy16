package appli;

import behaviors.ComportementArme;

public class Troll extends Personnage{

	public Troll(ComportementArme a) {
		super(a);
	}

	public void combattre() {
		System.out.print("Je suis un troll et ");
		super.combattre();
	}

}
