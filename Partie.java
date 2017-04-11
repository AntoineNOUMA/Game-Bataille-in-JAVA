
import java.util.*;

/**
*
*/
public class Partie {
	
	
	/**
	*
	*/
	private int nbJoueur;
	
	/**
	*
	*/
	private int tailleJeuCarte;
	
	/**
	*
	*/
	private int nbJeuCarte;
	
	/**
	*
	*/
	private HashSet<Joueur> listeJoueur;
	
	/**
	 * Attribut contenant le plateau d'une partie
	 */
	
	private Plateau PlateauPartie;
	
	public Partie (int nbJoueur,int tailleJeuCarte,int nbJeuCarte){
		this.nbJoueur=nbJoueur;
		this.tailleJeuCarte=tailleJeuCarte;
		this.nbJeuCarte=nbJeuCarte;
		this.listeJoueur=new HashSet<Joueur>();
		this.PlateauPartie=new Plateau();
		}
	/**
	*
	*/
	
	public String toString(){
		String s=new String("Les Joueurs suivants sont en jeu : \n");
		for (Joueur j : listeJoueur){
			s+=j+"\n";
			}
		return s;
	}
	/**
	 * GETTER permettant de retourner le plateau d'une partie 
	 * @return le plateau de la partie
	 */
	public Plateau getPlateauPartie(){
		return this.PlateauPartie;
	}
	/**
	* @param nbJoueur
	* @param tailleJeuCarte
	* @param nbJeuCarte
	*/
	public static Partie initialiseJeu() {
		// TODO implement here
		System.out.println("Saisir Nombres de Joueurs : ");
		Scanner sc=new Scanner(System.in);
		int nbJoueur=sc.nextInt();
		System.out.println("Saisir Taille du Jeu de Carte(s) : ");
		int tailleJeuCarte=sc.nextInt();
		System.out.println("Saisir le nombre de Jeu de Carte(s) : ");
		int nbJeuCarte=sc.nextInt();
		
		Partie p= new Partie(nbJoueur,tailleJeuCarte,nbJeuCarte);
		JeudeCartes jeuCartes = new JeudeCartes();
		jeuCartes.creationPaquet(tailleJeuCarte, nbJeuCarte);
		
		for (int i=0; i<nbJoueur;i++){
			System.out.println("Saisir le nom du Joueur "+i+" : ");
			sc=new Scanner(System.in);
			String nomJoueur=sc.next();
			Joueur joueur=new Joueur(nomJoueur,i); // !!! ajouter une main au joueur au constructeur de joueur !!!
			jeuCartes.distribuerCarte(joueur,nbJoueur);
			p.listeJoueur.add(joueur);
			
			}
		System.out.println(jeuCartes);
		sc.close();
		p.PlateauPartie=new Plateau();
		return p;
		}
	/**
	*
	*/
	public void finPartie() { // COMPLETER LES CONDITIONS DE FIN DE PARTIE
		// TODO implement here
	}
	
	public void joueurPerdu(){ // A COMPLETER
		
	}
	public HashSet<Joueur> getListeJoueur(){
		return this.listeJoueur;
	}
	public int getTailleJeuCarte() {
		return tailleJeuCarte;
		}
	
	public static void main (String[] args){
		Partie p;
		p=Partie.initialiseJeu();
		System.out.println(p);
		}
	}
