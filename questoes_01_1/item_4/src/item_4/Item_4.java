/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item_4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Item_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double salMin;
        double salFunc = 2000;
        int qtdSal;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.err.println("Digite o salário mínimo");
        salMin = sc.nextDouble();
        
        qtdSal = (int)(salFunc/salMin);
        System.err.println("A quantidade de salários mínimos é " + qtdSal);
        
        
    }
    
}
