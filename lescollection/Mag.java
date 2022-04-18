/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lescollection;


/**
 *
 * @author LM
 */
public class Mag {
    
    private String nom; 
    private String autheur; 
    private String edition;
    private String annee;
    //public Presentation critere ;

    public Mag() {
    }

    public Mag(String nom, String autheur, String edition, String annee) {
        this.nom = nom;
        this.autheur = autheur;
        this.edition = edition;
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public String getAutheur() {
        return autheur;
    }

    public String getEdition() {
        return edition;
    }

    public String getAnnee() {
        return annee;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAutheur(String autheur) {
        this.autheur = autheur;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "\nMag{\n" + "\n nom=" + nom + ", \n autheur=" + autheur + ", \n edition=" + edition + ", \n annee=" + annee + "\n}\n";
    }


    
    
    
    void afficher(){
                for(Presentation critere :  Presentation.values()){
                    if(critere.equals(Presentation.Nom)){
                        System.out.println(
                        critere.Nom +" : "+this.getNom());
                    }
                    if(critere.equals(Presentation.Autheur)){
                        System.out.println(
                        critere.Autheur +" : "+this.getAutheur());
                    }
                    if(critere.equals(Presentation.Edition)){
                        System.out.println(
                        critere.Edition +" : "+this.getEdition());
                    }
                    if(critere.equals(Presentation.Année)){
                        System.out.println(
                        critere.Année +" : "+this.getAnnee());
                    }
                }
    }
  
}
