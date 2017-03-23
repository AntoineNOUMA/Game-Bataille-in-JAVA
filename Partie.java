
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
	public static initialiseJeu() {
		// TODO implement here
		Scanner sc=new Scanner(System.in);
		int nbJoueur=sc.nextInt();
		int tailleJeuCarte=sc.nextInt();
		int nbJeuCarte=sc.nextInt();
		sc.close();

	}

	/**
	 * 
	 */
	public void finPartie() {
		// TODO implement here
	}

}