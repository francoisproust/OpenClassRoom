package exo_stephane;

public class Rectangle {
    private double longueur;
    private double largeur;

    /**
     * méthode qui définit un constructeur simple
     */
    public Rectangle(){

    }

    /**
     * méthode qui définit un rectangle
     * @param longueur
     * @param largeur
     */
    public Rectangle(double longueur,double largeur){
        setLargeur(largeur);
        setLongueur(longueur);
    }

    /**
     * méthode définissant un rectangle par un existant déjà
     * @param rectangle
     */
    public Rectangle(Rectangle rectangle){
        this.largeur = rectangle.getLargeur();
        this.longueur = rectangle.getLongueur();
    }

    /**
     * Méthode calculant le périmètre d'un rectangle
     * @return le périmètre du rectangle
     */
    public double perimetre() {
        double perimetre = (this.getLargeur() + this.getLongueur()) * 2;
        return perimetre;
    }

    /**
     * Méthode calculant l'aire d'un rectangle
     * @return l'aire du rectangle
     */
    public double aire(){
        double aire = this.getLongueur() * this.getLargeur();
        return aire;
    }

    /**
     * Methode vérifiant si le rectangle est un carré
     * @return boolean à true si c est un carré
     */
    public boolean isCarre() {
        boolean result;
        if (this.getLongueur() - this.getLargeur() == 0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
