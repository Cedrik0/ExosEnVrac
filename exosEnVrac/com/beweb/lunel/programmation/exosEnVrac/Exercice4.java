/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac;

/**
 * Ecrivez l’algo suivant.
 * -Déclaration d’une variable booléenne « flag » et initialisation d’une
 *  variable entière à 0.
 * -Ecrire une condition qui incrémente la variable entière si la variable
 *  booléenne est fausse.
 * -Ecrire une condition qui décrémente la variable entière si la variable
 *  booléenne est vrai.
 * -Inverser la valeur de la variable booléenne.
 * -Ecrire une condition qui incrémente la variable entière si la variable
 *  booléenne est vrai.
 * -Ecrire une condition qui décrémente la variable entière si la variable
 *  booléenne est fausse.
 * A l’issu de l’algorithme quel est la valeur de la variable entière ?
 * 
 * @author cedriclavery
 * 
 * La valeur de la variable est de 0
 */
public class Exercice4 {
    
    public static void launch(){
        
        boolean flag = true;
        int a = 0;
        
        if(!flag){
            a++;
        }else{
            a--;
        }
        flag = false;
        if(!flag){
            a++;
        }else{
            a--;
        }
    }
}
