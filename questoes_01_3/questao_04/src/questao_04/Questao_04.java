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
        Scanner sc = new Scanner(System.in);
        int tempo;
        double valPrestacao, taxa, valAtraso;
        
        System.out.println("Digite o valor da parcela");
        valPrestacao = sc.nextDouble();
        System.out.println("Digite o valor da taxa de Juros:");
        taxa = sc.nextDouble();
        System.out.println("Digite quantos meses de atraso:");
        tempo = sc.nextInt();
        
        valAtraso = valPrestacao + (valPrestacao * (taxa /100) * tempo);
        System.out.println("O valor atrasado é: R$" + valAtraso);
        
        
              
    }
    
}
