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
public class Beecrowd1043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        float A, B, C, P = 0, Area = 0;
        
        A = scan.nextFloat();
        B = scan.nextFloat();
        C = scan.nextFloat();
        
        if(A + B > C && A + C > B && B + C > A) {
            P = A + B + C;
            System.out.println("Perimetro = "+ P);
        } else{
            Area = ((A + B) * C) / 2; 
            System.out.println("Area = " + Area);
        }
        
        //System.out.printf("%.1f %.1f %.1f", A, B, C);
    }
}
