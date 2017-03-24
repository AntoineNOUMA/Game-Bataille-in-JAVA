
import java.util.*;

/**
 * 
 */
public class Carte {
	
	
	/**
	 * 
	 */
	public char[] couleurs = { 'K', 'C', 'P', 'T' };

	
	/**
	 * 
	 */
	public int[] hauteurs = { 2, 3, 4, 5, 6, 7, 8, 9,

			10, 11, 12, 13, 14 };

	/**
	 * 
	 */
	private int hauteur;

	/**
	 * 
	 */
	private String nomFichier;

	/**
	 * 
	 */
	private char couleur;

	/**
	 * 
	 */
	private char symbole;
	
	
	/**
	 * Default constructor
	 */
	public Carte(char s, char c){
			this.symbole=s;
			this.couleur=c;
	}
	
	
	/**
	 * 
	 */
	public int getHauteur() {
		int sym=int.parseInt(this.symbole);
		if(sym>=2 || sym<=9){
			this.hauteur=sym;
		}
		return this.hauteur;
	}

	/**
	 * 
	 */
	public char getCouleur() {
		// TODO implement here
		return this.couleur;
	}
	
	/**
	 * 
	 */
	public String getNomFichier() {
		// TODO implement here
		return this.nomFichier;
	}
	
	/**
	 * 
	 */
	 public String toString(){
 		String s;
 		s= ""+this.symbole+this.couleur+"";
 		return s;
 	}
 	
 	
 	public boolean couleurValide(char c){
 		for(int i=0;i<this.couleurs.length;i++){
 			if(this.couleurs[i]==c){
 				return true;
 			}
 		}
 		return false;
 	}
}