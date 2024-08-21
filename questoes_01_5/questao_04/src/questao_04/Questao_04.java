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

        String nome;
        int qtdMax, qtdEstoque, qtdComprar;

        System.out.println("Digite o nome do produto: ");
        nome = sc.nextLine();
        System.out.println("Digite a quantidae máxima do produto: ");
        qtdMax = sc.nextInt();
        System.out.println("Digite a quantidae em estoque: ");
        qtdEstoque = sc.nextInt();
        
        qtdComprar = qtdMax - qtdEstoque;
        System.out.println("A quantidade a comprar de "+ nome + " é "+ qtdComprar + " unidades!");
    }

}
