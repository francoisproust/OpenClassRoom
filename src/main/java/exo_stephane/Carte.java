package exo_stephane;

public class Carte {
    private Rang rang;
    private Couleur couleur;

    /**
     * Enumération des différentes cartes
     */
    public enum Rang{
        AS, ROI, DAME, VALET, DIX, NEUF , HUIT, SEPT, SIX, CINQ, QUATRE, TROIS, DEUX
    }

    /**
     * Enumération des couleurs possibles
     */
    public enum Couleur{
        PIQUE,COEUR, TREFLE, CARREAU
    }

    public Carte (Rang rang, Couleur couleur){
        this.rang = rang;
        this.couleur = couleur;
    }

    public Rang getRang() {

        return this.rang;
    }

    public void setRang(Rang rang) {

        this.rang = rang;
    }

    public Couleur getCouleur() {

        return this.couleur;
    }

    public void setCouleur(Couleur couleur) {

        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "rang=" + rang +
                ", couleur=" + couleur +
                '}';
    }
}
