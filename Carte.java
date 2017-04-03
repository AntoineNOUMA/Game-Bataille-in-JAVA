/**
*
*/
public class Carte implements Comparable<Carte>{
	
	
	/**
	*
	*/
	private static char[] couleurs = { 'K', 'C', 'P', 'T' };
	
	
	
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
	
	
	public int getHauteur() {
		return hauteur;
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
		s= ""+this.getSymbole()+this.couleur+"";
		return s;
		}
	
	
	/**
	* @param c couleur de la carte
	* @return true si couleur vrai et false sinon
	*/
	public boolean couleurValide(char c){
		for(int i=0;i<Carte.couleurs.length;i++){
			if(Carte.couleurs[i]==c){
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
	
	public int compareTo(Carte c) {
		if(this.hauteur < c.getHauteur()) return -1;
		if(this.hauteur == c.getHauteur()) return 0;
		return 1;
		}
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Carte n = new Carte(8, 'K');
		System.out.println(n);
		System.out.println(n.getHauteur());
		Carte m = new Carte(14, 'T');
		System.out.println(m);
		System.out.println(m.getHauteur());
		System.out.println(n.equals(m));
		Carte t = new Carte(13, 'K');
		System.out.println(t);
		System.out.println(t.getHauteur());
		Carte x = new Carte(14, 'T');
		System.out.println(x);
		System.out.println(x.getHauteur());
		System.out.println(m.equals(x));
		}
	}
