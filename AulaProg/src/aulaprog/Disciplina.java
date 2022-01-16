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
public class Disciplina {

    private int codigo;
    private String nome;
    private int carga_horaria;
    private Curso curso;
    private Professor professor;
public void lerDados() {
 Scanner teclado = new Scanner(System.in);

 
System.out.println("Digite o codigo da disciplina:");
this.setCodigo(teclado.nextInt());

 System.out.println("Digite a carga horaria desta disciplina:");
 this.setCarga_horaria(teclado.nextInt());
 
 System.out.println("Digite o nome da disciplina: ");
 this.setNome(teclado.nextLine());
}

public void mostrarDados() {
 System.out.println("Codigo disciplina: "+this.getCodigo());
 System.out.println("Nome disciplina: "+this.getNome());
 System.out.println("Carga horaria: "+this.getCarga_horaria());
 System.out.println("Professor: "+this.getProfessor());
 System.out.println("Curso: " + this.getCurso());
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

    
    public int getCarga_horaria() {
        return carga_horaria;
    }

    
    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    
     
    public Curso getCurso() {
        return curso;
    }

    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
    public Professor getProfessor() {
        return professor;
    }

    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
