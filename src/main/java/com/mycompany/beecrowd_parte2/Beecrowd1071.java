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
public class Beecrowd1071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        int Y = scan.nextInt();
        Y = Y + 1;
        
        int soma = 0;
        for(int i = Y; i < X; i++) {
            if(i % 2 != 0) {
                soma = soma + i;
                //System.out.println("i: " + i);
            }
        }
        System.out.println(soma);
    }
}
