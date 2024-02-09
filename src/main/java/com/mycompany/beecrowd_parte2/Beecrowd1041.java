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
public class Beecrowd1041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float X, Y;
        
        X = scan.nextFloat();
        Y = scan.nextFloat();
        
        if( X > 0.0 && Y > 0.0) {
            System.out.println("Q1");
        }
        
        else if(X < 0.0 && Y > 0.0) {
            System.out.println("Q2");
        }
        
        else if(X < 0.0 && Y < 0.0) {
            System.out.println("Q3");
        }
        
        else if(X > 0.0 && Y < 0.0) {
            System.out.println("Q4");
        }
        
        else if(X == 0.0 && Y > 0.0 || X == 0.0 && Y < 0.0) {
            System.out.println("Eixo Y");
        }
        
        else if(X > 0.0 && Y == 0 || X < 0.0 && Y == 0) {
            System.out.println("Eixo X");
        }
        
        else {
            System.out.println("Origem");
        }
    }
}
