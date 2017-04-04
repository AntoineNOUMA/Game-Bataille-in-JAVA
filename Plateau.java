
import java.util.*;

/**
*
*/
public class Plateau {
	
	
	
	
	/**
	* Liste des cartes par joueurs dans une bataille
	*/
	private HashMap<Joueur, Carte> preparationBataille;
	
	/**
	* Liste des cartes retournées à un joueur
	*/
	private HashMap<Joueur,Carte> bataille;
	
	/**
	*Constructeur de la Classe Plateau
	*/
	public Plateau() {
		this.preparationBataille=new HashMap<Joueur, Carte>();
		this.bataille = new HashMap<Joueur, Carte>();
	}
	
	/**
	 * Méthode permettant de déclencher une bataille : 
	 * Recherche les cartes identiques au sein des cartes posées par chaque joueur (preparationBataille)
	 * Ajoute les cartes identiques au sein de la liste bataille
	 * Retire la carte du joueur de la liste preparationBataille
	 * Une fois toute la liste parcouru, si il y a des cartes identiques nous exécutons une bataille entre ces joueurs 
	 * Le joueurs gagnant la partie remporte toute les cartes de la bataille, elles sont directement ajouté à main
	 * Dans tous les cas nous continuons à parcourir la liste des joueurs, vérifiant si d'autres batailles sont possible,jusqu'à épuisement complet de la liste (preparationBataille)
	 * Les cartes restantes, n'ayant pas participé à une bataille, sont restitués aux joueurs
	 */
	
	public HashSet<Carte> bataille() {
		for(int i=0; i<this.preparationBataille.size(); i++){
			for(int j=0;j<this.preparationBataille.size();i++){
				if(this.preparationBataille[i])
			}
		}
		return levee;
		
		}
	/**
	 * Méthode permettant de préparer la bataille, récupération des cartes de la main de chaque joueur pour l'ajouter a chaque plateau individuel
	 */
	public void preparationBataille(Partie p) {
		for(Joueur j : p.getListeJoueur()){
			if(j.getMonPlateau().getCartePose().getHauteur()!=0){
				this.preparationBataille.put(j, j.getMonPlateau().getCartePose());
				j.getMonPlateau().setCartePose(new Carte());//VERIFIER PERTINENCE !!! Une fois la carte mis dans le Plateau de la partie, la carte dans le plateau Individuel est remplacé par une carte nulle  
			}
			
			}
	}
	
	
	
}
