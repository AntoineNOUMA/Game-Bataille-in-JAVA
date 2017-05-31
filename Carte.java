package jeu;



/**
*
*/
public class Carte{
	
	
	
	
	
	/**
	* Valeur de la carte
	*/
	private int hauteur;
	
	/**
	* Fichier contenant la reprÃ©sentation graphique de la carte
	*/
	private String nomFichier;
	
	/**
	* Couleur de la carte, elle peut Ãªtre (K,C,P ou T)
	
	*/
	private char couleur;
	
	/**
	* Symbole de la carte Ã  l'affichage du toString, il dÃ©pend de la hauteur
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
		
		if(this.couleur==('K')){
			this.nomFichier=new String("carreau");
		}
		
		if(this.couleur==('C')){
			this.nomFichier=new String("coeur");
		}
		
		if(this.couleur==('P')){
			this.nomFichier=new String("pique");
		}
		
		if(this.couleur==('T')){
			this.nomFichier=new String("trefle");
		}
		
		if(this.hauteur>=10){
			this.nomFichier+=("_"+this.hauteur+".GIF");
		}
		
		else{
			this.nomFichier+=("_0"+this.hauteur+".GIF");
		}
		}
	/**
	 * Créer une carte nulle (permet d'éviter et de controler l'ajout de carte du Plateau vers la Main lorsque le joueur n'a plus de carte)
	 */
	public Carte(){
		this.hauteur=0;
		this.couleur=0;
	}
	
	/**
	 * Méthode permet de récupérer le symbole d'une carte
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
	 * Getter de la hauteur de la carte(sa puissance)
	* @return la hauteur de la carte
	*/
	public int getHauteur() {
		return hauteur;
		}
	
	
	
	
	/**
	 * Getter du nom du fichier contenant l'image de la carte
	* @return la reprÃ©sentation graphique de la carte
	*/
	public String getNomFichier() {
		return this.nomFichier;
	}
	
	
	/** toString de la Carte 
	* @see java.lang.Object#toString()
	* @return le symbole de la carte et sa couleur
	*/
	public String toString(){
		String s;
		s= ""+this.getSymbole()+this.couleur+"";
		return s;
		}
	
	
	/**
	 * Méthode permettant de controler si la couleur de la carte est valide
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
	
	
	/** equals de Carte
	* @see java.lang.Object#equals(java.lang.Object)
	* test si deux cartes ont la mÃƒÂªme hauteur
	* @return true les cartes ont la même hauteur
	*/
	public boolean equals(Object o){
		if(! (o instanceof Carte)) return false;
		Carte c = (Carte) o;
		if(this.hauteur==c.hauteur){
			return true;
			}
		return false;
		}
	/**compareTO de Carte,
	 * compare la hauteur de la carte
	 * @return -1 la carte comparé est supérieur 0 les cartes ont même puissance
	 */
	public int compareTo(Carte c) {
		if(this.getHauteur() < c.getHauteur()) return -1;
		if(this.getHauteur() == c.getHauteur()) return 0;
		return 1;
		}
}
