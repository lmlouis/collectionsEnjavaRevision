/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lescollection;
import java.util.HashMap;
import java.util.Map.Entry;
/**
 *
 * @author LM
 */
public class Historique {
    
    public HashMap<Journaliste, Journal> historique = new HashMap<>();
    String date;

    public Historique() {
    }

    public HashMap<Journaliste, Journal> getHistorique() {
        return historique;
    }

    public void setHistorique(HashMap<Journaliste, Journal> historique) {
        this.historique = historique;
    }

    public Historique(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    @Override
    public String toString() {
        return "Historique{" + "historique=" + historique + '}';
    }
    
    
    void ajouter(Journaliste j, Journal jt, String date){
        this.historique.put(j, jt);
        this.date = date;
        
    }
    void historique(String date){
       for(Entry<Journaliste, Journal> H: historique.entrySet()){
           if(H.getKey().date_pub == date){
               
                if(H.getKey().equals(H.getValue())){
                System.out.println(  
                       "--------------- Historique -----------------\n"+
                 "\n  le "+H.getValue().getDate_publier()+ " Par "+
                      H.getKey().getNom()+
                    "\n "+ H.getValue().toString()
                      
               );
            }
               
           }

       }
   }
}
