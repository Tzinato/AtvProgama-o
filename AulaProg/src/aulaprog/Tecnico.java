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
public class Tecnico extends Funcionario {

    private String area_atuacao;

public void lerDados() {
    super.lerDados();

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a area de atuação do tecnico");
    this.setArea_atuacao(teclado.nextLine());
}

public void mostrarDados(){
    super.mostrarDados();

    System.out.println("A area de atuação do tecnico é: "+this.getArea_atuacao());

}

    
    public String getArea_atuacao() {
        return area_atuacao;
    }

    
    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

}
