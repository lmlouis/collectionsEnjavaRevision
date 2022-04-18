/*
TP : Collection des données 
---------------------------
Cahier de charge: Un client media voudrais une application 
                  de diffusion d'actualité sur une page web.
                  La Page d'actulité présente des journaux/actualisés.
                  le journal est ensemble de magasines;
                  La présentation  de chaque magasines s'effectue selon :
                  - son Libéllé /nom
                  - son autheur
                  - son édition 
                  - et sa date de parution;
                  L'administrateur de la page d'actualité doit être en mésure d'ajouter 
                  de nouveaux magasines, en supprimer certains et bien entendu les modifier si besoin 
                  Les internautes aimeraient avoir un historique des Journaux hebdomadaires;
                  Le journaliste est definie par son nom , son article publié et eventuellement par sa date de publication
 */
package lescollection;






/**
 *
 * @author LM
 */
public class PageActu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //instanciation de l'énumration
        Presentation cl_nom = Presentation.Nom;
        Presentation cl_auth = Presentation.Autheur;
        Presentation cl_ed = Presentation.Edition;
        Presentation cl_an = Presentation.Année;

        //création d'une instance de magasine
        Mag mag = new Mag();
        mag.setNom("Compagne de vaccination dans tous le sud de la France ");
        mag.setAutheur("Jean Durel");
        mag.setEdition("France 2");
        mag.setAnnee("11/09/2011");
        Mag mag2 = new Mag("Faut-il faire nos courses dans les marchés kashères ?", "Bertrand panier", "M6 TV", "12/01/2012"); 
        Mag mag3 = new Mag("Marché de l'immobilier ménacé : Résiliation des contrats de pré-achats", "Luc Drukert", "TF1 TV", "2021");
        //ajout de magasine dans une arraylist
        Journal mg = new Journal();
        mg.ajouterMag(mag);
        mg.ajouterMag(mag2);
        mg.ajouterMag(mag3);
        
 
        
        //creation d'un journaliste
        Journaliste j1 = new Journaliste("Anne Saufi"); 
        j1.setArticle(mg);
        j1.date_pub = "12/06/2012";
        mg.setDate_publier(j1.date_pub);
        

        //création de l'historique
        Historique h1 = new Historique();
        h1.ajouter(j1, mg, j1.date_pub);
        
        System.out.println("--------------- File d'actualité ------------------\n");
        //afficher les magasines sur une page actulité : afficher info caractérisant le mag 
        System.out.println(j1.date_pub+ "    Présenté par Mme/Mr "+ j1.getNom());
        mg.actualite();
        
        //supprimer mag
        System.out.println("--------------- supression d'un mag \n");
        mg.supprimerMag(mag2);
        System.out.println("--------------- Mise à jour  \n");
        mg.actualite();
        
        //ajouter mag
        System.out.println("--------------- ajout de Mag \n");
        mg.ajouterMag(mag2);
        System.out.println("--------------- Mise à jour  \n");
        mg.actualite();
        
        h1.historique("12/06/2012");
       
       System.out.println("--------------- Pied de page copyright@Lm_codage \n"); 
    }
    
}
