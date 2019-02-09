package exo_stephane;

import org.junit.Test;
import static org.junit.Assert.*;


public class RectangleTest {
    @Test
    public void calculPerimetre(){
        Rectangle calcul = new Rectangle();
        calcul.setLargeur(3);
        calcul.setLongueur(5);
        assertEquals(16,calcul.perimetre(),0);
    }
    @Test
    public void calculAire(){
        Rectangle calcul = new Rectangle();
        calcul.setLongueur(5);
        calcul.setLargeur(3);
        assertEquals(15,calcul.aire(),0);
    }
    @Test
    public void estCeCarreOui(){
        Rectangle calcul = new Rectangle();
        calcul.setLargeur(5);
        calcul.setLongueur(5);
        assertEquals(true,calcul.isCarre());
    }
    @Test
    public void estCeCarreNon(){
        Rectangle calcul = new Rectangle();
        calcul.setLargeur(5);
        calcul.setLongueur(4);
        assertEquals(false,calcul.isCarre());
    }
}
