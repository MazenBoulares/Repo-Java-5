import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private  String cin;
    private  String matr;
    private  String nom ;
    private String prenom;

    public Employe() {
    }

    public Employe(String cin, String matr, String nom, String prenom) {
        this.cin = cin;
        this.matr = matr;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
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

    @Override
    public String toString() {
        return "Employe{" +
                "cin='" + cin + '\'' +
                ", matr='" + matr + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(cin, employe.cin) &&Objects.equals(nom, employe.nom) ;
    }




    @Override
    public int hashCode() {
       // return Objects.hash(cin, matr, nom, prenom);
        return cin.hashCode();
    }


    @Override
    public int compareTo(Employe other) {

        return this.nom.compareTo(other.nom);


    }



}

