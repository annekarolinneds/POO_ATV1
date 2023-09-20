/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package annekarolinneds.credencial;
/**
 *
 * @author annekarolinneds
 */
public class Credencial {
    
    private String email;
    private String senha;
    private boolean administrador = false;
    
    public Credencial(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    // Metodo toString() sobrescrito
    @Override
    public String toString() {
        return "Credencial [email=" + email + ", senha=" + senha + ", administrador=" + administrador + "]";
    }
    //Getters e setters
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public boolean isadministrador(){
        return administrador;
    }
    public void setadministrador(boolean usuario) {
        this.administrador = administrador;
    }

     
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
