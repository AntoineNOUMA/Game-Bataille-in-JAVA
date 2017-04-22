
public class JeuxEssai {

	public static void main(String[] args) {
		try{
			//Essai 1
			Partie p;
			p=Partie.initialiseJeu();
			System.out.println("Initialise-Jeu FINI !");
			while(!p.finPartie()){
				p.getPlateauPartie().bataille(p);
				p.joueurPerdu();
			}
			/*
			p.getListeJoueur().clear();
			Joueur j1=new Joueur("Joueur1",1);
			Joueur j2=new Joueur("Joueur2",2);
			j1.getMain().getLotDeCarte().addLast(new Carte(10,'P'));
			j1.getMain().getLotDeCarte().addLast(new Carte(11,'T'));
			System.out.println("J1 Main : "+j1.getMain().getLotDeCarte());
			j1.getMain().getLotDeCarte().addLast(new Carte(7,'C'));
			j1.getMain().getLotDeCarte().addLast(new Carte(13,'T'));
			
			j2.getMain().getLotDeCarte().addLast(new Carte(8,'C'));
			j2.getMain().getLotDeCarte().addLast(new Carte(11,'P'));
			System.out.println("J2 Main : "+j2.getMain().getLotDeCarte());
			j2.getMain().getLotDeCarte().addLast(new Carte(8,'P'));
			j2.getMain().getLotDeCarte().addLast(new Carte(7,'T'));
			
			System.out.println("J1 Main : "+j1.getMain().getLotDeCarte());
			
			System.out.println("J2 Main : "+j2.getMain().getLotDeCarte());
			
			p.getListeJoueur().add(j1);
			p.getListeJoueur().add(j2);
			while(!p.finPartie()){
				p.getPlateauPartie().bataille(p);
				p.joueurPerdu();
			}
			
			//Essai 2
			System.out.println("!!! ESSAI 2 !!!");
			p.getListeJoueur().clear();
			j1=new Joueur("Joueur1",1);
			j2=new Joueur("Joueur2",2);
			j1.getMain().getLotDeCarte().addLast(new Carte(10,'P'));
			j1.getMain().getLotDeCarte().addLast(new Carte(11,'T'));
			System.out.println("J1 Main : "+j1.getMain().getLotDeCarte());
			j1.getMain().getLotDeCarte().addLast(new Carte(7,'C'));
			j1.getMain().getLotDeCarte().addLast(new Carte(13,'T'));
			j1.getMain().getLotDeCarte().addLast(new Carte(12,'T'));
			j1.getMain().getLotDeCarte().addLast(new Carte(10,'T'));
			j1.getMain().getLotDeCarte().addLast(new Carte(14,'C'));
			
			j2.getMain().getLotDeCarte().addLast(new Carte(8,'C'));
			j2.getMain().getLotDeCarte().addLast(new Carte(11,'P'));
			System.out.println("J2 Main : "+j2.getMain().getLotDeCarte());
			j2.getMain().getLotDeCarte().addLast(new Carte(8,'P'));
			j2.getMain().getLotDeCarte().addLast(new Carte(7,'T'));
			j2.getMain().getLotDeCarte().addLast(new Carte(12,'P'));
			j2.getMain().getLotDeCarte().addLast(new Carte(8,'T'));
			j2.getMain().getLotDeCarte().addLast(new Carte(9,'T'));
			
			System.out.println("J1 Main : "+j1.getMain().getLotDeCarte());
			
			System.out.println("J2 Main : "+j2.getMain().getLotDeCarte());
			
			p.getListeJoueur().add(j1);
			p.getListeJoueur().add(j2);
			while(!p.finPartie()){
				p.getPlateauPartie().bataille(p);
				p.joueurPerdu();
			}
			
			//Essai 3
			System.out.println("!!! ESSAI 3 !!!");
			p.getListeJoueur().clear();
			j1=new Joueur("Joueur1",1);
			j2=new Joueur("Joueur2",2);
			j1.getMain().getLotDeCarte().addLast(new Carte(10,'P'));
			j1.getMain().getLotDeCarte().addLast(new Carte(11,'T'));
			j1.getMain().getLotDeCarte().addLast(new Carte(12,'C'));
			
			
			j2.getMain().getLotDeCarte().addLast(new Carte(8,'C'));
			j2.getMain().getLotDeCarte().addLast(new Carte(9,'T'));
			j2.getMain().getLotDeCarte().addLast(new Carte(10,'C'));
			
			
			System.out.println("J1 Main : "+j1.getMain().getLotDeCarte());
			
			System.out.println("J2 Main : "+j2.getMain().getLotDeCarte());
			
			p.getListeJoueur().add(j1);
			p.getListeJoueur().add(j2);
			while(!p.finPartie()){
				p.getPlateauPartie().bataille(p);
				p.joueurPerdu();
			}
			*/
		}
		catch(Exception e){
			System.out.println(e);
		}

		//JeudeCartes j = new JeudeCartes();
		//j.creationPaquet(8, 1);
		//System.out.println(j);
		//j.battrePaquet();
		//System.out.println(j);
		//Joueur joue = new Joueur("Moi", 1);
		//j.distribuerCarte(joue, 1);
		//System.out.println(joue.getMain().getLotDeCarte().pop());
		//System.out.println(joue.getMain().getLotDeCarte());
		//System.out.println(joue.getMain().getLotDeCarte().removeLast());
		//System.out.println(joue.getMain().getLotDeCarte());
		//joue.poserCarte();
		//System.out.println("Plateau " + joue.getMonPlateau().getCartePose());
		//System.out.println( joue.getMain().getLotDeCarte());
	}


}
