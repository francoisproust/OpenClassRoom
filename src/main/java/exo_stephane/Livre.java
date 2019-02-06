
package exo_stephane;

public class Livre {
    private String titre ;
    private String auteur ;
    private double prix ;
    private int annee ;

    /**
     * constructeur Livre
     */
    public Livre(){
        this.titre = "";
        this.auteur = "";
        this.prix = 0;
        this.annee = 0;
    }

    /**
     * définit un livre par son titre
     * @param titre nom du livre
     */
    public Livre(String titre) {
        setTitre(titre);
    }

    /**
     * définit un livre par son nom et son auteur
     * @param titre nom du livre
     * @param auteur auteur du livre
     */
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;

    }

    /**
     * définit un livre par son nom, son auteur et son prix
     * @param titre nom du livre
     * @param auteur auteur du livre
     * @param prix prix du livre
     */
    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    /**
     * définit un livre par son nom, son auteur et son prix et son année de sortie
     * @param titre nom du livre
     * @param auteur auteur du livre
     * @param prix prix du livre
     * @param annee année de sortie du livre
     */
    public Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }

    public Livre(Livre reference){
        this.titre = reference.getTitre();
        this.auteur = reference.getAuteur();
        this.prix = reference.getPrix();
        this.annee = reference.getAnnee();
    }

    public String getTitre() {

        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {

        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {

        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {

        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "le livre a pour titre " + getTitre() + " ayant pour auteur " + getAuteur() + " avec un prix de " + getPrix() + " et est sorti en " + getAnnee();
    }
}
