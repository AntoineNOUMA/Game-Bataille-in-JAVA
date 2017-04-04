
import java.util.*;

/**
*
*/
public class Joueur {
	
	private String pseudo;
	private int idJoueur;
	private Main main;
	private PlateauIndividuel monPlateau;
	
	/**
	* Constructeur Classe Joueur
	* */
	public Joueur(String pseudo, int idJoueur, Main main)
	{
		this.setPseudo(pseudo);
		this.idJoueur=idJoueur;
		this.main=main;
		}
	
	/**
	* Constructeur Classe Joueur
	* */
	public Joueur(String pseudo, int idJoueur)
	{
		this.setPseudo(pseudo);
		this.idJoueur=idJoueur;
		this.main=new Main();
		this.monPlateau = new PlateauIndividuel();
		}
	/**
	* Getters
	* */
	public int getIdJoueur()
	{
		return this.idJoueur;
		}
	
	/**
	* @return la carte enlevée de la main
	*/
	public void poserCarte()
	{
		if(this.main.lotDeCarte.size()==0){
			monPlateau.setCartePose(new Carte());
		}
		monPlateau.setCartePose(this.main.lotDeCarte.pop());
	}
	
	/**
	* @param a HashSet de carte remis dans la main
	*/
	public void recupererCartes(HashSet<Carte> a){
		for(Carte c: a){
			this.main.lotDeCarte.push(c);
			}
		}
	/**
	* @return true si la main du joueur est vide
	*/
	
	public boolean partiePerdue(){
		if(main.mainVide()){
			System.out.println("Vous avez perdu !");
			return true;
			}
		return false;
		}
	
	public void partieGagne()
	{
		// TODO implement here
		}
	public String getPseudo() {
		return pseudo;
		}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
		}
	
	public String toString(){
		String s = "" + this.pseudo;
		s+= "\n" + this.main.toString();
		return s;
		}
	
	public PlateauIndividuel getMonPlateau() {
		return this.monPlateau;
		}
	}
