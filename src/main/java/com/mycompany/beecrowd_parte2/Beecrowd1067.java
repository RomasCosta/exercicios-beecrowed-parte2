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
public class Beecrowd1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int entrada = scan.nextInt();
        
        for(int i = 0; i <= entrada; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
            //System.out.println(i);
            //System.out.println(entrada);
        }
    }
}
