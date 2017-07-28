/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais1;

/**
 *
 * @author eduardov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Leao leao = new Leao();
        
        emiteSom(cachorro);
        emiteSom(gato);
        emiteSom(leao);
    }

    private static void emiteSom(Animal animal) {
        System.out.println("Capturar o "+animal.getEspecie());
        animal.emiteSom();
        System.out.println("Soltando o "+animal.getEspecie());
    }

}
