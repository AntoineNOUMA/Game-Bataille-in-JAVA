
import java.util.*;

/**
*
*/
public class PlateauIndividuel {
	
	/**
	 * Contient la carte posée à chaque tour par chaque joueur ou dans le cas d'une bataille
	 */
	private Carte cartePose;
	
	/**
	 * Contient la liste de cartes gagné par le joueur lors d'une bataille
	 */
	private HashSet<Carte> cartesBataille;
	
	public PlateauIndividuel(){
		this.cartePose=new Carte();
		this.cartesBataille=new HashSet<Carte>();
		}
	
	public Carte getCartePose() {
		return this.cartePose;
		}
	
	public void setCartePose(Carte c ) {
		this.cartePose = c;
		}
	
	public HashSet<Carte> getCartesBataille() {
		return this.cartesBataille;
		}
	
	}
