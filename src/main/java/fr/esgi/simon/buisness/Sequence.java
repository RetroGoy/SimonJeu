package fr.esgi.simon.buisness;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sequence {
    private List<String> couleurs;
    private final String[] couleursDisponibles = {"Rouge", "Vert", "Bleu", "Jaune"};

    public Sequence() {
        couleurs = new ArrayList<>();
    }

    public void ajouterCouleur() {
        Random rand = new Random();
        couleurs.add(couleursDisponibles[rand.nextInt(4)]);
    }

    public List<String> getCouleurs() {
        return couleurs;
    }

    public boolean verifierSequence(List<String> sequenceEntree) {
        return couleurs.equals(sequenceEntree);
    }
}
