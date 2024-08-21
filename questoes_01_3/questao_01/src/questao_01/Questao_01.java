/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_01;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Questao_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);                
        
        int num1, num2, dobro1, triplo2;
        
        System.err.println("Digite o primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.err.println("Digite o segundo número inteiro: ");
        num2 = sc.nextInt();
        
        dobro1 = num1 * 2;
        triplo2 = num2 * 3;
        
        System.out.println("O dobro de "+ num1 + " é " + dobro1 + "\nO triplo de "+ num2 + " é " + triplo2);
                
    
    }
    
}
