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
public class Gato implements Animal {

    public Gato() {
    }

    @Override
    public void emiteSom() {
        System.out.printf("%s mia \n", getEspecie());
    }

    @Override
    public String getEspecie() {
        return "gato";
    }

}
