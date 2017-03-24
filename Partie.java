
import java.util.*;

/**
 * 
 */
public class Partie {

	/**
	 * Default constructor
	 */
	public Partie() {
	}

	/**
	 * 
	 */
	public int nbJoueur;

	/**
	 * 
	 */
	public int tailleJeuCarte;

	/**
	 * 
	 */
	public int nbJeuCarte;

	/**
	 * 
	 */
	public HashSet<Joueur> listeJoueur;


	public Partie (int nbJoueur,int tailleJeuCarte,int nbJeuCarte){
		this.nbJoueur=nbJoueur;
		this.tailleJeuCarte=tailleJeuCarte;
		this.nbJeuCarte=nbJeuCarte;
	}


	/**
	 * @param nbJoueur 
	 * @param tailleJeuCarte 
	 * @param nbJeuCarte
	 */
	public static Partie initialiseJeu() {
		// TODO implement here
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer le nombre de joueur de la partie !");
		int nbJoueur=sc.nextInt();
		
		System.out.println("Choisir la taille du jeu de Carte !\n 0 : 32 cartes, 1 : 52 cartes");
		int choixTailleJeuCarte=sc.nextInt();
		while(choixTailleJeuCarte!=0 || choixTailleJeuCarte!=1){
			choixTailleJeuCarte=sc.nextInt();
		}
		
		if (choixTailleJeuCarte==1){
			
			int tailleJeuCarte=52;
		}
		
		int nbJeuCarte=sc.nextInt();
		sc.close();
		
		return new Partie(nbJoueur,tailleJeuCarte,nbJeuCarte);
		

	}

	/**
	 * 
	 */
	public void finPartie() {
		// TODO implement here
	}

}