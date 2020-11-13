import appli.*;
import behaviors.ComportementArme;
import behaviors.Epee.ComportementEpee;


public class main {

	public static void main(String[] args) {
		ComportementArme epee1 = new ComportementEpee();
		Personnage p1 = new Chevalier(epee1);
		p1.combattre();
	}

}
