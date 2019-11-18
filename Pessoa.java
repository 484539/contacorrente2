/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String CPF;
    
    private Endereco reside;
    ArrayList<Conta> contas = new ArrayList();
    //Construtores
    public Pessoa() {
    }
    public Pessoa(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }
    
     public Pessoa(String nome, String sobrenome, String CPF, Endereco reside) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.reside = reside;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    //Métodos
    public void validarCPF(String CPF) {
        if (this.CPF.equals(CPF))
            System.out.println("CPF válido!");
        else
            System.out.println("CPF inválido!");
    }
    public void getNomeCompleto() {
        System.out.println("Nome Completo: "+this.getNome()+" "+this.getSobrenome());
    }

    public Endereco getReside() {
        return reside;
    }
    public void setReside(Endereco reside) {
        this.reside = reside;
    }
    public void getContas() {
        for (int i=0; i<contas.size(); i++){
            System.out.println("Contas: "+this.contas.get(i).getConta());
        }
    }
    public void setContas(Conta conta) {
        contas.add(conta);
    }    
}
