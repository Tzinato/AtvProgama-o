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
public class Funcionario {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String ctps;
    private double salario;

public void lerDados() {
 Scanner teclado = new Scanner(System.in);

 System.out.println("Digite o nome do funcionário:");
 this.setNome(teclado.nextLine());

 System.out.println("Digite o endereço do funcionário:");
 this.setEndereco(teclado.nextLine());
 System.out.println("Digite o telefone do funcionário:");
 this.setTelefone(teclado.nextLine());
 System.out.println("Digite o CPF do funcionário:");
 this.setCpf(teclado.nextLine());
 System.out.println("Digite o CTPS do funcionário:");
 this.setCtps(teclado.nextLine());
 System.out.println("Digite o salário do funcionário:");
 this.setSalario(teclado.nextDouble());
 } 

public void mostrarDados() {
 System.out.println("Nome: "+this.getNome());
 System.out.println("Endereço: "+this.getEndereco());
 System.out.println("Telefone: "+this.getTelefone());
 System.out.println("CPF: "+this.getCpf());
 System.out.println("CTPS: " + this.getCtps());
 System.out.println("Salário: "+this.getSalario());
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

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    
    
    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

