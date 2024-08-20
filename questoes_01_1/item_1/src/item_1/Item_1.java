/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item_1;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Item_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double n1, n2, soma, sub, multi, div;
        
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextDouble();
        
        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        
        System.out.println("Adição: " + n1 + " + " + n2 + " = " + soma);
        System.out.println("Subtração: " + n1 + " - " + n2 + " = " + sub);
        System.out.println("Multiplicação: " + n1 + " x " + n2 + " = " + multi);
        System.out.println("Divisão: " + n1 + " / " + n2 + " = " + div);
        
    }
    
}
