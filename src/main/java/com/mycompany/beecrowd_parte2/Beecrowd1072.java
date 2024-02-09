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
public class Beecrowd1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        int X = 0, in = 0, out = 0, volta = 0;
        while(volta < N) {
            //System.out.println("Insira um número: ");
            X = scan.nextInt();
            
            if(X < 10 || X > 20) {
                out = out + 1;
            } else {
                in = in + 1;
            }
            volta = volta + 1;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
