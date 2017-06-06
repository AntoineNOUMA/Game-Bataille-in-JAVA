package jeu;


import java.util.*;

/**
* Classe de gestion de partie 
*/
public class Partie extends Observable {
	
	
	/**
	* Nombre de joueurs affiliÃ©s Ã  une partie
	*/
	private int nbJoueur;
	
	/**
	* Taille du jeu de carte
	*/
	private int tailleJeuCarte;
	
	/**
	* Nombre de jeu de carte dans la partie
	*/
	private int nbJeuCarte;
	
	/**
	* Nombre de carte au totale  dans la partie
	*/
	private int nbCarteTotal;
	
	/**
	* Liste des joueurs actifs d'une partie
	*/
	private HashSet<Joueur> listeJoueur;
	
	/**
	 * Plateau de la partie
	 */
	
	private Plateau PlateauPartie;
	
	/**
	* Constructeur
	* @param nbJoueur : Le nombre de joueur de la partie
	* @param tailleJeuCarte : Nombre de carte dans la partie correspondant Ã  1 paquet de cartes
	* @param nbJeuCarte : Nombre de paquets de cartes pour la partie
	*/
	public Partie (int nbJoueur,int tailleJeuCarte,int nbJeuCarte){
		this.nbJoueur=nbJoueur;
		this.tailleJeuCarte=tailleJeuCarte;
		this.nbJeuCarte=nbJeuCarte;
		this.nbCarteTotal=(tailleJeuCarte*4)*nbJeuCarte;
		this.listeJoueur=new HashSet<Joueur>();
		this.PlateauPartie=new Plateau();
		}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
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
	 * GETTER du nombre de cartes
	 * @return le nombre de cartes dans la partie
	 */
	public int getNbCarteTotal(){
		return this.nbCarteTotal;
	}
	/**
	 * Getter Nombre de joueur
	 * @return le nombre de joueurs actif dans la partie 
	 */
	public int getNbJoueur(){
		return this.nbJoueur;
	}
	
	/**Méthode permettant d'initialiser une partie de jeu normale
	* @param nbJoueur
	* @param tailleJeuCarte
	* @param nbJeuCarte
	* @return p retourne la partie créee
	*/
	public static Partie initialiseJeu() {
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
	 * Méthode permettant d'initialiser le jeu essai 1
	 * @return p partie créee
	 * @throws Exception
	 */
	public static Partie initialiseJeuEssai1() throws Exception {
		Partie p= new Partie(2,8,1);
		p.PlateauPartie=new Plateau();
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
		
		return p;
	
	}
	/**
	 *Méthode permettant d'initialiser le jeu essai 2
	 * @return p partie créee
	 * @throws Exception
	 */
	public static Partie initialiseJeuEssai2() throws Exception {
		Partie p= new Partie(2,8,1);
		p.PlateauPartie=new Plateau();
		
		Joueur j1=new Joueur("Joueur1",1);
		Joueur j2=new Joueur("Joueur2",2);
		j1.getMain().getLotDeCarte().addLast(new Carte(10,'P'));
		j1.getMain().getLotDeCarte().addLast(new Carte(11,'T'));
		j1.getMain().getLotDeCarte().addLast(new Carte(7,'C'));
		j1.getMain().getLotDeCarte().addLast(new Carte(13,'T'));
		j1.getMain().getLotDeCarte().addLast(new Carte(12,'T'));
		j1.getMain().getLotDeCarte().addLast(new Carte(10,'T'));
		j1.getMain().getLotDeCarte().addLast(new Carte(14,'C'));
		
		j2.getMain().getLotDeCarte().addLast(new Carte(8,'C'));
		j2.getMain().getLotDeCarte().addLast(new Carte(11,'P'));
		j2.getMain().getLotDeCarte().addLast(new Carte(8,'P'));
		j2.getMain().getLotDeCarte().addLast(new Carte(7,'T'));
		j2.getMain().getLotDeCarte().addLast(new Carte(12,'P'));
		j2.getMain().getLotDeCarte().addLast(new Carte(8,'T'));
		j2.getMain().getLotDeCarte().addLast(new Carte(9,'T'));
		
		System.out.println("J1 Main : "+j1.getMain().getLotDeCarte());
		
		System.out.println("J2 Main : "+j2.getMain().getLotDeCarte());
		
		p.getListeJoueur().add(j1);
		p.getListeJoueur().add(j2);
		
		return p;
	
	}
	
	/**
	 * Méthode permettant d'initialiser le jeu essai 3
	 * @return p partie créee
	 * @throws Exception
	 */
	public static Partie initialiseJeuEssai3() throws Exception {
		Partie p= new Partie(2,8,1);
		p.PlateauPartie=new Plateau();
		
		Joueur j1=new Joueur("Joueur1",1);
		Joueur j2=new Joueur("Joueur2",2);
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
		
		return p;
	
	}
	/**
	 * Méthode permettant de lancer la partie
	 */
	
	public void lancementPartie(){
		while(!this.finPartie()){
			this.setChanged();
			this.notifyObservers(this);
			this.getPlateauPartie().bataille(this);
			this.joueurPerdu();
		}
	}
	
	public void preparationBataille(){
		if(!this.finPartie()){
			this.setChanged();
			this.notifyObservers(this);
			this.getPlateauPartie().preparationBatailleGraphique(this);
			}
			this.setChanged();
			this.notifyObservers(this);
	}
	
	public void lancementPartieGraphique(){
		if(!this.finPartie()){
		this.setChanged();
		this.notifyObservers(this);
		this.getPlateauPartie().batailleGraphique(this);
		this.joueurPerdu();
		}
		this.setChanged();
		this.notifyObservers(this);
	}
	/**
	*Méthode permettant de contrôler la fin de la Partie
	*/
	public boolean finPartie() {
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
				this.setChanged();
				this.notifyObservers();
				itRJ.remove();
			}
		}
	}
	
	/**
	 * GETTER permettant de retourner la liste des joueurs actifs d'une partie 
	 * @return liste de jouru
	 */
	public HashSet<Joueur> getListeJoueur(){
		return this.listeJoueur;
	}
	
	/**
	 * GETTER permettant de retourner la taille du jeu de carted d'une partie 
	 * @return la taille du jeu de cartes
	 */
	public int getTailleJeuCarte() {
		return tailleJeuCarte;
		}
	
	public static void main (String[] args){
		Partie p;
		p=Partie.initialiseJeu();
		System.out.println(p);
		}
	}
