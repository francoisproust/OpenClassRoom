package exo_stephane;


import org.junit.Test;
import static org.junit.Assert.*;

public class PaquetTest {
    @Test
    public void Piocher10cartes(){
        Paquet paquet = new Paquet();
        Carte[] pioche;
        pioche = paquet.piocher(10);
        assertEquals(42,paquet.getNombreDeCartes(),0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void ajouter10cartes(){
        Paquet paquet = new Paquet();
        Carte[] pioche;
        pioche = paquet.piocher(-10);
    }

    @Test
    public void Piocher60cartes(){
        Paquet paquet = new Paquet();
        Carte[] pioche;
        pioche = paquet.piocher(60);
        assertEquals(52,paquet.getNombreDeCartes(),0);
    }
}
