/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac;

/**
 * Initialisez un tableau de booléens de longueur 10.
 * -En utilisant une boucle while inserez des booleens de valeur « vrai ».
 * -En utilisant une boucle while inserez des booleens de valeurs « faux ».
 * -En utilisant une boucle while inserez des booleens de valeur « vrai » et 
 *  des booleens de valeur « faux » sans avoir deux « vrais » ou deux « faux »
 *  cote a cote.
 * -Affichez le tableau de booleens dans la console.
 * @author cedriclavery
 */
public class Exercice6 {
    public static void launch(){
        boolean[] booltab = new boolean[10];
        
        int a = 0;
        while(a < booltab.length){
            booltab[a] = true;
            a++;
        }
        a = 0;
        while(a < booltab.length){
            booltab[a] = false;
            a++;
        }
        a = 0;
        while (a < booltab.length){
            booltab[a] = true;
            System.out.println(booltab[a]);
            a++;
            
            booltab[a] = false;
            System.out.println(booltab[a]);
            a++;
        } 
    }
}
