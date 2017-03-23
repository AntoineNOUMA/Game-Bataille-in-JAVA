
import java.util.*;

/**
 * 
 */
public class Carte {

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
	public Carte(char s, char c) {
		this.symbole=s;
		this.couleur=c;
	}
	
	
	/**
	 * 
	 */
	public int getHauteur() {
		// TODO implement here
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
 		s=this.symbole+this.couleur;
 		return s;
 	}
}