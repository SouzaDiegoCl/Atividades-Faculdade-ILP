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
        
        final int salFixo = 1000;
        int qtdVendas, salTotal;
        
        System.out.println("Digite a quantidade de móveis vendidos: ");
        qtdVendas= sc.nextInt();
        salTotal = salFixo + (50 * qtdVendas);
        
        System.out.println("O total de vendas foi " + qtdVendas + "\n Salário Total: R$"+ salTotal);
        
        sc.close();
    
    }
    
}
