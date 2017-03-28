import java.util.*;

public class Plateau 
{
	/**
	 * Liste des cartes par joueurs dans une bataille
	 */
	public HashMap<Joueur, Carte> bataille;

	/**
	 * Liste des cartes retournées à un joueur
	 */
	public HashMap<Joueur, Carte> levee;
	
	/**
	 * 
	 */
	public Plateau() {
	}


	
	public void bataille() 
	{
		// TODO implement here
	}

	public void preparationBataille() 
	{
		// TODO implement here
	}

	public int compareCarte(Carte c1, Carte c2) {
		if(c1.compareTo(c2)==0)
		{
			return 0;
		}
		return 1;
	}

}
