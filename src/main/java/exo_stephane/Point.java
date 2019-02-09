package exo_stephane;

public class Point {
    private double x;
    private double y;

    /**
     * contructeur simple
     */
    public Point() {
    }

    /**
     * constructeur définissant un point
     * @param x valeur des abscisses
     * @param y valeur des ordonnées
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * constructeur créant une duplication d'un point existant
     * @param point
     */
    public Point(Point point){
        this.x = point.getX();
        this.y = point.getY();
    }

    /**
     * Méthode calculant la distance entre deux points
     * @param x abscisse du point A
     * @param y oordonnée du point A
     * @param x1 abscisse du point B
     * @param y1 oordonnée du point B
     * @return la distance entre deux points
     */
    public double Distance(double x, double y, double x1, double y1) {
        double distanceAbscisse = Math.pow((x - x1),2);
        double distanceOrdonnees = Math.pow(y-y1,2);

        double distance = Math.sqrt(distanceAbscisse + distanceOrdonnees );

        return distance;
    }

    /**
     * Méthode permettant le calcul de distance entre deux points dont un existe déjà
     * @param x abscisse du nouveau point
     * @param y oordonnée du nouveau point
     * @return distance entre les deux points
     */
    public double Distance(double x, double y) {
        double distanceAbscisse = Math.pow((this.x - x),2);
        double distanceOrdonnees = Math.pow(this.y -y,2);
        double distance = Math.sqrt(distanceAbscisse + distanceOrdonnees );
        return distance;
    }

    /**
     * Méthode permettant le calcul de distance entre deux points
     * @param b objet point comportant  un abscisse et une ordonnée
     * @return la distance entre les deux points
     */
    public double Distance(Point b) {
        double distanceAbscisse = Math.pow((this.x - b.getX()),2);
        double distanceOrdonnees = Math.pow(this.y -b.getY(),2);
        double distance = Math.sqrt(distanceAbscisse + distanceOrdonnees );
        return distance;
    }

    /**
     * Méthode permettant de déplacer un point
     * @param x abscisse à ajouter
     * @param y oordonnée à ajouter
     */
    public void DeplacerPoint(double x, double y) {
        this.x = getX() + x;
        this.y = getY() + y;
    }

    /**
     * Méthode permettant de déplacer un point
     * @param x abscisse à ajouter
     * @param y oordonnée à ajouter
     */
    public void Translate(double x, double y) {
        this.x = getX() + x;
        this.y = getY() + y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
