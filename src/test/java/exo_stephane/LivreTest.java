package exo_stephane;

import org.junit.Test;
import static org.junit.Assert.*;

public class LivreTest {

    // JDD //
    private String titre = "99 Francs";
    private String auteur = "Fred Beigbeder";
    private double prix = 7.99;
    private int annee = 2010;


    @Test
    public void titre_saisi_titre_auteur_prix_annee(){
        Livre roman = new Livre(titre, auteur,prix,annee);
        assertEquals("le livre a pour titre 99 Francs ayant pour auteur Fred Beigbeder avec un prix de 7.99 et est sorti en 2010",roman.toString());
    }

    @Test
    public void titre_saisi_titre_auteur_prix(){
        Livre roman = new Livre(titre, auteur,prix);
        assertEquals("le livre a pour titre 99 Francs ayant pour auteur Fred Beigbeder avec un prix de 7.99 et est sorti en 0", roman.toString());
    }
    @Test
    public void titre_saisi_titre_auteur(){
        Livre roman = new Livre(titre, auteur);
        assertEquals("le livre a pour titre 99 Francs ayant pour auteur Fred Beigbeder avec un prix de 0.0 et est sorti en 0",roman.toString());
    }
    @Test
    public void titre_saisi_titre(){
        Livre roman = new Livre(titre);
        assertEquals("le livre a pour titre 99 Francs ayant pour auteur null avec un prix de 0.0 et est sorti en 0", roman.toString());
    }

    @Test
    public void livre_saisi_sans_titre(){
        Livre roman = new Livre("","toto",10,2010);
        assertEquals("le livre a pour titre  ayant pour auteur toto avec un prix de 10.0 et est sorti en 2010", roman.toString());
    }

    @Test
    public void livre_saisi_sans_auteur(){
        Livre roman = new Livre("toto","",10,2010);
        assertEquals("le livre a pour titre toto ayant pour auteur  avec un prix de 10.0 et est sorti en 2010", roman.toString());
    }

    @Test
    public void livre_saisi_prix_negatif(){
        Livre roman = new Livre("toto","test",-10,2010);
        assertEquals("le livre a pour titre toto ayant pour auteur test avec un prix de -10.0 et est sorti en 2010", roman.toString());
    }

    @Test
    public void duplication_livre(){
        Livre roman = new Livre(titre, auteur,prix,annee);
        Livre roman_duplique = new Livre(roman);
        assertEquals(roman.toString(),roman_duplique.toString());

    }

}