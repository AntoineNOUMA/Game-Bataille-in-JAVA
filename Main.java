
import java.util.*;

/**
*
*/
public class Main {
	
	
	
	/**
	*
	* Représente le lot de carte contenu dans une main
	*/
	public ArrayDeque<Carte> lotDeCarte;
	
	
	public Main(){
		this.lotDeCarte=new ArrayDeque<Carte>();
		}
	/**
	* @param c Collection de cartes provenant du jeu de carte
	*/
	public Main(HashSet<Carte> c) {
		this.lotDeCarte = new ArrayDeque<Carte>();
		for(Carte p : c ){
			this.lotDeCarte.add(p);
			}
		}
	
	
	
	/**
	* @return true si la main est vide
	*/
	public boolean mainVide() {
		if(this.lotDeCarte.isEmpty()) return true;
		return false;
		}
	
	/**
	* Méthode permettant de battre les cartes contenues dans la main
	*/
	public void battreMain() {
		List<Carte>list = new ArrayList<Carte>();
		for(Carte c : this.lotDeCarte){
			list.add(c);
			}
		Collections.shuffle(list);
		this.lotDeCarte = new ArrayDeque<Carte>(list);
		}
	
	/* (non-Javadoc)
	* @see java.lang.Object#toString()
	*/
	public String toString(){
		String s;
		int size=this.lotDeCarte.size();
		s="Sa main contient " + size + "\n" + this.lotDeCarte.toString();
		return s;
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
		Carte t = new Carte(12, 'K');
		System.out.println(t);
		System.out.println(t.getHauteur());
		Carte x = new Carte(14, 'T');
		System.out.println(x);
		System.out.println(x.getHauteur());
		System.out.println(m.equals(x));
		HashSet<Carte> c = new HashSet<Carte>();
		c.add(x);
		c.add(t);
		c.add(m);
		c.add(n);
		Main main = new Main(c);
		System.out.println(main);
		System.out.println(main.lotDeCarte.peek());
		System.out.println(main.lotDeCarte.peekFirst());
		System.out.println(main.lotDeCarte.peekLast());
		main.battreMain();
		System.out.println(main.lotDeCarte.pop());
		System.out.println(main.lotDeCarte.peekFirst());
		System.out.println(main.lotDeCarte.peekLast());
		
		
		}
	
	}
