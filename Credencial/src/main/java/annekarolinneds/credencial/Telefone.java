/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annekarolinneds.credencial;

/**
 *
 * @author annekarolinneds
 */
public class Telefone {
    private byte ddd;
    private Integer numero;
    
    //Construtor
    public Telefone(byte ddd, Integer numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    // Metodo toString()
    @Override
    public String toString(){
        return "Telefone [ddd=" + ddd + ", numero=" + numero + "]";
    }
    
    //Getters e setters
    public byte getDdd(){
        return ddd;
    }
    public void setDdd(byte ddd){
        this.ddd = ddd;
    }
    public Integer getNumero(){
        return numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }
}
