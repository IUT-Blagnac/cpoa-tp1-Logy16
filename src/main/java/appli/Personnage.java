package appli;

import behaviors.ComportementArme;

public class Personnage implements ComportementArme{
	
	ComportementArme arme;
	
	public void combattre() {
		this.arme.utiliserArme();
	}

	@Override
	public void utiliserArme() {
		// TODO Auto-generated method stub
		
	}

}
