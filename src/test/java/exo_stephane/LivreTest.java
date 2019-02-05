package exo_stephane;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class LivreTest {

    @Test
    // GIVEN je suis un utilisateur qui saisit un nouveau livre
    // WHEN je saisis  untitre
    // THEN trouve le nom de mon livre dans le retour
    public void titre_saisi(){
        System.setIn(new ByteArrayInputStream("1\n".getBytes()));
        String nom_du_livre = "test_tdd";
        String outpout;
        Livre livre = new Livre(nom_du_livre);
        String output = livre.toString().replace("\r\n", "\n");
        assertEquals(output.endsWith("le livre a pour titre test_tdd ayant pour auteur null avec un prix de 0.0 et est sorti en 0\n"), true);
        assertEquals(output.length() > "le livre a pour titre test_tdd ayant pour auteur null avec un prix de 0.0 et est sorti en 0\n".length(), true);

    }
}