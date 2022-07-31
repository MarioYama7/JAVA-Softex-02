
package Softex02;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private int id;
    private String nome;
    private double salario;
    private String senha;
    
    public Pessoa(int id, String nome, double salario, String senha) {
        this.setId(id);
        this.setNome(nome);
        this.setSalario(salario);
        this.setSenha(senha);
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
       
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getSenha(){
        return nome;
    }
       
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
