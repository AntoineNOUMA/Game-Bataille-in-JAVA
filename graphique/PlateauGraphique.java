
package graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import jeu.BatailleControleur;
import jeu.Carte;
import jeu.Joueur;
import jeu.Partie;



public class PlateauGraphique extends JFrame{
	private JPanel plateau;
	private JPanel plateauSud;
	private JPanel plateauNord;
	private LogBataille log;
	private CartesBataille cartes;
	private JoueursBataille joueurs;
	private BatailleControleur bc;
	
	public PlateauGraphique(String titre, int w, int h,BatailleControleur bc)	{
	 	super(titre);
	 	this.bc=bc;
		this.initPlateau();
		this.initPlateauSud();
		this.initPlateauNord();
		this.initComposants();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	    this.setSize(w, h);
	   	this.setVisible(true);
	}

	public void initComposants()  {
		this.setLayout(new BorderLayout());
	    this.add(plateau, BorderLayout.CENTER);
	    this.add(plateauSud, BorderLayout.SOUTH);
	    this.add(plateauNord, BorderLayout.NORTH);
	}

	public void initPlateau()	{
		this.plateau=new JPanel();
		//GridLayout g =new GridLayout(1,1);
		this.plateau.setLayout(new FlowLayout());
		this.cartes=new CartesBataille();
		this.plateau.add(this.cartes);
	}
	
	public void initPlateauNord(){
		this.plateauNord=new JPanel();
		this.plateauNord.setLayout(new FlowLayout());
		this.log=new LogBataille();
		this.plateauNord.add(this.log);
	}
	
	public void initPlateauSud(){
		this.plateauSud=new JPanel();
		BorderLayout g = new BorderLayout() ;
		this.plateauSud.setLayout(g);
		this.joueurs=new JoueursBataille();
		this.plateauSud.add(this.joueurs,BorderLayout.CENTER);
		JButton bExit=new JButton("Quitter");
		JButton bNext=new JButton("Tour Suivant");
		this.plateauSud.add(bExit,BorderLayout.WEST);
		this.plateauSud.add(bNext,BorderLayout.EAST);
		BoutonPartie exit=new BoutonPartie(0);
		BoutonPartie next=new BoutonPartie(1);
		bExit.addActionListener(exit);
		bNext.addActionListener(next);
	}

	public static void main(String[] args) {
		Partie p;
		p=Partie.initialiseJeu();
		new PlateauGraphique("Bataille THE GAME",1500,1500,new BatailleControleur(p));
		//p.lancementPartie();
	}

	/************* inner classe pour le Graphique	****************/
	class BoutonPartie implements ActionListener{
		int type;
		
		public BoutonPartie(int t){
			this.type=t;
		}
		
		public void actionPerformed(ActionEvent arg0) {
			if(this.type==0){
				PlateauGraphique.this.dispose();
			}
			else{
				PlateauGraphique.this.bc.nextTurn();
			}
			
		}
		
	}
	
	class LogBataille extends JPanel implements Observer{
		JLabel l;
		public LogBataille(){
			this.l=new JLabel("Nouvelle Partie :",SwingConstants.CENTER);
			PlateauGraphique.this.bc.relieLog(this);
			this.add(this.l);
		}

	protected void paintComponent(Graphics g) {
	    	super.paintComponent(g);
	    	//Affichage Texte
	    	//JLabel l=new JLabel(s,SwingConstants.CENTER);
	    	//this.add(l);
	    	//String text="Joueurs en Bataille :\n";
	    	/*for(Joueur j:PlateauGraphique.this.bc.getListeJoueurBataille()){
	    		text+=j.getPseudo()+" ";
	    	}*/
	    	//this.l.setText(text);
	    	//this.validate();
	    	//PlateauGraphique.this.log.l.setText("test");
	  }

	@Override
	public void update(Observable arg0, Object arg1) {
		// appelle méthode controleur
		
		//retourne la modification de la vue 
		//this.repaint();
		
		//PlateauGraphique.this.log.l.setText("test");
		this.logText((String) arg1);
	}
	
	public void logText(String s){
		if(s instanceof String){
		if(s.equals("bataille")){
			String t=new String("Bataille avec les Joueurs : \n");
			for(Joueur j : PlateauGraphique.this.bc.getListeJoueurBataille()){
				t+=j.getPseudo()+" ";
			}
			this.l.setText(t);
			
		}
		
		if(s.equals("debut_bataille")){
			String t=new String("Nouveau tour avec les Joueurs : \n");
			for(Joueur j : PlateauGraphique.this.bc.getListeJoueurBataille()){
				t+=j.getPseudo()+" ";
			}
			this.l.setText(t);
		}
		
		if(s.equals("gagnant")){
			String t=new String("Gagnant du tour : \n");
			for(Joueur j : PlateauGraphique.this.bc.getListeJoueurBataille()){
				t+=j.getPseudo()+" ";
			}
			this.l.setText(t);
		}
		
	 }
		
	}
	}

	class CartesBataille extends JPanel implements Observer {
		public CartesBataille(){
			this.setLayout(new FlowLayout());
			PlateauGraphique.this.bc.relieCarteBataille(this);
			//this.modifCartePlateau();
			}

