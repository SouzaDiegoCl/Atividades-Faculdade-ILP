/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_03;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Fornecedores {
    
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;
       
    Scanner sc = new Scanner(System.in);

    public Fornecedores(){
        this("","","");
    }
    
    public Fornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarFornecedor(){
        System.out.println("Digite o nome do fornecedor: ");
        setNomeFornecedor(sc.nextLine());
        System.out.println("Digite o nome do produto: ");
        setNomeProduto(sc.nextLine());
        System.out.println("Digite a descrição do produto: ");
        setDescricaoProduto(sc.nextLine());               
    }   
    public void listarFonercedor(){
        System.out.println("*** Dados Fornecedor *** \n Nome do fornecedor: "+ getNomeFornecedor());
        System.out.println("*** Dados Produto ***\n Nome do produto: "+ getNomeProduto()+ "\n Nome da descrição do produto: "+ getDescricaoProduto());
    }
}
