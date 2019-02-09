package exo_stephane;

import java.util.Calendar;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    /**
     * Constructeur simple
     */
    public Temps(){

    }

    /**
     * définit l'heure
     * @param heures exprimé entre 0 et 23
     */
    public Temps(int heures){
        setHeures(heures);
    }

    /**
     * définit l'heure avec les minutes
     * @param heures exprimé entre 0 et 23
     * @param minutes exprimé entre 0 et 59
     */
    public Temps(int heures,int minutes){
        setHeures(heures);
        setMinutes(minutes);
    }

    /**
     *  définit l'heure les minutes et les secondes
     * @param heures exprimé entre 0 et 23
     * @param minutes exprimé entre 0 et 59
     * @param secondes exprimé entre 0 et 59
     */
    public Temps(int heures,int minutes,int secondes){
        setHeures(heures);
        setMinutes(minutes);
        setSecondes(secondes);
    }

    public int getHeures() {

        return heures;
    }

    public void setHeures(int heures) {
        if (heures <0 || heures > 23){
            throw new RuntimeException("L'heure n'est pas dans les bonnes plages");
        }
        this.heures = heures;
    }

    public int getMinutes() {

        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes <0 ||minutes > 59){
            throw new RuntimeException("Les minutes ne sont pas au bon format");
        }
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if(secondes <0 ||secondes > 59){
            throw new RuntimeException("Les minutes ne sont pas au bon format");
        }
        this.secondes = secondes;
    }

    /**
     * méthode permettant d'ajouter des heures à l'heure courante
     * @param heures
     */
    public int ajouterHeures(int heures) {
        Calendar rightNow = Calendar.getInstance();
        int heure = rightNow.get(Calendar.HOUR_OF_DAY);
        int minute = rightNow.get(Calendar.MINUTE);
        int seconde = rightNow.get(Calendar.SECOND);
        this.minutes = minute;
        this.secondes = seconde;
        if (heure + heures > 24){
            this.heures = (heure + heures) % 24;
        }else if (heure + heures == 24) {
            this.heures = 0;
        }else{
            this.heures = heure + heures;
        }
        return this.heures;
    }

    /**
     * Méthode permettant l'ajout de minutes à l'heure système
     * @param minutes
     */
    public int ajouterMinutes(int minutes) {
        Calendar rightNow = Calendar.getInstance();
        int heure = rightNow.get(Calendar.HOUR_OF_DAY);
        int minute = rightNow.get(Calendar.MINUTE);
        int seconde = rightNow.get(Calendar.SECOND);
        this.secondes = seconde;
        if (minutes + minute > 60){
            this.heures = ajouterHeures((minutes + minute)/60);
            this.minutes = (minutes + minute) % 60;
        }else if(minutes + minute == 60){
            this.minutes = 0;
        }else{
            this.heures = heure;
            this.minutes = minutes + minute;
        }
        return this.minutes;
    }

    /**
     * Méthode ajoutant des secondes à l'heure système
     * @param secondes
     */
    public void ajouterSecondes(int secondes) {
        Calendar rightNow = Calendar.getInstance();
        int heure = rightNow.get(Calendar.HOUR_OF_DAY);
        int minute = rightNow.get(Calendar.MINUTE);
        int seconde = rightNow.get(Calendar.SECOND);
        if (seconde + secondes > 60){
            this.minutes = ajouterMinutes((seconde + secondes)/60);
            this.secondes = (seconde + secondes) % 60;
        }else if (seconde + secondes == 60){
            this.secondes = 0;
        }else{
            this.heures = heure;
            this.minutes = minute;
            this.secondes = secondes + seconde;
        }
    }

    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }
}
