package exo_stephane;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class LivreTest {

    // JDD //
    private String titre = "99 Francs";
    private String auteur = "Fred Beigbeder";
    private double prix = 7.99;
    private int annee = 2010;


    @Test
    // GIVEN je suis un utilisateur
    // WHEN je saisis  un titre, un auteur, un prix et une année
    // THEN trouve le nom de mon livre dans le retour
    public void titre_saisi_titre_auteur_prix_annee(){
        Livre roman = new Livre(titre, auteur,prix,annee);
        assertEquals(roman.toString(),"le livre a pour titre 99 Francs ayant pour auteur Fred Beigbeder avec un prix de 7.99 et est sorti en 2010");
    }

    @Test
    public void titre_saisi_titre_auteur_prix(){
        Livre roman = new Livre(titre, auteur,prix);
        assertEquals(roman.toString(),"le livre a pour titre 99 Francs ayant pour auteur Fred Beigbeder avec un prix de 7.99");
    }
    @Test
    public void titre_saisi_titre_auteur(){
        Livre roman = new Livre(titre, auteur);
        assertEquals(roman.toString(),"le livre a pour titre 99 Francs ayant pour auteur Fred Beigbeder");
    }
    @Test
    public void titre_saisi_titre(){
        Livre roman = new Livre(titre);
        assertEquals(roman.toString(),"le livre a pour titre 99 Francs");
    }

    @Test(expected = RuntimeException.class)
    public void livre_saisi_sans_titre(){
        Livre roman = new Livre("","toto",10,2010);
    }

    @Test(expected = RuntimeException.class)
    public void livre_saisi_sans_auteur(){
        Livre roman = new Livre("toto","",10,2010);
    }

    @Test(expected = RuntimeException.class)
    public void livre_saisi_prix_negatif(){
        Livre roman = new Livre("toto","test",-10,2010);
    }

    @Test
    public void duplication_livre(){
        Livre roman = new Livre(titre, auteur,prix,annee);
        Livre roman_duplique = new Livre(roman);
        assertEquals(roman.toString(),roman_duplique.toString());

    }

}