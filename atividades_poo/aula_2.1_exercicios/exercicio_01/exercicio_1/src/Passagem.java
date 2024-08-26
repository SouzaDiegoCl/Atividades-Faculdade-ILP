
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Passagem {
    private String nomePassageiro;
    private String RG;
    private String telefone;
    private String localViagem;
    private String data;
    private String horario;
    private int numPoltrona;
    
    Scanner sc = new Scanner(System.in);
    
    public Passagem(){
        this("","","","","","",0);
    };

    public Passagem(String nomePassageiro, String RG, String telefone, String localViagem, String data, String horario, int numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.RG = RG;
        this.telefone = telefone;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }
    
    //Encapsulamento
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(int numPoltrona) {
        this.numPoltrona = numPoltrona;
    }        
    
   public void cadastrarDadosPassageiros(){
       System.out.println("Digite o nome do Passageiro");
       setNomePassageiro(sc.next());
       System.out.println("Digite o RG do Passageiro");
       setRG(sc.next());
       System.out.println("Digite o Telefone do Passageiro");
       setTelefone(sc.next());
   }
   public void cadastrarDadosPassagem(){
       System.out.println("Digite o local da viagem");
       setLocalViagem(sc.next());
       System.out.println("Digite a data da viagem");
       setData(sc.next());
       System.out.println("Digite o Horário da Viagem");
       setHorario(sc.next());
       System.out.println("Digite número da poltrona");
       setNumPoltrona(sc.nextInt());
   }
   public void mostrarDadosPassageiro(){
       System.out.println("***Dados Passageiro *** \n Nome Passageiros: "+ getNomePassageiro() + 
               "\n RG: " +getRG()+ "\n Telefone: "+ getTelefone());
   }
   public void mostrarDadosPassagem(){
       System.out.println("***Dados Passagem *** \n Local Viagem: "+ getLocalViagem() + "\n Data Viagem: "+ getData() + "\n Horário Viagem: " + getHorario()+ "\n Poltrona: "+getNumPoltrona());
   }

    @Override
    public String toString() {
        return "Passagem{" + "nomePassageiro=" + nomePassageiro + ", RG=" + RG + ", telefone=" + telefone + ", localViagem=" + localViagem + ", data=" + data + ", horario=" + horario + ", numPoltrona=" + numPoltrona + ", sc=" + sc + '}';
    }
   
   
    
}
