import java.util.TreeMap;
import java.util.Map;

public class ScoieteTreeMap implements InterfaceSociete{

        TreeMap<Employe,Departement> h= new TreeMap<>();

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

        public boolean rechercherEmploye(Employe e){
            return (h.containsKey(e));
        };
        public boolean rechercherDepartement(Departement e){
            return (h.containsValue(e));
        };







}
