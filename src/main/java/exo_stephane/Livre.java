
package exo_stephane;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    /**
     * définit un livre par son titre
     * @param titre nom du livre
     */
    public Livre(String titre) {
        setTitre(titre);
        //this.titre = titre;
    }

    /**
     * définit un livre par son nom et son auteur
     * @param titre nom du livre
     * @param auteur auteur du livre
     */
    public Livre(String titre, String auteur) {
        setTitre(titre);
        setAuteur(auteur);
    }

    /**
     * définit un livre par son nom, son auteur et son prix
     * @param titre nom du livre
     * @param auteur auteur du livre
     * @param prix prix du livre
     */
    public Livre(String titre, String auteur, double prix) {
        setTitre(titre);
        setAuteur(auteur);
        setPrix(prix);
    }

    /**
     * définit un livre par son nom, son auteur et son prix et son année de sortie
     * @param titre nom du livre
     * @param auteur auteur du livre
     * @param prix prix du livre
     * @param annee année de sortie du livre
     */
    public Livre(String titre, String auteur, double prix, int annee) {
        setTitre(titre);
        setAuteur(auteur);
        setPrix(prix);
        setAnnee(annee);
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
        if (titre == ""){
            throw new RuntimeException("le titre ne peut pas être vide");
        }
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        if (auteur == ""){
            throw new RuntimeException("l'auteur ne peut pas être vide");
        }
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (prix < 0){
            throw new RuntimeException("le montant du livre ne peut pas être négatif");
        }
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
    //    if (annee == Integer.parseInt(null)){
     //       throw new RuntimeException("l'année du livre doit être remplie");
     //   }
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "le livre a pour titre " + getTitre() + " ayant pour auteur " + getAuteur() + " avec un prix de " + getPrix() + " et est sorti en " + getAnnee();
    }
}
