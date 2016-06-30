
public class Etudiant {

    private String nom;

    private String prenom;

    private String adresse;
    private int dateNaiss;

    public Etudiant(String nom, String prenom, String adresse,int dateNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateNaiss = dateNaiss;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(int dateNaiss) {
        this.adresse = adresse;
    }
    public int getAge(){
        return 2016 - getDateNaiss() ;
    }
}

