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
    
    String nome;
    int qtdComprada;
    double precoUnit, total;
    
    System.out.println("Digite o nome do produto: ");    
    nome = sc.nextLine();        
    
    System.out.println("Digite a quantidade comprada: ");    
    qtdComprada = sc.nextInt();        
    
    System.out.println("Digite o preço do produto! ");    
    precoUnit = sc.nextDouble();        
    
    total = qtdComprada * precoUnit;
    
    System.out.println("O Total a pagar pelo "+ nome +" foi: R$"+ total);
    }
    
}
