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
public class Beecrowd1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int entrada;
        
        int par = 0;
        
        for(int i = 0; i < 5; i++) {
            entrada = scan.nextInt();
            if(entrada % 2 == 0) {
                par = par + 1;
            }
        }
        System.out.println(par + " valores pares");
    }
}
