//tu dois 
package interface_noyau_fonctionnel;

public class InterfaceNoyauFonctionnel {

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        return new String[]{"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"};
    }
    
    //méthode permettant de generer une liste de tables adaptée au nombre de personnes choisies
    public String[] tablesDisponibles(int nbPersonnes){
        if(nbPersonnes == 2 ){
            return new String[]{"Table 1"};
            }
        if(nbPersonnes == 3 || nbPersonnes == 4){
            return new String[]{"Table 2", "Table 3", "Table 4", "Table 5"};
            }
            
        if(nbPersonnes == 5 || nbPersonnes == 6 ||nbPersonnes == 7 || nbPersonnes == 8){
            return new String[]{"Table 6"};
            }
        return null;
         }
    
    

//methodes appelées dans le dialog
    public void dateChoisie(){
        System.out.println("la date a été choisie");
    }
    
    
    public void heureChoisie(){
        System.out.println("l'heure a été choisie");
    }
    
    
    public void tableChoisie(int n){
        System.out.println( " la table " + n + " a été choisie");
    }
    public void confirmation(){
        System.out.println( " l'utilisateur a validé la réservation");
    }
    
    public void annuler(){
        System.out.println( " l'utilisateur a annulé la réservation");
    }
    
}

