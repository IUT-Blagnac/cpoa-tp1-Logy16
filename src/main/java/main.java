import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import appli.*;
import behaviors.ComportementArme;
import behaviors.Arc.ComportementArc;
import behaviors.Epee.ComportementEpee;
import behaviors.Poignard.ComportementPoignard;


public class main {

	public static void main(String[] args) {
		List<Personnage> listPersonnage = new ArrayList<>();
		ComportementArme MasterSword = new ComportementEpee();
		ComportementArme RhoAias = new ComportementPoignard();
		ComportementArme ArcOfLight = new ComportementArc();
		Personnage p1 = new Chevalier(MasterSword);
		Personnage p2 = new Roi(RhoAias);
		p2.combattre();
		p1.combattre();
		p1.setArme(ArcOfLight);
		p1.combattre();
		int choix=1;
		int choix2=0;
		int choixarme=0;
		
		while(choix!=0) {
			System.out.println("Saisissez l'action à faire : ");
			System.out.println("1 - Créer un personnage");
			System.out.println("2 - Modifier l'arme d'un personnage");
			System.out.println("3 - Supprimer un personnage");
			System.out.println("4 - Afficher les personnages et leurs comportements");
			System.out.println("5 - Quitter");
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();
			switch(choix) {
				case 1: 
					System.out.println("Choississez le type de votre personnage :");
					System.out.println("1 - Roi");
					System.out.println("2 - Reine");
					System.out.println("3 - Chevalier");
					System.out.println("4 - Troll");
					choix2 = sc.nextInt();
					System.out.println("Quel arme utilisera t-il :");
					System.out.println("1 - Epee");
					System.out.println("2 - Arc");
					System.out.println("3 - Poignard");
					choixarme = sc.nextInt();
					if(choix2==1) {
						if(choixarme==1)
							listPersonnage.add(new Roi(new ComportementEpee()));
						if(choixarme==2)
							listPersonnage.add(new Roi(new ComportementArc()));
						if(choixarme==3)
							listPersonnage.add(new Roi(new ComportementPoignard()));
					}
					if(choix2==2) {
						if(choixarme==1)
							listPersonnage.add(new Reine(new ComportementEpee()));
						if(choixarme==2)
							listPersonnage.add(new Reine(new ComportementArc()));
						if(choixarme==3)
							listPersonnage.add(new Reine(new ComportementPoignard()));
					}
					if(choix2==3) {
						if(choixarme==1)
							listPersonnage.add(new Chevalier(new ComportementEpee()));
						if(choixarme==2)
							listPersonnage.add(new Chevalier(new ComportementArc()));
						if(choixarme==3)
							listPersonnage.add(new Chevalier(new ComportementPoignard()));
					}
					if(choix2==4) {
						if(choixarme==1)
							listPersonnage.add(new Troll(new ComportementEpee()));
						if(choixarme==2)
							listPersonnage.add(new Troll(new ComportementArc()));
						if(choixarme==3)
							listPersonnage.add(new Troll(new ComportementPoignard()));
					}
					break;
				case 2:
					System.out.println("Choississez le personnage qui doit changer d'arme :");
					for(int i=0;i<listPersonnage.size();i++) {
						System.out.print("Personnage "+(i+1)+" : ");
						listPersonnage.get(i).combattre();
					}
					choix2 = sc.nextInt();
					System.out.println("Quel arme doit-il maintenant utiliser :");
					System.out.println("1 - Epee");
					System.out.println("2 - Arc");
					System.out.println("3 - Poignard");
					choixarme = sc.nextInt();
					if(choixarme==1)
						listPersonnage.get(choix2-1).setArme(new ComportementEpee());
					if(choixarme==2)
						listPersonnage.get(choix2-1).setArme(new ComportementArc());
					if(choixarme==3)
						listPersonnage.get(choix2-1).setArme(new ComportementPoignard());
					break;
				case 3:
					System.out.println("Choississez le personnage à supprimer :");
					for(int i=0;i<listPersonnage.size();i++) {
						System.out.print("Personnage "+(i+1)+" : ");
						listPersonnage.get(i).combattre();
					}
					choix2 = sc.nextInt();
					listPersonnage.remove(choix2-1);
					break;
				case 4:
					for(int i=0;i<listPersonnage.size();i++) {
						System.out.print("Personnage "+(i+1)+" : ");
						listPersonnage.get(i).combattre();
					}
					break;
				case 5:
					choix=0;
					break;
			}
		}
	}

}
