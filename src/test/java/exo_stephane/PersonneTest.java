package exo_stephane;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonneTest {
    @Test
    public void ageNegatif(){
       Personne personne = new Personne();
       String result = personne.setAge(-5);
       assertEquals(result, "l'age doit être compris en 0 et 130 ans");
    }

    @Test
    public void ageSuperieur(){
        Personne personne = new Personne();
        String result = personne.setAge(131);
        assertEquals(result, "l'age doit être compris en 0 et 130 ans");
    }

    @Test
    public void ageDansLaTranche(){
        Personne personne = new Personne();
        String result = personne.setAge(50);
        assertEquals(result,"50");
    }

    @Test
    public void creationPersonneNomPrenom(){
        Personne personne = new Personne("François","PROUST");
        String result = personne.toString();
        assertEquals(result,"Personne{nom='François', prenom='PROUST', sexe='null', age=0}");
    }

    @Test
    public void creationPersonneNomPrenomAge(){
        Personne personne = new Personne("François","PROUST",50);
        String result = personne.toString();
        assertEquals(result,"Personne{nom='François', prenom='PROUST', sexe='null', age=50}");
    }
    @Test
    public void creationPersonneNomPrenomAgeSexe(){
        Personne personne = new Personne("François","PROUST",50,"M");
        String result = personne.toString();
        assertEquals(result,"Personne{nom='François', prenom='PROUST', sexe='M', age=50}");
    }

    @Test
    public void dupliquerPersonne(){
        Personne personne = new Personne("François","PROUST",50,"M");
        String result = personne.toString();
        Personne dupliquer = new Personne(personne);
        String result2 = dupliquer.toString();
        assertEquals(result2,result);
    }
}
