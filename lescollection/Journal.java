
/*
TP : Collection des données 
---------------------------
Cahier de charge: Un client media voudrais une application 
                  de diffusion d'actualité sur une page web.
                  La Page d'actulité présente des journaux/actualirés.
                  le journal est ensemble de magasines;
                  La présentation  de chaque magasines s'effectue selon :
                  - son Libéllé 
                  - son autheur
                  - son édition 
                  - et sa date de parution;
                  L'administrateur de la page d'actualité doit être en mésure d'ajouter 
                  de nouveaux magasines, en supprimer certains et bien entendu les modifier si besoin.
                  l'historique est une collection hebdomadaire de date de publication du journale et nom du superviseur 
 */

package lescollection;
import java.util.ArrayList;
/**
 *
 * @author LM
 */
public class Journal {
    
    private ArrayList<Mag> actu = new ArrayList<>();
    private String date_publier ;

    public Journal() {
    }

    public ArrayList<Mag> getActu() {
        return actu;
    }
    
    public Journal(String date_publier) {
        this.date_publier = date_publier;
    }

    public String getDate_publier() {
        return date_publier;
    }

    public void setDate_publier(String date_publier) {
        this.date_publier = date_publier;
    }
    
    

    public void setActu(ArrayList<Mag> actu) {
        this.actu = actu;
    }
    
    
    void ajouterMag(Mag mg){
        this.getActu().add(mg);
    }
    
    void supprimerMag(Mag mg){
        this.getActu().remove(mg);
    }
    
    void libererMag(Mag mg){
        this.getActu().clear();
    }
    
    void actualite(){
        for(int i=0; i<this.getActu().size(); i++ ){
            if(this.getActu().get(i) instanceof Mag){
                System.out.println("                  Actu n°"+ (i+1) +"\n");
                this.getActu().get(i).afficher();
                System.out.println(" \n");
            }
        }
    }

    @Override
    public String toString() {
        return "Journal{" + "actu=" + actu.toString() + '}';
    }
    
    
    
}
