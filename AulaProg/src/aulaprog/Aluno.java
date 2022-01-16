/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprog;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Aluno {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String matricula;
    private Curso curso;

    public Aluno(String nome, String endereco, String telefone, String cpf, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.matricula = matricula;
        
    }
    
    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matriula) {
        this.matricula = matriula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno:");
        this.setNome(teclado.nextLine());
        System.out.println("Digite o endereço do Aluno:");
        this.setEndereco(teclado.nextLine());
        System.out.println("Digite o telefone do Aluno:");
        this.setTelefone(teclado.nextLine());
        System.out.println("Digite o cpf do Aluno:");
        this.setCpf(teclado.nextLine());
        System.out.println("Digite a matricula do Aluno:");
        this.setMatricula(teclado.nextLine());
        
    }
     public void mostrarDados(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Endereço: "+ this.getEndereco());
        System.out.println("Telefone: "+ this.getTelefone());
        System.out.println("Cpf: "+ this.getCpf());
        System.out.println("Matricula: "+ this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    } 
}
