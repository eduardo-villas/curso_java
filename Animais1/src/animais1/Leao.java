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
public class Leao implements Animal {
    
    public Leao() {
        
    }

    @Override
    public void emiteSom() {
        System.out.printf("%s ruge \n", getEspecie());
    }

    @Override
    public String getEspecie() {
        return "leão";
    }
    
}
