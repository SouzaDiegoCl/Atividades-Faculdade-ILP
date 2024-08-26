/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_02;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Cliente {
    private String nome;
    private String end;
    private String rg;
    
    private Scanner sc = new Scanner(System.in);       

    public Cliente(){
        this("", "", "");
    }
    
    public Cliente(String nome, String end, String rg) {
        this.nome = nome;
        this.end = end;
        this.rg = rg;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void cadastrarCliente(){
        System.out.println("Digite o nome do cliente: ");
        setNome(sc.nextLine());
        System.out.println("Digite o endereço: ");
        setEnd(sc.nextLine());
        System.out.println("Digite o RG do cliente: ");
        setRg(sc.nextLine());
    }
    
    public void listarCliente(){        
        System.out.println("*** Dados do cliente ***\n Nome do cliente: "+ getNome() + "\n Endereço: "+ getEnd()+ "\n RG: "+ getRg());
    }
    
    
}
