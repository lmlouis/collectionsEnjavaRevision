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
public enum Presentation {
   
    Nom, 
    Autheur, 
    Edition,
    Année;

    //permet de voir comment s'écrit la constante
    void voir(){
        System.out.println(this.name());
    }
    
    


}
