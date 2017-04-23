import java.util.*;

/**
* Classe de gestion du jeu de Carte
*/
public class JeudeCartes {
	
	
	
	/**
	* Représente le paquet contenant un jeu de carte
	*/
	private List<Carte> paquet;
	
	/**
	* Constructeur
	*/
	public JeudeCartes() {
		this.paquet= new ArrayList<Carte>();
		}
	
	/**
	* Méthode qui distribue des cartes contenues dans un paquet à un joueur en fonction du nombre de joueur de la partie
	* @param joueur : le joueur à qui les cartes sont distribuées
	* @param p : la partie en cours 
	*/
	public void distribuerCarte(Joueur joueur, Partie p) {
		int i = p.getNbCarteTotal()/p.getNbJoueur();
		this.battrePaquet();
		HashSet<Carte> h = new HashSet<Carte>();
		ListIterator<Carte> itLCartes =this.paquet.listIterator();
		for(int j = 0; j<i; j++){
			h.add(itLCartes.next());
			itLCartes.remove();
		}
		joueur.recupererCartes(h);
		}
	
	/**
	* Méthode qui bat les carte contenues dans un paquet de carte
	
	*/
	public void battrePaquet() {
		List<Carte>list = new ArrayList<Carte>();
		for(Carte c : this.paquet){
			list.add(c);
			}
		Collections.shuffle(list);
		this.paquet = new ArrayList<Carte>(list);
		}
	
	/**
	* Méthode qui initialise un nouveau jeu de carte
	* @param nbCarte : le nombre de carte initialisée. 8 pour 32 et 13 pour 52
	* @param nbJeu : la nombre de paquet de carte de ce jeu de carte à créer
	*/
	public void creationPaquet(int nbCarte, int nbJeu) {
		try{
			int i, j;
			for(i=0; i<nbJeu ; i++){
				for(j=0; j<nbCarte; j++){
					Carte c1, c2, c3, c4;
					c1 = new Carte(j+2, 'K');
					c2 = new Carte(j+2, 'C');
					c3 = new Carte(j+2, 'P');
					c4 = new Carte(j+2, 'T');
					this.paquet.add(c1);
					this.paquet.add(c2);
					this.paquet.add(c3);
					this.paquet.add(c4);
					}
				}
			}
		catch(Exception e){}
		}
	
	
	
	public String toString(){
		return this.paquet.toString();
		}
	}
