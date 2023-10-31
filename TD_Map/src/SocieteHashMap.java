import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {

HashMap<Employe,Departement> h= new HashMap<Employe, Departement>();

    public void ajouterEmployeDepartement(Employe e,Departement d){
        h.put(e,d);
    };
    public void supprimerEmploye(Employe e){
        h.remove(e);
    };
    public void afficherLesEmployesLeursDepartements(){
        for(Map.Entry<Employe,Departement> entry: h.entrySet()){
            Employe e=entry.getKey();
            Departement d=entry.getValue();
            System.out.println(e.toString());
            System.out.println(d.toString());
        }

    };

    public void afficherLesEmployes(){
        for(Employe e: h.keySet()){
            System.out.println(e.toString());
        }
    };
    public void afficherLesDepartements(){
        for(Departement d: h.values()){
            System.out.println(d.toString());
        }

    };
    public void afficherDepartement(Employe e){
        System.out.println( (h.get(e)).toString());

    };

    public boolean rechercherEmploye(Employe e){};
    public boolean rechercherDepartement(Departement e){};

}
//is equals used in hashmap ?
//is compare sued in hashmap ?

