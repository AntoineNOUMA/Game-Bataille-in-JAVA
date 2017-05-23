package jeu;


public class JeuxEssai {

	public static void main(String[] args) {
		try{
			//Essai 1
			System.out.println("!!! ESSAI 1 !!!");
			Partie p;
			p=Partie.initialiseJeuEssai1();
			p.lancementPartie();
			
			//Essai 2
			System.out.println();
			System.out.println("!!! ESSAI 2 !!!");
			p=Partie.initialiseJeuEssai2();
			p.lancementPartie();
			
			
			//Essai 3
			System.out.println();
			System.out.println("!!! ESSAI 3 !!!");
			p=Partie.initialiseJeuEssai3();
			p.lancementPartie();
			
			
			//Vrai Partie 
			/*
			p=Partie.initialiseJeu();
			System.out.println("Initialise-Jeu FINI !");
			p.lancementPartie();
			*/
		}
		catch(Exception e){
			System.out.println(e);
		}
	}


}
