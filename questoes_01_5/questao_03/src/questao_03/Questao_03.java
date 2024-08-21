/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_03;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Questao_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double volume, raio, altura;
        
        System.out.println("Digite o valor do raio do cilindro: ");
        raio = sc.nextDouble();
        System.out.println("Digite o valor da altura do cilindro: ");
        altura = sc.nextDouble();
        
        volume = 3.14159 * raio * raio * altura;
        
        System.out.println("O volume do cilindro é: " + volume + "cm");
    
    }
    
}
