import exo_stephane.Livre;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        int heure = rightNow.get(Calendar.HOUR_OF_DAY);
        int minute = rightNow.get(Calendar.MINUTE);
        int seconde = rightNow.get(Calendar.SECOND);
        System.out.println(heure + " & " + minute + " & " + seconde);

    }
}
