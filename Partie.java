import java.util.*;

public class Partie 
{

	public int nbJoueur, tailleJeuCarte, nbJeuCarte;

	public HashSet<Joueur> listeJoueur;

	/*Default constructor*/
	public Partie (int nbJoueur, int tailleJeuCarte, int nbJeuCarte)
	{
		this.nbJoueur=nbJoueur;
		this.tailleJeuCarte=tailleJeuCarte;
		this.nbJeuCarte=nbJeuCarte;
		//Créer tous les joueurs et le plateau et le jeu de carte
	}

	public HashSet<Joueur> getListeJoueur()
	{
		return this.listeJoueur;
	}
	
	/**/
	public void removeJoueur(int idJoueur)
	{
		for(Joueur j : this.getListeJoueur())
		{
			if(j.getIdJoueur()==idJoueur)
			{
				ListIterator<Joueur> ite = getListeJoueur().listIterator();
				while(ite.hasNext())
				{
					Joueur k = ite.next();
					if(k.getIdJoueur()==idJoueur)
					{
						ite.remove();
					}
				}
			}
		}
	}

	/**
	 * @param nbJoueur 
	 * @param tailleJeuCarte 
	 * @param nbJeuCarte
	 */
	public static Partie initialiseJeu() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer le nombre de joueur de la partie !");
		int nbJoueur=sc.nextInt();
		System.out.println("Choisir la taille du jeu de Carte !\n 0 : 32 cartes, 1 : 52 cartes");
		
		int choixTailleJeuCarte=sc.nextInt();
		
		while(choixTailleJeuCarte!=0 || choixTailleJeuCarte!=1)
		{
			choixTailleJeuCarte=sc.nextInt();
		}
		
		int tailleJeuCarte;

		if (choixTailleJeuCarte==1)
		{
			tailleJeuCarte=52;
		}
		
		if(choixTailleJeuCarte==0)
		{
			tailleJeuCarte=32;
		}
		
		System.out.println("Choisir le nombre de jeu de Carte !\n 0");
		int nbJeuCarte=sc.nextInt();
		sc.close();
		
		return new Partie(nbJoueur,tailleJeuCarte,nbJeuCarte);
	}

	
	public void finPartie() 
	{
		// TODO implement here
	}

}