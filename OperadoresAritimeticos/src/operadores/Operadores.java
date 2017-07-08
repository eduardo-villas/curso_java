/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.io.PrintStream;

/**
 *
 * @author eduardov
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    private static final PrintStream saidaTela = System.out;
    
    public static void main(String[] args) {
        mostraOperadoresMatematicos();
        mostraOperadoresRelacionais();
        mostraOperadoresLogicos();
        mostraOperadoresBitABit();
    }

    private static void mostraOperadoresMatematicos() {
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
        
        
        saidaTela.println("resultados:");
        //Assim como em C java tem um printf.
        saidaTela.printf("soma:%s, multiplicação:%s, divisão:%s, subtração:%s, modulo:%s\n",
                sum,
                mult, 
                div,
                sub,
                mod);
        
        saidaTela.println();
    }
    
    private static void mostraOperadoresRelacionais() {
        saidaTela.println("Operadores Relacionais");
        int a, b;
        a = 1;
        b = 1;
        
        if (a == b) 
            saidaTela.println("a e b são iguais");
        
        if (a <= b) 
            saidaTela.println("a é menor ou iqual a b");

        b = 2;
        if (a <= b) 
            saidaTela.println("a é menor ou iqual a b");
        
                
        if (a != b) 
            saidaTela.println("a e b são diferentes");
        
        
        if (a < b) 
            saidaTela.println("a é menor que b");
        
        a = 3;
        if (a > b) 
            saidaTela.println("a é maior que b");
        
        saidaTela.println();
                        
    }

    private static void mostraOperadoresLogicos() {
        saidaTela.println("Operadores Logicos");
        int a, b;
        a = 1;
        b = 1;
        
        if (a == 1 && b == 1) 
            saidaTela.println("a e b tem o valor igual a 1");
        a = 2;
        if (a == 1 || b == 1)
            saidaTela.println("a ou b são iquais a 1");
        
        saidaTela.println();
    }

    private static void mostraOperadoresBitABit() {
        saidaTela.println("Operadores bit a bit");
        int onze_1011 = 11;
        int cinco_0101 = 5;
        int bitAndResult = onze_1011 & cinco_0101;
        int bitOrResult = onze_1011 | cinco_0101;
        int xorResult = onze_1011 ^ cinco_0101;
        
        saidaTela.printf("%d;%s & %d;%s == %s;%d\n", 
                onze_1011,
                Integer.toBinaryString(onze_1011),
                cinco_0101,
                Integer.toBinaryString(cinco_0101),
                Integer.toBinaryString(bitAndResult), 
                bitAndResult);
        
        saidaTela.printf("%d;%s | %d;%s == %s;%d\n", 
                onze_1011,
                Integer.toBinaryString(onze_1011),
                cinco_0101,
                Integer.toBinaryString(cinco_0101),
                Integer.toBinaryString(bitOrResult), 
                bitOrResult);

        saidaTela.printf("%d;%s ^ %d;%s == %s;%d\n", 
                onze_1011,
                Integer.toBinaryString(onze_1011),
                cinco_0101,
                Integer.toBinaryString(cinco_0101),
                Integer.toBinaryString(xorResult), 
                xorResult);

        int _232 = 232;
        int complementResult = ~_232;
        saidaTela.printf("%d;%s ~ == %d;%s\n", 
                _232, 
                Integer.toBinaryString(_232),
                complementResult,
                Integer.toBinaryString(complementResult));
        //11101000
        //1110100000
        int quinze_1111 = 15;
        int shiftLeftResult = quinze_1111 << 3;
        saidaTela.printf("%d;%s << 3 == %d;%s\n", 
                quinze_1111, 
                Integer.toBinaryString(quinze_1111),
                shiftLeftResult,
                Integer.toBinaryString(shiftLeftResult));

        int shiftRightResult = quinze_1111 >> 3;
        saidaTela.printf("%d;%s >> 3 == %d;%s\n", 
                quinze_1111, 
                Integer.toBinaryString(quinze_1111),
                shiftRightResult,
                Integer.toBinaryString(shiftRightResult));

        int zeroFillRightShift = quinze_1111 >>> 3;
        saidaTela.printf("%d;%s >>> 3 == %d;%s\n", 
                quinze_1111, 
                Integer.toBinaryString(quinze_1111),
                zeroFillRightShift,
                Integer.toBinaryString(zeroFillRightShift));

        
        saidaTela.println();
        
        
    }
    
}
