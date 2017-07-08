/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;
import static java.lang.System.out;
/**
 *
 * @author eduardov
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b = 0;             // 8 bits -128 a 127
        short s = 1;            //16 bits -32768 a 32767
        int i = 2;              //32 bits -2^31 a 2^31-1 Integer é a classe que pode ser usada para representar um int
        long l = 3;             //64 bits -2^63 a 2^63 Long é a classe que pode ser usada para representar um long
        float f = 4.4f;         //32 bits ponto flutuante Float é a classe que pode ser usada para representar um float                
        double d = 5.3d;        //64 bits ponto flutuante Double é a classe que pode ser usada para representar um double
        boolean bool = false;   //true ou false Boolean é a classe que pode ser usada para representar um boolean    
        char c = 'c';           //caractere unicode de 16 bits 0 até 65535 ou \u0000 \uffff 
        
        String string = "hello"; //Não é um tipo primitivo porém 
        //import static java.lang.System.out; 
        out.println("Printando os tipos primitivos com printf:");
        //voce pode quegrar uma expressão em várias linhas se ela for
        //muito grande.
        System.out.printf(
                "byte:%d, "
                + "short:%s, "
                + "int:%d, "
                + "long:%d, "
                + "float:%f, "
                + "double:%f, "
                + "boolean:%b, "
                + "char:%c, "
                + "string:%s\n", 
                b, s, i, l, f, d, bool, c, string
        );
        

    }
    
}
