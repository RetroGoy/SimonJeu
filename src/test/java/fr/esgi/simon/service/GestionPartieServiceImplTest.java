package fr.esgi.simon.service;

import fr.esgi.simon.GestionPartieService;
import fr.esgi.simon.buisness.Partie;
import fr.esgi.simon.impl.GestionPartieServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestionPartieServiceImplTest {

    private fr.esgi.simon.service.GestionPartieService gestionPartieService;

    @BeforeEach
    public void setUp() {
        gestionPartieService = new fr.esgi.simon.service.impl.GestionPartieServiceImpl();
    }

    @Test
    public void testAjoutJoueur() {
        gestionPartieService.ajouterJoueur("Alice");
        Partie partie = ((fr.esgi.simon.service.impl.GestionPartieServiceImpl) gestionPartieService).getPartie();
        assertEquals(1, partie.getJoueurs().size());
    }

    @Test
    public void testLancerPartie() {
        gestionPartieService.lancerPartie();
        Partie partie = ((fr.esgi.simon.service.impl.GestionPartieServiceImpl) gestionPartieService).getPartie();
        assertFalse(partie.getSequenceCourante().getCouleurs().isEmpty());
    }
}
