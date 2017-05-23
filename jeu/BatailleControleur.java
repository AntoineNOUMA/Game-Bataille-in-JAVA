package jeu;

import java.util.HashSet;

public class BatailleControleur {
Partie p;

public BatailleControleur(Partie p){
	this.p=p;
}

public Partie getPartie(){
	return this.p;
}

public HashSet<Joueur> getListeJoueurActif(){
	return this.p.getListeJoueur();
}
//Ajouter les add observer dans la classe bataille controleur
public void relieJoueurs

}
