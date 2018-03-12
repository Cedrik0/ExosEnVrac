/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac;

/**
 * Initialisez une variable entière à 243. Décrémentez-la jusqu’à 0.
 * Pour chaque valeur, afficher si la valeur est paire.
 * Pour chaque valeur afficher si la valeur est un multiple de 5.
 * Pour chaque valeur afficher si elle est un multiple de 10.
 * @author cedriclavery
 */
public class Exercice8 {
    public static void launch(){
        int a = 243;
        
        while(a != 0){
            if(a%2 == 0){
                System.out.println(a+ " est paire");
            }
            if(a%5 == 0){
                System.out.println(a + " est un multiple de 5");
            }
            if(a%10 == 0){
                System.out.println(a + " est un multiple de 10");
            }
            a--;
        }
        
        
    }
}
