import java.util.*;

/**
*
*/
public class PlateauIndividuel {
	private Stack<Carte> pile;
	private HashSet<Carte> tas;
	
	public PlateauIndividuel(){
		setPile(new Stack<Carte>());
		setTas(new HashSet<Carte>());
		}
	
	public Carte getPile() {
		return this.pile.pop();
		}
	
	public void setPile(Stack<Carte> pile) {
		this.pile = pile;
		}
	
	public HashSet<Carte> getTas() {
		return tas;
		}
	
	public void setTas(HashSet<Carte> tas) {
		this.tas = tas;
		}
	
	public void ajouterCarte(Carte c){
		this.pile.add(c);
		}
	}
