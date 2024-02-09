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
public class Beecrowd1061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
        String ponto;

        ponto = scan.next();
        W1 = scan.nextInt();
        X1 = scan.nextInt();
        ponto = scan.next();
        Y1 = scan.nextInt();
        ponto = scan.next();
        Z1 = scan.nextInt();
        
        ponto = scan.next();
        W2 = scan.nextInt();
        X2 = scan.nextInt();
        ponto = scan.next();
        Y2 = scan.nextInt();
        ponto = scan.next();
        Z2 = scan.nextInt();
        
        inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
        fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
        duracao = fim - inicio;
        
        W = duracao / (24*60*60);
        resto = duracao % (24*60*60);
        X = resto / (60*60);
        resto = resto % (60*60);
        Y = resto / 60;
        Z = resto % 60;
        
        System.out.println(W +" dia(s)");
        System.out.println(X +" hora(s)");
        System.out.println(Y +" minuto(s)");
        System.out.println(Z +" segundo(s)");
    }
}
