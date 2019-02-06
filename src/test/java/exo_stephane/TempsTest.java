package exo_stephane;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;


public class TempsTest {

    @Test(expected = RuntimeException.class)
    public void heure_negative(){
        int heures = -5;
        Temps temps = new Temps(heures);
    }
    @Test(expected = RuntimeException.class)
    public void heure_sup_23(){
        int heures = 24;
        Temps temps = new Temps(heures);
    }
    @Test(expected = RuntimeException.class)
    public void minutes_negatives(){
        int minutes = -5;
        int heures = 15;
        Temps temps = new Temps(heures,minutes);
    }
    @Test(expected = RuntimeException.class)
    public void minutes_sup_59(){
        int minutes = 60;
        int heures = 15;
        Temps temps = new Temps(heures,minutes);
    }
    @Test(expected = RuntimeException.class)
    public void secondes_negatives(){
        int minutes = 5;
        int secondes = -10;
        int heures = 15;
        Temps temps = new Temps(heures,minutes,secondes);
    }
    @Test(expected = RuntimeException.class)
    public void secondes_sup_59(){
        int minutes = 5;
        int secondes = 60;
        int heures = 15;
        Temps temps = new Temps(heures,minutes,secondes);
    }

    @Test
    public void ajouter_heures(){
        //Temps nouveauTemps = new Temps();
        //Temps nouveauTemps = nouveauTemps.ajouterHeures(int heures);

    }
}
