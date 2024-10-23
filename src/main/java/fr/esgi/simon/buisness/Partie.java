package fr.esgi.simon.buisness;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Joueur> joueurs;
    private Sequence sequenceCourante;
    private int joueurActuel;

    public Partie() {
        joueurs = new ArrayList<>();
        sequenceCourante = new Sequence();
        joueurActuel = 0;
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    public Joueur getJoueurActuel() {
        return joueurs.get(joueurActuel);
    }

    public void passerAuJoueurSuivant() {
        joueurActuel = (joueurActuel + 1) % joueurs.size();
    }

    public Sequence getSequenceCourante() {
        return sequenceCourante;
    }

    public void ajouterCouleurDansSequence() {
        sequenceCourante.ajouterCouleur();
    }
}
