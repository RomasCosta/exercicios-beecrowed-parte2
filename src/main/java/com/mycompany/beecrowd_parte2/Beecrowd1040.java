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
public class Beecrowd1040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        float N1, N2, N3, N4, MEDIA, exame;
        
        N1 = scan.nextFloat();
        N2 = scan.nextFloat();
        N3 = scan.nextFloat();
        N4 = scan.nextFloat();
        
        MEDIA = ((N1 * 2f) + (N2 * 3f) + (N3 * 4f) + (N4 * 1f)) / 10f;
        
        
        System.out.printf("Media: %.1f%n" ,  MEDIA);
        
        if(MEDIA >= 7.0f) {
            System.out.println("Aluno aprovado.");
        }
        else if(MEDIA < 5.0f) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            exame = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);
            float res = (MEDIA + exame) / 2;
            if(res <= 4.9) {
                System.out.println("Aluno reprovado.");
            } else {
                System.out.println("Aluno aprovado.");
            }
             System.out.printf("Media final: %.1f%n", res);
        }
       
    }
}
