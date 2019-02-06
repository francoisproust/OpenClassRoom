package exo_stephane;

import java.util.Calendar;
import java.util.GregorianCalendar;

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



    private void heureSysteme(){
        java.util.Date date = new java.util.Date();

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

    public String ajouterHeures(int heures) {
        String nouvelleHeure = null;

        return  nouvelleHeure;
    }

    private int retourneHeureSysteme(int toto){
        Calendar rightNow = Calendar.getInstance();

      return 0  ;
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
