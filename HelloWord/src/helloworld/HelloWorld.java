/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//pacote da classe
package helloworld;

/**
 *
 * @author eduardov
 */
//classe publica HelloWorld
// todas classes tem um nome.
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    //metod statico invocado pela jvm. Porque é necessário?
    //recebe os argumentos pela linha de comando.
    //metodos e cla
    // coloque o seguinte codigo no metodo main
    // System.out.println(args.length);
    public static void main(String[] args) {
        System.out.println("Hello world");
        HelloWorld.hello();
    }
    
    public static void hello() {
        System.out.println("metodo hello");
    }
    
}
