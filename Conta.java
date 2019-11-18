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
public class Conta {
    
    private int numero;
    private double saldo;
    private double limite;
    
    private Pessoa dono;
    //Construtores
    public Conta() {
    }
    public Conta(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(int numero, double saldo, double limite, Pessoa dono) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.dono = dono;
    }    
    public Conta(Pessoa conta) {
        this.dono = dono;
    }
    //Getters e Setters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    //Métodos
    public void sacar(double valor) {
        if(this.saldo+this.limite < valor){
            System.out.println("Limite não disponível!");
        }else{
            this.saldo = this.saldo-valor;
        }
    }
    public void depositar(double valor) {
        this.saldo = this.saldo+valor;
    }
    public void transferir(Conta destino, double valor) {
        if(this.saldo+this.limite < valor){
            System.out.println("Limite não disponível!");
        }else{
            this.saldo = this.saldo-valor;
            destino.saldo = destino.saldo+valor;
        }
    }

    public Pessoa getConta() {
        return dono;
    }
    public void setConta(Pessoa conta) {
        this.dono = conta;
    }
}
