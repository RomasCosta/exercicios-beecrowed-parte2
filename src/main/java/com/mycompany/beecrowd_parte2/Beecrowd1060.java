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
public class Beecrowd1060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double valor = 0;
        
        int positivo = 0, negativo = 0;
        
        for(int i = 0; i < 6; i++) {
            valor = scan.nextDouble();
            if(valor > 0) {
            positivo += 1;
            } else {
            negativo += 1;
            }
        }
        System.out.println(positivo + " valores positivos");
    }
}
