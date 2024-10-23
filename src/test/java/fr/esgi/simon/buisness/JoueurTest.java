package fr.esgi.simon.buisness;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JoueurTest {

    @Test
    public void testIncrementerScore() {
        Joueur joueur = new Joueur("Alice");
        joueur.incrementerScore(2);
        assertEquals(2, joueur.getScore());
    }

    @Test
    public void testDecrementerScore() {
        Joueur joueur = new Joueur("Alice");
        joueur.incrementerScore(2);
        joueur.decrementerScore(2);
        assertEquals(0, joueur.getScore());
    }
}
