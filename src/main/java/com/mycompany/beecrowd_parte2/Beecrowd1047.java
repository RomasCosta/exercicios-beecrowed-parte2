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
public class Beecrowd1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();
        
        int instanteInicial = horaInicial * 60 + minutoInicial;
        int instanteFinal = horaFinal * 60 + minutoFinal;
        
        int duracao;
        if(instanteInicial < instanteFinal) {
            duracao = instanteFinal - instanteInicial;
        } else {
            duracao = (24 * 60 - instanteInicial) + instanteFinal;
        }
        
        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;
        
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
    }
}
