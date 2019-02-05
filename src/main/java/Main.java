import exo_stephane.Livre;

public class Main {

    public static void main(String[] args) {
     Livre livre = new Livre("99 Francs","Fred Beigbeder", 10,2000);
        System.out.println(livre.toString());

        Livre roman = new Livre(livre);
        System.out.println(roman.toString());

    }
}
