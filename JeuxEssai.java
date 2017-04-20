
public class JeuxEssai {

	public static void main(String[] args) {
		//Essai 1
		Partie p;
		p=Partie.initialiseJeu();
		System.out.println("Initialise-Jeu FINI !");
		p.getPlateauPartie().bataille(p);
		

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
