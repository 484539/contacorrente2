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
public class Endereco {
    
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String CEP;
    
    ArrayList<Pessoa> reside = new ArrayList();
    //Construtores
    public Endereco() {
    }
    public Endereco(String rua, String numero, String cidade, String estado, String CEP) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }
    //Getters e Setters
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    //Métodos
    public void getLocalizacaoByCEP(String CEP) {
        if (this.CEP.equals(CEP))
            System.out.println("Rua: "+this.getRua()+
                    "\nCidade: "+this.getCidade()+
                    "\nEstado: "+this.getEstado());
    }

    public void getReside() {
        for (int i=0; i<reside.size(); i++){
            System.out.println("Nome: "+this.reside.get(i).getNome());
        }
    }
    public void setReside(Pessoa morador) {
        reside.add(morador);
    }
}
