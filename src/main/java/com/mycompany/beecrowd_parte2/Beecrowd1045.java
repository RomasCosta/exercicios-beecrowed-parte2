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
public class Beecrowd1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float A = 0, B = 0, C = 0, num1, num2, num3;
        
        num1 = scan.nextFloat();
        num2 = scan.nextFloat();
        num3 = scan.nextFloat();
        
        if(num1 > num2 && num1 > num3) {
            A = num1;
        
            if(num2 > num3){
                B = num2;
                C = num3;
            } 
            else {
                B = num3;
                C = num2;
            }  
        }
        else if(num2 > num3) {
            A = num2;
            if(num1 > num3){
                B = num1;
                C = num3;
            } 
            else {
                B = num3;
                C = num1;
            }
        }
        
        else {
            A = num3;
            if(num1 > num2) {
                B = num1;
                C = num2;
            }
            else {
                B = num2;
                C = num1;
            }
        }
        
        if(A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        
        else {
               if(A *A == B * B + C * C) {
                   System.out.println("TRIANGULO RETANGULO");
               }

               else if(A * A > B * B + C * C) {
                   System.out.println("TRIANGULO OBTUSANGULO");
               }

               else {
                   System.out.println("TRIANGULO ACUTANGULO");
               }
               
               if(A == B && B == C) {
                   System.out.println("TRIANGULO EQUILATERO");
               }
               
               else if(A == B || A == C || B == C) {
                   System.out.println("TRIANGULO ISOSCELES");
               }
        }
        
        //System.out.printf("%.1f%n%.1f%n%.1f%n", num1, num2, num3);
        //System.out.printf("%n%.1f%n%.1f%n%.1f%n", A, B, C);
    }
}
