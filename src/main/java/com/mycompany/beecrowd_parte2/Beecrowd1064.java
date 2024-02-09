/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd_parte2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double entrada, soma = 0, media = 0;
        int positivo = 0, negativo = 0;
        
        for(int i = 1; i <= 6; i++) {
            entrada = scan.nextDouble();
            if(entrada > 0) {
                positivo = positivo + 1;
                soma = soma + entrada;
            } else {
                negativo = negativo + 1;
            }
            media = soma / positivo;
        }
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f%n", media);
        
    }
}
