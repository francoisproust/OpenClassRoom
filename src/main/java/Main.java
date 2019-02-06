import exo_stephane.Livre;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        /*Calendar rightNow = Calendar.getInstance();
        int heure = rightNow.get(Calendar.HOUR_OF_DAY);
        int minute = rightNow.get(Calendar.MINUTE);
        int seconde = rightNow.get(Calendar.SECOND);
        System.out.println(heure + " & " + minute + " & " + seconde);

        rightNow.add(Calendar.HOUR, 5);
        heure = rightNow.get(Calendar.HOUR);
        System.out.println(heure + " & " + minute + " & " + seconde);

        */

        Date dte = new Date();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setGregorianChange(dte);
        System.out.println(dte);
        gregorianCalendar.add(gregorianCalendar.HOUR_OF_DAY,7);
        dte = gregorianCalendar.getGregorianChange();
        System.out.println(dte);
    }
}
