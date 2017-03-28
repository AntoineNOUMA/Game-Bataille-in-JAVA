import java.util.*;

public class Joueur 
{
	private String pseudo;

	private int idJoueur;

	private Main main;
	
	/*Constructeur*/
	public Joueur(String pseudo, int idJoueur, Main main) 
	{
		this.pseudo=pseudo;
		this.idJoueur=idJoueur;
		this.main=main;
	}

	/*Getters*/
	public int getIdJoueur()
	{
		return this.idJoueur;
	}
	
	
	/*Méthodes*/

	/**
	 * @return la carte enlever de la main
	 */
	public Carte poserCarte()
	{
		return this.main.lotDeCarte.pop();
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
}
