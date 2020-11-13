import appli.*;
import behaviors.ComportementArme;
import behaviors.Epee.ComportementEpee;


public class main {

	public static void main(String[] args) {
		Personnage p1 = new Chevalier();
		ComportementArme epee1 = new ComportementEpee();
		p1.setArme(epee1);
		p1.combattre();
	}

}
