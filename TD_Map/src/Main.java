public class Main {
    public static void main(String[] args) {

        //test de hashmap

        SocieteHashMap societe = new SocieteHashMap();

        Employe e1 = new Employe("654789","ZHT6HG","Mazen","Boulares");
        Employe e2 = new Employe("987456","GHT574","Asma","Masmoudi");
        Employe e3 = new Employe("785471","LOT65G","Bla","BLABla");
        Departement hr = new Departement(1,"HR");
        Departement it = new Departement(2,"IT");

        societe.ajouterEmployeDepartement(e1, hr);
        societe.ajouterEmployeDepartement(e2, it);
        societe.ajouterEmployeDepartement(e3, it);

        //not organized

        // Display all employees and their departments
        System.out.println("All employees and their departments:");
        societe.afficherLesEmployesLeursDepartements();

        // Display all employees
        System.out.println("\nAll employees:");
        societe.afficherLesEmployes();

        // Display all departments
        System.out.println("\nAll departments:");
        societe.afficherLesDepartements();

        // Display department for a specific employee
        System.out.println("\nDepartment for Alice:");
        Employe e = new Employe("654789","ZHT6HG","Mazen","Boulares");
        societe.afficherDepartement(e);

        // Search for an employee


        boolean v = societe.rechercherEmploye(e);
        if (v) {
            System.out.println("Employee exists.");
        } else {
            System.out.println("Employee doesn't exist.");
        }

        // Search for a department

        Departement d = new Departement(2,"IT");

        if (societe.rechercherDepartement(d)) {
            System.out.println("Department IT exists.");
        } else {
            System.out.println("Depatemnet IT doesn't exist.");
        }



        //test de treemap





    }
}