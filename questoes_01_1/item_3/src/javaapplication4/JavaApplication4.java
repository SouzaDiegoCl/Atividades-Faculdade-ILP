/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int idade, dias;
       Scanner sc = new Scanner(System.in);
       
        System.err.println("Digite sua idade(em anos)");
        idade = sc.nextInt();
        
        dias = idade * 365;
        
        System.err.println("Você já viveu "+ dias + " dias!");               
    }
    
}
