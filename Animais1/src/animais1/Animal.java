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
public interface Animal {

    default public void emiteSom() {
        System.out.printf("%s emitindo som \n", getEspecie());
    }
    
    public String getEspecie();
    
 }
