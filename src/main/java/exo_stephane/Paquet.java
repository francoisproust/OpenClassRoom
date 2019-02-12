package exo_stephane;

import exo_stephane.Carte.*;

import java.util.Arrays;
import java.util.Random;

public class Paquet {
    private Carte[] cartes;

    /**
     * Méthode permettant de construire le paquet de carte en fonction de la classe Carte
     */
    public Paquet() {
        this.cartes = new Carte[Rang.values().length * Couleur.values().length];
        for (int i = 0; i < Couleur.values().length; i++) {
            for (int j = 0; j < Rang.values().length; j++) {
                this.cartes[i * Rang.values().length + j] = new Carte(Rang.values()[j], Couleur.values()[i]);
            }
        }
        melangerPaquet();
    }

    /**
     * Méthode permettant de mélanger le paquet
     */
    private void melangerPaquet(){
        Random aleatoire = new Random();
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < this.cartes.length; j++)
            {
                Carte temp;
                temp = this.cartes[i];
                this.cartes[i] = this.cartes[j];
                this.cartes[j] = temp;
            }
        }
    }

    /**
     * Méthode permettant de piocher X cartes
     * @param n nombre de cartes à piocher
     * @return les cartes piochées
     */
    public Carte[] piocher(int n){
        if(n <= this.cartes.length)
        {
            Carte[] cartesPiochees = Arrays.copyOfRange(this.cartes, 0, n );
            this.cartes = Arrays.copyOfRange(this.cartes,n,this.cartes.length );

            return cartesPiochees;
        }

        return null;
    }

    /**
     * Méthode retournant le reste de cartes dans le paquet
     * @return
     */
    public int getNombreDeCartes(){

        return this.cartes.length;
    }
}
