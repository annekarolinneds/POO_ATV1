/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annekarolinneds.credencial;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author annekarolinneds
 */
public class Pessoa {
    private String nome;
    private LocalDate nascimento;
    private byte idade;
    private Endereco endereco;
    private List<Telefone> telefones;
    
    //Construtor 
    public Pessoa(String nome,LocalDate nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
        this.idade =(byte)calcularIdade();
        this.telefones = new ArrayList<>();
    }
    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(nascimento, dataAtual);
        return periodo.getYears();
    }
    
    //Metodo toString()
    @Override 
    public String toString(){
        return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + ", idade=" + idade + "]";
    }
    
    //Getters e stters 
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public LocalDate getNascimento(){
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }
    public void setIdade(byte idade){
        this.idade = idade;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public List<Telefone> getTelefones(){
        return telefones;
    }
    public void setTelefones(List<Telefone> telefones){
        this.telefones = telefones;
    }
    
}
