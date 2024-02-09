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
public class Beecrowd1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int horaInicial, horaFinal, duracao;
        
        horaInicial = scan.nextInt();
        horaFinal = scan.nextInt();
        
        if(horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        
    }
}
