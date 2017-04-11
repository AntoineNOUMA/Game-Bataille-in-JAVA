
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
		this.monPlateau = new PlateauIndividuel();
		}
	
	/**
	* Constructeur Classe Joueur
	* */
	public Joueur(String pseudo, int idJoueur){
		this.setPseudo(pseudo);
		this.idJoueur=idJoueur;
		this.main=new Main();
		this.monPlateau = new PlateauIndividuel();
	}
	
	/**
	* Getters permettant de récupérer l'id d'un joueur
	* */
	public int getIdJoueur(){
		return this.idJoueur;
	}
	
	/**
	 * GETTER permettant de récupérer la main d'un joueur
	 * @return la main du joueur
	 */
	public Main getMain(){
		return this.main;
	}
	
	/**
	 * Méthode comparant les joueurs en fonction de leur id 
	 * @return boolean joueurs sont les mêmes
	 */
	
	public int compareIdJoueur(Joueur j){
		if(this.getIdJoueur()==j.getIdJoueur()){
			return 1;
		}
		
		return 0;
	}
	
	/**
	* Méthode permettat de poser une carte, la carte est enlevée de la main pour être posé sur la plateau individuel
	*/
	public void poserCarte()
	{
		if(this.getMain().getLotDeCarte().size()==0){
			monPlateau.setCartePose(new Carte());
		}
		monPlateau.setCartePose(this.getMain().getLotDeCarte().pop());
	}
	
	/**
	 * Méthode permettant de poser une carte de la main du joueur vers la levée Générale du plateau (règle du jeu lorsqu'il y a une bataille entre joueurs)
	 * @param p partie en cours
	 */
	public void poserCarteVersLeveeAdditionne(Partie p){
		p.getPlateauPartie().getLeveeAdditionne().add(this.getMain().getLotDeCarte().pop());
	}
	
	/**
	* @param a HashSet de carte remis dans la main
	*/
	public void recupererCartes(HashSet<Carte> a){
		for(Carte c: a){
			this.getMain().getLotDeCarte().push(c);
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
