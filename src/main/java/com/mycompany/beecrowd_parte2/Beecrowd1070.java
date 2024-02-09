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
public class Beecrowd1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        
        int impar = 0;
        while(impar < 6) {
               if(X % 2 != 0) {
                impar = impar + 1;
                System.out.println(X);
            }  
        X = X + 1;
        }
    }
}
