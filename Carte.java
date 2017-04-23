
/**
*
*/
public class Carte{
	
	
	
	
	
	/**
	* Valeur de la carte
	*/
	private int hauteur;
	
	/**
	* Fichier contenant la représentation graphique de la carte
	*/
	private String nomFichier;
	
	/**
	* Couleur de la carte, elle peut être (K,C,P ou T)
	
	*/
	private char couleur;
	
	/**
	* Symbole de la carte à l'affichage du toString, il dépend de la hauteur
	*/
	private String symbole;
	
	
	/**
	* Constructeur
	* @param s Symbole de la carte
	* @param c Couleur de la carte
	*/
	
	public Carte(int h, char c)throws Exception{
		if(!this.couleurValide(c) || (h>14||h<0))
		{
			Exception e = new Exception("Erreur de couleur ou de hauteur");
			throw e;
			}
		this.hauteur=h;
		this.couleur=c;
		}
	/**
	 * Créer une carte nulle
	 */
	public Carte(){
		this.hauteur=0;
		this.couleur=0;
	}
	
	/**
	* @return symbole - Renvoi le symbole de la carte
	*/
	public String getSymbole() {
		String s;
		if(this.hauteur>=2 && this.hauteur<=10){
			s = ""+ this.hauteur;
			this.symbole=s;
			return this.symbole;
			}
		else
		{
			switch (this.hauteur)
			{
				case 11:
				this.symbole="V";
				break;
				case 12:
				this.symbole="D";
				break;
				case 13:
				this.symbole="R";
				break;
				case 14:
				this.symbole="A";
				break;
				}
			return this.symbole;
			}
		
		}
	
	/**
	* @return la hauteur de la carte
	*/
	public int getHauteur() {
		return hauteur;
		}
	
	
	
	
	/**
	* @return la représentation graphique de la carte
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
		s= ""+this.getSymbole()+this.couleur+"";
		return s;
		}
	
	
	/**
	* @param c couleur de la carte
	* @return true si couleur vrai et false sinon
	*/
	public boolean couleurValide(char c){
		char[] couleurs = { 'K', 'C', 'P', 'T' };
		for(int i=0;i<couleurs.length;i++){
			if(couleurs[i]==c){
				return true;
				}
			}
		return false;
		}
	
	
	
	/* (non-Javadoc)
	* @see java.lang.Object#equals(java.lang.Object)
	* test si deux cartes ont la mÃªme hauteur
	*/
	public boolean equals(Object o){
		if(! (o instanceof Carte)) return false;
		Carte c = (Carte) o;
		if(this.hauteur==c.hauteur){
			return true;
			}
		return false;
		}
	/*
	 * Méthode permettant de comparer la valeur de 2 cartes
	 */
	public int compareTo(Carte c) {
		if(this.getHauteur() < c.getHauteur()) return -1;
		if(this.getHauteur() == c.getHauteur()) return 0;
		return 1;
		}
	
	
	
	public static void main (String[] args)
	{
		
	}
}
