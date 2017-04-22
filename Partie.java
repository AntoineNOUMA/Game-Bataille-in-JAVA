
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
	
	private int nbCarteTotal;
	
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
		this.nbCarteTotal=(tailleJeuCarte*4)*nbJeuCarte;
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
	
	public int getNbCarteTotal(){
		return this.nbCarteTotal;
	}
	
	public int getNbJoueur(){
		return this.nbJoueur;
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
			jeuCartes.distribuerCarte(joueur,p);
			p.listeJoueur.add(joueur);
			System.out.println(joueur.getMain().getLotDeCarte());
			
			}
		System.out.println(jeuCartes);
		sc.close();
		p.PlateauPartie=new Plateau();
		return p;
		}
	/**
	*
	*/
	public boolean finPartie() { // COMPLETER LES CONDITIONS DE FIN DE PARTIE
		if(this.getListeJoueur().size()==1){
			for(Joueur j : this.getListeJoueur() ){
				System.out.println("La partie est FINI ! \n Le GAGNANT est :"+j.getPseudo());
			}
			return true;
		}
		if(this.getListeJoueur().size()==0){
			
				System.out.println("La partie est FINI ! \n Le match est NUL.");
				return true;
		}
		return false;
	}
	
	public void joueurPerdu(){ // A COMPLETER
		Iterator <Joueur> itRJ= this.getListeJoueur().iterator();
		while(itRJ.hasNext()){
			if(itRJ.next().getMain().mainVide()){
				itRJ.remove();
			}
		}
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
