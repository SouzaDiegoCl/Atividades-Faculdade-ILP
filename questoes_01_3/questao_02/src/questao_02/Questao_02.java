/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_02;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Questao_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, quadrado;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        quadrado = num * num;
        
        System.out.print("O quadrado de"+ num + " é " + quadrado);
        
    
    }
    
}
