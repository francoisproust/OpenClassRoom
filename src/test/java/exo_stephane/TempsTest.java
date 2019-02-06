package exo_stephane;

import org.junit.Test;


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
    public void ajouter_heures_demain(){
        int heure = 23;
        Temps nouveauTemps = new Temps();
        nouveauTemps.ajouterHeures(heure);
        System.out.println(nouveauTemps.toString());
    }

    @Test
    public void ajouter_heures_deux_jours(){
        int heure = 48;
        Temps nouveauTemps = new Temps();
        nouveauTemps.ajouterHeures(heure);
        System.out.println(nouveauTemps.toString());
    }
    @Test
    public void ajouter_secondes_sup60(){
        int secondes = 122;
        Temps nouveauTemps = new Temps();
        nouveauTemps.ajouterSecondes(secondes);
        System.out.println(nouveauTemps.toString());
    }

    @Test
    public void ajouter_secondes_inf60(){
        int secondes = 3600;
        Temps nouveauTemps = new Temps();
        nouveauTemps.ajouterSecondes(secondes);
        System.out.println(nouveauTemps.toString());
    }
}
