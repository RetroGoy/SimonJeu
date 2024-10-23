package fr.esgi.simon.service.impl;

import fr.esgi.simon.buisness.Joueur;
import fr.esgi.simon.buisness.Partie;
import fr.esgi.simon.GestionPartieService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


import java.util.List;

public class GestionPartieServiceImpl implements GestionPartieService {
    private Partie partie;

    public GestionPartieServiceImpl() {
        partie = new Partie();
    }

    @Override
    public void lancerPartie() {
        partie.ajouterCouleurDansSequence(); // Initialise la première couleur
    }

    @Override
    public void ajouterJoueur(String nom) {
        partie.ajouterJoueur(new Joueur(nom));
    }

    @Override
    public boolean verifierSequence(Joueur joueur, Partie partie, String sequenceEntree) {
        List<String> sequence = List.of(sequenceEntree.split(","));
        boolean correct = partie.getSequenceCourante().verifierSequence(sequence);

        if (correct) {
            joueur.incrementerScore(2);
        } else {
            joueur.decrementerScore(2);
        }

        return correct;
    }

    @Override
    public Joueur obtenirMeilleurJoueur() {
        return partie.getJoueurs().stream().max((j1, j2) -> Integer.compare(j1.getScore(), j2.getScore())).orElse(null);
    }
}
