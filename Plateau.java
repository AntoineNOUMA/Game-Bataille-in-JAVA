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
	*
	*/
	public Plateau() {
		this.preparationBataille=new HashMap<Joueur, Carte>();
		this.bataille = new HashMap<Joueur, Carte>();
		}
	
	public HashSet<Carte> bataille() {
		for(int i=0; i<this.bataille.size(); i++){}
		return levee;
		
		}
	/**
	 * Méthode permettant de préparer la bataille
	 */
	public void preparationBataille(HashSet<Joueur> players) {
		for(Joueur j : players){
			this.bataille.put(j, j.getMonPlateau().getPile());
			}
		}
	}
