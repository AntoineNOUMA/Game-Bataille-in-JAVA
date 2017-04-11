
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
	* Getters permettant de r�cup�rer l'id d'un joueur
	* */
	public int getIdJoueur(){
		return this.idJoueur;
	}
	
	/**
	 * GETTER permettant de r�cup�rer la main d'un joueur
	 * @return la main du joueur
	 */
	public Main getMain(){
		return this.main;
	}
	
	/**
	 * M�thode comparant les joueurs en fonction de leur id 
	 * @return boolean joueurs sont les m�mes
	 */
	
	public int compareIdJoueur(Joueur j){
		if(this.getIdJoueur()==j.getIdJoueur()){
			return 1;
		}
		
		return 0;
	}
	
	/**
	* M�thode permettat de poser une carte, la carte est enlev�e de la main pour �tre pos� sur la plateau individuel
	*/
	public void poserCarte()
	{
		if(this.getMain().getLotDeCarte().size()==0){
			monPlateau.setCartePose(new Carte());
		}
		monPlateau.setCartePose(this.getMain().getLotDeCarte().pop());
	}
	
	/**
	 * M�thode permettant de poser une carte de la main du joueur vers la lev�e G�n�rale du plateau (r�gle du jeu lorsqu'il y a une bataille entre joueurs)
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
