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
        
        Scanner sc = new Scanner(System.in);
        
        double area, raio;
        
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        area = (3.14 * (raio * raio));
        System.out.println("A área da circunferência é: " + area );    
    }
    
}
