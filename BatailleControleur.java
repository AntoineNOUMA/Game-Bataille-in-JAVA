package jeu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Observer;

public class BatailleControleur {
Partie p;

public BatailleControleur(Partie p){
	this.p=p;
}

public Partie getPartie(){
	return this.p;
}

public Plateau getPlateau(){
	return this.p.getPlateauPartie();
}

public HashSet<Joueur> getListeJoueurActif(){
	return this.p.getListeJoueur();
}

public HashSet<Joueur> getListeJoueurBataille(){
	return this.getPlateau().getListeJoueurBataille();
}

public HashMap<Joueur,Carte> getLevee(){
	return this.p.getPlateauPartie().getLevee();
}

public void prepBataille(){
	this.p.preparationBataille();
}

public void nextTurn(){
	this.p.lancementPartieGraphique();
}

//Ajouter les add observer dans la classe bataille controleur

public void relieJoueursBataille(Observer o){
	this.getPartie().addObserver(o);
}

public void relieLog(Observer o){
	this.getPlateau().addObserver(o);
}

public void relieCarteBataille(Observer o){
	this.getPlateau().addObserver(o);
}

}
