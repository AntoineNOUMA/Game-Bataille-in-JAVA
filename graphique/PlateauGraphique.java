package graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class PlateauGraphique extends JFrame{
	JPanel plateau;
	LogBataille log;
	CartesBataille cartes;
	JoueursBataille joueurs;
	
	public PlateauGraphique(String titre, int w, int h)	{
	 	super(titre);
		this.initPlateau();
		this.initComposants();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	    this.setSize(w, h);
	   	this.setVisible(true);
	}

	public void initComposants()  {
		this.setLayout(new BorderLayout());
	    this.add(plateau, BorderLayout.CENTER);
	}

	public void initPlateau()	{
		this.plateau=new JPanel();
		GridLayout g =new GridLayout(3,1);
		this.plateau.setLayout(g);
		this.log=new LogBataille();
		this.cartes=new CartesBataille();
		this.joueurs=new JoueursBataille();
		this.plateau.add(this.log);
		this.plateau.add(this.cartes);
		this.plateau.add(this.joueurs);
	}

	public static void main(String[] args) {
		new PlateauGraphique("Bataille THE GAME",1500,1500);

	}

	/************* inner classe pour le Graphique	****************/
	class LogBataille extends JPanel implements Observer{
		JLabel l;
		public LogBataille(){
			this.l=new JLabel("Joueurs en Bataille :");
		}

	protected void paintComponent(Graphics g) {
	    	super.paintComponent(g);
	    	//Affichage Texte
	    	//JLabel l=new JLabel(s,SwingConstants.CENTER);
	    	this.add(l);
	  }

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	 }

	class CartesBataille extends JPanel implements Observer {
		public CartesBataille(){
			this.setLayout(new FlowLayout());
		}

	protected void paintComponent(Graphics g) {
	    	super.paintComponent(g);
	    	//Boucle qui récupére les cartes en Bataille
	    	this.setBackground(Color.BLUE);
	    	
	  }

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	 }
	
	class JoueursBataille extends JPanel implements Observer {
		public JoueursBataille(){
			this.setLayout(new FlowLayout());
			//Boucle qui récupére les joueurs en Bataille
		}
		protected void paintComponent(Graphics g) {
		    	super.paintComponent(g);
		    	//Grise les couleurs netant plus actif
		    	this.setBackground(Color.RED);
		  }
		@Override
		public void update(Observable arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
		 }

}
