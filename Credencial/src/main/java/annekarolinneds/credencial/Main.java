/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annekarolinneds.credencial;

/**
 *
 * @author annekarolinneds
 */
public class Main {
    //FUNCAO MAIN
    public static void main(String[] args) {
    Credencial credencial = new Credencial("seu_email", "sua_senha");
    System.out.println("Informações da Credencial:");
    System.out.println("Email: " + credencial.getEmail());
    System.out.println("Senha: " + credencial.getSenha());
    System.out.println("É administrador: " + credencial.isadministrador());
    
   // LocalDate dataNascimento = LocalDate.of(1990,5,15);
   // Pessoa pessoa = new Pessoa("Joao", dataNascimento);
   //int idade = pessoa.calcularIdade();
   //System.out.println("Idade: " +idade);
}
    
}
