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

        Scanner sc = new Scanner(System.in);
        double  valorPago, numLitros;
        
        System.out.println("Digite o número de litros abastecido!");
        numLitros = sc.nextDouble();
        valorPago = numLitros * 5.89;
        
        System.err.println("O valor a ser pago será R$"+valorPago);                    
    }
    
}
