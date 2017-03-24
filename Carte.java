
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
	private String symbole;
	
	

	/**
	 * @param s Symbole de la carte
	 * @param c Couleur de la carte
	 */
	public Carte(String s, char c){
			this.symbole=s;
			this.couleur=c;
	}
	
	

	/**
	 * @return hauteur - Renvoi la hauteur de la carte
	 */
	public int getHauteur() {
		if(Character.isDigit(this.symbole.charAt(0))){
			int sym=Integer.parseInt(this.symbole);
			if(sym>=2 || sym<=10){
				this.hauteur=sym;
			}
		}
		
			switch (this.symbole)
			{
			case "J":
			this.hauteur=11;
			break;
			case "Q":
			this.hauteur=12;
			break;
			case "K":
			this.hauteur=13;
			break;
			case "A":
			this.hauteur=14;
			break;
			} 
		return this.hauteur;
	}


	

	/**
	 * @return
	 */
	public String getNomFichier() {
		// TODO implement here
		return this.nomFichier;
	}
	

	 /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
 		String s;
 		s= ""+this.symbole+this.couleur+"";
 		return s;
 	}
 	
 	
 	/**
 	 * @param c couleur de la carte
 	 * @return true si couleur vrai et false sinon
 	 */
 	public boolean couleurValide(char c){
 		for(int i=0;i<this.couleurs.length;i++){
 			if(this.couleurs[i]==c){
 				return true;
 			}
 		}
 		return false;
 	}
 	
 	
 	
 	/* (non-Javadoc)
 	 * @see java.lang.Object#equals(java.lang.Object)
 	 * test si deux cartes ont la même hauteur
 	 */
 	public boolean equals(Object o){
 		if(! (o instanceof Carte)) return false;
 		Carte c = (Carte) o;
 		if(this.hauteur==c.hauteur){
 			return true;
 		}
 		return false;
 	}
 	
}
