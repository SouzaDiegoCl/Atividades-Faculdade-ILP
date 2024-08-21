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

            String[] names = new String[3];
            double[] valorProdutos = new double[3];
            double valor, valorTotal = 0;
            int qtdVendida;
            
            for(int i = 0; i<3; i++){
                System.out.println("Digite o nome do Produto: ");
                names[i] = sc.nextLine();
                System.out.println("Digite o valor do produto: ");
                valor = sc.nextDouble();
                System.out.println("Digite a quantidade vendida: ");
                qtdVendida = sc.nextInt();
                sc.nextLine();
                valorProdutos[i] = valor * qtdVendida;
                valorTotal += valorProdutos[i];
            }
            
            for(int j =0; j<3; j++){
                System.out.println("Produto: " + names[j] + " Valor: " + valorProdutos[j]);
            }
            
            System.out.println("Valor Total: " + valorTotal);
            
    }
    
}
