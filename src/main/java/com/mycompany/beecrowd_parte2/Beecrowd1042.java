/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd_parte2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1042 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
       
        int X, Y, Z, min1, min2 = 0, min3 = 0;
        
        X = scan.nextInt();
        Y = scan.nextInt();
        Z = scan.nextInt();
        
        min1 = Math.min(X, Math.min(Y, Z));
        
        if(min1 == X) {
            min2 = Math.min(Y, Z);
            min3 = Math.max(Y, Z);
        }
        if(min1 == Y) {
            min2 = Math.min(X, Z);
            min3 = Math.max(X, Z);
        }
        if(min1 == Z) {
            min2 = Math.min(X, Y);
            min3 = Math.max(X, Y);
        }
        
        System.out.printf("%d%n%d%n%d%n", min1, min2, min3);
        System.out.printf("%n%d%n%d%n%d%n", X, Y, Z);
 
    }
}
