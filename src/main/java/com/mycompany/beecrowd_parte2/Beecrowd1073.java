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
public class Beecrowd1073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int quadrado;
        for(int i = 1; i <= N; i++) {
            if(i % 2 == 0) {
                quadrado = i * i;
                System.out.println(i + "^2" + " = " + quadrado);
            }
        }
    }
}
