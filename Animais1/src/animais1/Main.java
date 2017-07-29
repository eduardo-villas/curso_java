/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais1;

import org.apache.log4j.Logger;

/**
 *
 * @author eduardov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Leao leao = new Leao();
        logger.info("teste");
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
