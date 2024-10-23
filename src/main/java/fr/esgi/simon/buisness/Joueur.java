package fr.esgi.simon.buisness;

public class Joueur {
    private String nom;
    private int score;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void incrementerScore(int points) {
        this.score += points;
    }

    public void decrementerScore(int points) {
        this.score -= points;
    }
}
