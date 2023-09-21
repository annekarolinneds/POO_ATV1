/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annekarolinneds.credencial;

/**
 *
 * @author annekarolinneds
 */
public class Endereco {
    private String tipoLogradouro;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private Integer cep;
    
    //Construtor
    public Endereco(String tipoLogradouro, String logradouro, Integer numero, String bairro, Integer cep){
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }
    
    //Metodo toString()
    @Override
    public String toString() {
        return "Endereco [tipoLogradouro=" + tipoLogradouro + ", logradouro=" + logradouro + ", numero=" + numero
                + ", bairro=" + bairro + ", cep=" + cep + "]";
    }
    
    //Getters e setters
    public String getTipoLogradouro(){
        return tipoLogradouro;
    }
    public void setTipoLogradouro(String tipoLogradouro){
        this.tipoLogradouro = tipoLogradouro;
    }
    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public Integer getNumero(){
        return numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public Integer getCep(){
        return cep;
    }
    public void setCep(Integer cep) {
        this.cep = cep;
    }
}
