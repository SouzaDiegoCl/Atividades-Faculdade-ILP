/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_04;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Questao_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double area, a, b, perimetro; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do lado 1: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor do lado 2: ");
        b = sc.nextDouble();
        
        area = a * b;
        
        perimetro = 2*a + 2*b;
        
        System.out.println("A área é "+ area + " \nO perímetro é "+ perimetro);
        
        
        
        
        
    
    }
    
}
