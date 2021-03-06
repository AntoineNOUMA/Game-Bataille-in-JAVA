package jeu;


import java.util.*;

/**
* Classe de gestion du plateau individuel de chaque joueur
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
	
	/**
	 * Constructeur du PlateauIndividuel
	 */
	public PlateauIndividuel(){
		this.cartePose=new Carte();
		this.cartesBataille=new HashSet<Carte>();
		}
	
	/**
	 * Getter de la cartePose
	 * @return la carte posée
	 */
	public Carte getCartePose() {
		return this.cartePose;
	}
	
	/**
	 * Setter de la cartePose
	 * @param c : modifie la carte posée par le joueur
	 */
	public void setCartePose(Carte c ) {
		this.cartePose = c;
		}
	/**
	 * Getter de cartesBataille
	 * @return une collection de carte pour la bataille
	 */
	public HashSet<Carte> getCartesBataille() {
		return this.cartesBataille;
		}
	
	}
