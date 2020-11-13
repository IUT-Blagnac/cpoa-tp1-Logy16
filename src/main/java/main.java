import appli.*;
import behaviors.ComportementArme;
import behaviors.Arc.ComportementArc;
import behaviors.Epee.ComportementEpee;
import behaviors.Poignard.ComportementPoignard;


public class main {

	public static void main(String[] args) {
		ComportementArme MasterSword = new ComportementEpee();
		ComportementArme RhoAias = new ComportementPoignard();
		ComportementArme ArcOfLight = new ComportementArc();
		Personnage p1 = new Chevalier(MasterSword);
		p1.combattre();
		p1.setArme(ArcOfLight);
		p1.combattre();
	}

}
