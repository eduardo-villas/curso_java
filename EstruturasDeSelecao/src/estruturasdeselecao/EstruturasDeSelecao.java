/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasdeselecao;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author eduardov
 */
public class EstruturasDeSelecao {

    /**
     * @param args the command line arguments
     */
    private static PrintStream saidaParaTela = System.out;
    
    public static void main(String[] args) {
        
    //    rodaExemploIf();
        rodaExemploSwitch();
        
    }

    private static void rodaExemploIf() {
        // criação das variáveis
        Scanner input;
        int primeiroNumero;
        int segundoNumero;
        
        //instancia um objeto do tipo scanner.
        input = new Scanner(System.in);
        
        saidaParaTela.print("Digite o primeiro número:");
        primeiroNumero = input.nextInt();
        
        saidaParaTela.print("Digite o segundo número:");
        segundoNumero = input.nextInt();
        
        if (primeiroNumero == segundoNumero) {
            saidaParaTela.print("Os dois numeros são iguais.");
        } else if (primeiroNumero > segundoNumero) {
            saidaParaTela.print("O primeiro numero é maior que o segundo.");
        } else {
            saidaParaTela.print("O segundo numero é maior que o primeiro.");
        }
        saidaParaTela.println();//pula uma linha
    }

    private static void rodaExemploSwitch() {
        // criação das variáveis
        Scanner input;
        int diaDaSemana;
                
        //instancia um objeto do tipo scanner.
        input = new Scanner(System.in);
        
        saidaParaTela.print("Digite um numero entre 1 e 7 para saber qual é o dia da semana:");
        diaDaSemana = input.nextInt();
        //existem alguns erros nesse switch case e nós vamos arruma-lo.
        switch (diaDaSemana) {
            case 2:
                saidaParaTela.println("Hoje é segunda feira");
                break;
            case 3:
                saidaParaTela.println("Hoje é terça feira");
                break;
            case 4:
                saidaParaTela.println("Hoje é quarta feira");
                break;
            case 5:
                saidaParaTela.println("Hoje é quinta feira");
                break;
            case 6:
                saidaParaTela.println("Hoje é sexta feira.");
                saidaParaTela.println("Achei que nunca chegaria.");
                break;
            case 7:
            case 1:    
                saidaParaTela.println("Hoje é sábado ou domingo. O que importa é que é fim de semana");
                break;
            default:
                saidaParaTela.println("O dia da semana digitado é inválido. Digite um número entre 1 e 7");
        }
        
        saidaParaTela.println();//pula uma linha
    
    }
    
}
