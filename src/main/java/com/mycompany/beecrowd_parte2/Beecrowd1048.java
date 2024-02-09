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
public class Beecrowd1048 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double salario = scan.nextDouble();
        
        double novoSalario, reajuste;
        int percentual;
        if(salario >= 0.0 && salario <= 400.0) {
            reajuste = salario * 0.15;
            novoSalario = (reajuste + salario);
            percentual =  (int) ((reajuste / salario) * 100);
        } else if(salario > 400.0 && salario <= 800.0) {
            reajuste = salario * 0.12;
            novoSalario = (reajuste + salario);
            percentual =  (int) ((reajuste / salario) * 100);
        } else if(salario > 800.0 && salario <= 1200.0) {
            reajuste = salario * 0.10;
            novoSalario = (reajuste + salario);
            percentual =  (int) ((reajuste / salario) * 100);
        } else if(salario > 1200.0 && salario <= 2000.0) {
            reajuste = salario * 0.07;
            novoSalario = (reajuste + salario);
            percentual =  (int) ((reajuste / salario) * 100);
        } else {
            reajuste = salario * 0.04;
            novoSalario = (reajuste + salario);
            percentual =  (int) ((reajuste / salario) * 100);
        }
        
            System.out.printf("Novo salario: %.2f%n" , novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n" , reajuste);
            System.out.println("Em percentual: " + percentual + " %");
        
        scan.close();
    }
}
