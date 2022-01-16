/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprog;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Curso  {

    private int codigo;
    private String nome; 
    private int duracao;

public void Curso(int codigo, String nome, int duracao ){


}
public void lerDados() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o nome do cruso");
    this.setNome(teclado.nextLine());
    System.out.println("Digite o codigo do curso");
    this.setCodigo(teclado.nextInt());
    System.out.println("Digite a duração do curso:");
    this.setDuracao(teclado.nextInt());
}
public void mostrarDados() {
 System.out.println("Codigo do curso: "+this.getCodigo());
 System.out.println("Nome curso: "+this.getNome());
 System.out.println("Duração do curso: "+this.getDuracao());
 
 }

    
    public int getCodigo() {
        return codigo;
    }

   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public int getDuracao() {
        return duracao;
    }

    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
