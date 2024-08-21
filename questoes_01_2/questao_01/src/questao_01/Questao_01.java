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
        double sal, percent,novoSalario ;
        System.out.println("Digite o salário mensal");
        sal = sc.nextDouble();
        System.out.println("Digite o percentual de reajuste");
        percent = sc.nextDouble();
        novoSalario = sal + (sal * percent)/100;
        
        System.out.println("O salário ajustado é " + novoSalario);
    }
    
}