	protected void paintComponent(Graphics g) {
	    	super.paintComponent(g);
	    	//Boucle qui récupére les cartes en Bataille
	    	//this.setBackground(Color.BLUE);
	    	
	  }

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof String){
		this.modifCartePlateau((String) arg1);
		}
	}
	
	public void modifCartePlateau(String s){
		if(s.equals("carte")){
		this.removeAll();
		String chemin="C:/Users/DR/workspace/bataille/src/graphique/cartes/";
		for (Map.Entry<Joueur, Carte> entry : PlateauGraphique.this.bc.getLevee().entrySet()) {
			JPanel gridCartes=new JPanel();
			gridCartes.setLayout(new GridLayout(2,1,0,0));
			LabelImage labCentre =new LabelImage(chemin+entry.getValue().getNomFichier());
			System.out.println(chemin+entry.getValue().getNomFichier()+"\n"+entry.getKey().getPseudo());
			/*labCentre.setHorizontalAlignment(JLabel.CENTER);
		    labCentre.setVerticalAlignment(JLabel.CENTER);*/
		    gridCartes.add(labCentre);
		    gridCartes.add(new JLabel(entry.getKey().getPseudo()));
		    this.add(gridCartes);
		}
		this.validate();
		this.repaint();
		}
		//this.getLevee().forEach((k,v) -> System.out.println("Joueur: "+k.getPseudo()+" Carte:"+v));
	}
	
	 }
	
	class JoueursBataille extends JPanel implements Observer {
		//JPanel gridJoueurs;
		
		public JoueursBataille(){
			this.setLayout(new FlowLayout(FlowLayout.CENTER,10,this.getHeight()/2));
			//Boucle qui récupére les joueurs en Bataille
			//this.gridJoueurs=new JPanel(new GridLayout(1,2,10,10));
			for(Joueur j : PlateauGraphique.this.bc.getListeJoueurActif()){
	    		JLabel nom =new JLabel(j.getPseudo());
	    		JLabel nombreCarte =new JLabel("Nombre de Cartes : "+j.getMain().getLotDeCarte().size());
	    		JPanel gridJoueur=new JPanel(new GridLayout(2,1,10,0));
	    		gridJoueur.add(nom,SwingConstants.CENTER);
	    		gridJoueur.add(nombreCarte);
				//this.gridJoueurs.add(gridJoueur);
	    		this.add(gridJoueur);
			}
			//this.add(this.gridJoueurs);
			this.setLayout(new FlowLayout(FlowLayout.CENTER,10,this.getHeight()/2));
			PlateauGraphique.this.bc.relieJoueursBataille(this);
		}
		protected void paintComponent(Graphics g) {
			//this.removeAll();
			//this.modifListeJoueurs();
			super.paintComponent(g);
		    	//this.gridJoueur.removeAll();
			
		    	//Grise les couleurs netant plus actif
		    	/*for(Joueur j : PlateauGraphique.this.bc.getListeJoueurActif()){
		    		JLabel nom =new JLabel(j.getPseudo());
		    		JLabel nombreCarte =new JLabel("Nombre de Cartes : "+j.getMain().getLotDeCarte().size());
					this.gridJoueur.add(nom);
					this.gridJoueur.add(nombreCarte);
					this.add(this.gridJoueur);
				}*/
		    	
		    	//this.setLayout(new FlowLayout(FlowLayout.CENTER,10,this.getHeight()/2));
		    	/*
		    	for(Joueur j : PlateauGraphique.this.bc.getListeJoueurActif()){
		    		JLabel nom =new JLabel(j.getPseudo());
		    		JLabel nombreCarte =new JLabel("Nombre de Cartes : "+j.getMain().getLotDeCarte().size());
		    		JPanel gridJoueur=new JPanel(new GridLayout(2,1,10,0));
		    		gridJoueur.add(nom,SwingConstants.CENTER);
		    		gridJoueur.add(nombreCarte);
					//this.gridJoueurs.add(gridJoueur);
		    		this.add(gridJoueur);
				}*/
		    	//this.setBackground(Color.RED);
		    	
		  }
		public void modifListeJoueurs(){
			this.removeAll();
			//this.setLayout(new FlowLayout(FlowLayout.CENTER,10,this.getHeight()/2));
			for(Joueur j : PlateauGraphique.this.bc.getListeJoueurActif()){
	    		JLabel nom =new JLabel(j.getPseudo());
	    		JLabel nombreCarte =new JLabel("Nombre de Cartes : "+j.getMain().getLotDeCarte().size());
	    		JPanel gridJoueur=new JPanel(new GridLayout(2,1,10,0));
	    		gridJoueur.add(nom,SwingConstants.CENTER);
	    		gridJoueur.add(nombreCarte);
				//this.gridJoueurs.add(gridJoueur);
	    		this.add(gridJoueur);
			}
			this.validate();
			this.repaint();
			//PlateauGraphique.this.repaint();
			//this.setVisible(true);
		}

		public void update(Observable arg0, Object arg1) {
			this.modifListeJoueurs();
			//this.repaint();
		}
		 }
}


