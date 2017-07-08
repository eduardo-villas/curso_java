/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author eduardov
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaração de variáveis.
        int mult;
        int div;
        int mod;
        
        int sum;
        int sub;
        
        //Nota atribuição para as variáveis são feitas com o sinal de =
        // Os operadores * / % são avaliados primeiro se houver varios deles
        // a ordem de avaliação é da esquerda para a direita
        // é possível utilizar parênteses para forcar a avaliação
        mult = 9 * 2;
        div = 9 / 2;
        mod = 9 % 2;
        
        sub = 9 - 2;
        sum = 9 + 2;
        
        
        System.out.println("resultados:");
        //Assim como em C java tem um printf.
        System.out.printf("soma:%s, multiplicação:%s, divisão:%s, subtração:%s, modulo:%s\n",
                sum,
                mult, 
                div,
                sub,
                mod);
        
    }
    
}
