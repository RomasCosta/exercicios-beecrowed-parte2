/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.beecrowd_parte2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1038 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int codigo,quantidade;
        
        codigo = scan.nextInt();
        quantidade = scan.nextInt();
        
        if(codigo == 1) {
            int total = quantidade * 4;
            System.out.println("Total: R$ " + total + ".00");
        }
        else if(codigo == 2 ) {
            double total = quantidade * 4.5;
            System.out.printf("Total: R$ %.2f%n" , total);
        }
        else if(codigo == 3 ) {
            int total = quantidade * 5;
            System.out.println("Total: R$ " + total + ".00");
        }
        else if(codigo == 4 ) {
            int total = quantidade * 2;
            System.out.println("Total: R$ " + total + ".00");
        }
        else if(codigo == 5 ) {
            double total = quantidade * 1.5;
            System.out.printf("Total: R$ %.2f%n" , total);
        }
    }
}
