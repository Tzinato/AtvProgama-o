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
public class Professor extends Funcionario {
    private String titulacao;
    private String area_pesquisa;

public void lerDados() {
    super.lerDados();

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a titulação do professor:");
    this.setTitulacao(teclado.nextLine());
    System.out.println("Digite a area de pesquisa do professor:");
    this.setArea_pesquisa(teclado.nextLine());
}

public void mostrarDados(){
    super.mostrarDados();

    System.out.println("Titulação do professor: "+this.getTitulacao());
    System.out.println("Area de pesquisa do professor: "+this.getArea_pesquisa());
}

    
    public String getTitulacao() {
        return titulacao;
    }

    
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    
    public String getArea_pesquisa() {
        return area_pesquisa;
    }

    
    public void setArea_pesquisa(String area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }

}

