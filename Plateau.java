import java.util.*;

/**
*
*/
public class Plateau {
	
	
	
	
	/**
	* Liste des cartes par joueurs dans une bataille
	*/
	private HashMap<Joueur, Carte> bataille;
	
	/**
	* Liste des cartes retournées à un joueur
	*/
	private HashSet<Carte> levee;
	
	/**
	*
	*/
	public Plateau() {
		bataille=new HashMap<Joueur, Carte>();
		levee = new HashSet<Carte>();
		}
	
	public HashSet<Carte> bataille() {
		for(int i=0; i<this.bataille.size(); i++){}
		return levee;
		
		}
	
	public void preparationBataille(HashSet<Joueur> players) {
		for(Joueur j : players){
			this.bataille.put(j, j.getMonPlateau().getPile());
			}
		}
	}
