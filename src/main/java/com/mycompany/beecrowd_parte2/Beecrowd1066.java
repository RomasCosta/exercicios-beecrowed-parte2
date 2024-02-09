/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd_parte2;

import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int entrada, par = 0, impar = 0, positivo = 0, negativo = 0;
        
        
        for(int i = 0; i < 5; i++) {
            entrada = scan.nextInt();
            if(entrada % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
            if(entrada > 0) {
                positivo = positivo + 1;
            } else if(entrada < 0){
                negativo = negativo + 1;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
