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
public class Journaliste {
    
    private String nom;
    private Journal article;
    
    String date_pub;

    public void setDate_pub(String date_pub) {
        this.date_pub = date_pub;
    }

    public String getDate_pub() {
        return date_pub;
    }

    public Journaliste(String nom, Journal article, String date_pub) {
        this.nom = nom;
        this.article = article;
        this.date_pub = date_pub;
    }

    public Journaliste() {
        this.article = new Journal();
    }

    public Journaliste(String nom) {
        this.article = new Journal();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Journal getArticle() {
        return article;
    }

    public void setArticle(Journal article) {
        this.article = article;
    }
    
    //verifie le proprietaire de l'article 
    
    public boolean equals(Journal j){
        return this.article == j;
    }

   
    
}
