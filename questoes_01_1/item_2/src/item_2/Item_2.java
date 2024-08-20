/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item_2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Item_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media1, media2, nota1, nota2, nota3, nota4, nota5, nota6, soma;

        System.out.println("Digite nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite nota 3: ");
        nota3 = sc.nextDouble();

        media1 = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média 1: "+ media1);
        
        
        System.out.println("Digite nota 4: ");
        nota4 = sc.nextDouble();
        System.out.println("Digite nota 5: ");
        nota5 = sc.nextDouble();
        System.out.println("Digite nota 6: ");
        nota6 = sc.nextDouble();

        media2 = (nota4 + nota5 + nota6) / 3;
        System.out.println("Média 2: "+ media2);
        
        soma = media1 + media2;
        
        System.out.println("Soma é: "+ soma);

    }

}
