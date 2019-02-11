package exo_stephane;

public class Personne {
    private String nom;
    private String prenom;
    private String sexe;
    private int age;

    /**
     * Constructeur simple:
     */
    public Personne(){

    }

    /**
     * Méthode définissant une personne par son nom et son prénom
     * @param nom
     * @param prenom
     */
    public Personne(String nom, String prenom){
        setNom(nom);
        setPrenom(prenom);
    }

    /**
     * Méthode définissant une personne par son nom, prénom et son age
     * @param nom
     * @param prenom
     * @param age
     */
    public Personne(String nom, String prenom, int age){
        setNom(nom);
        setPrenom(prenom);
        setAge(age);
    }

    /**
     * Méthode définissant une personne par son nom, prénom, age et son sexe
     * @param nom
     * @param prenom
     * @param age
     * @param sexe
     */
    public Personne(String nom, String prenom, int age, String sexe){
        setNom(nom);
        setPrenom(prenom);
        setAge(age);
        setSexe(sexe);
    }

    /**
     * Méthode permettant de dupliquer une personne
     * @param personne
     */
    public Personne(Personne personne){
        this.nom = personne.getNom();
        this.prenom = personne.getPrenom();
        this.age = personne.getAge();
        this.sexe = personne.getSexe();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public String setAge(int age) {
        if (age >= 0 && age <= 130){
            this.age = age;
            String result = String.valueOf(age);
            return result;
        }
        return "l'age doit être compris en 0 et 130 ans";
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", age=" + age +
                '}';
    }
}
