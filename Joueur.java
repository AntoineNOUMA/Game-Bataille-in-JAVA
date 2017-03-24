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
	public void poserCarte() 
	{
		// TODO implement here
	}

	
	public void recupererCarte() 
	{
		// TODO implement here
	}


	public void partiePerdue() 
	{
		if(main.mainVide())
		System.out.println("Vous avez perdu !");
	}

	public void partieGagne() 
	{
		// TODO implement here
	}
}