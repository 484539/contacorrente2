/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa1 = new Pessoa("Felipe", "Novais", "356.321.465-66", new Endereco("Rua Vermelha", "324", "Promissão", "Sao Paulo", "16370-000"));
        Conta conta1 = new Conta(43569, 1500, 500);
        
        pessoa1.setContas(conta1);
        
        
        pessoa1.getNomeCompleto();
        pessoa1.getReside();
    }    
}
