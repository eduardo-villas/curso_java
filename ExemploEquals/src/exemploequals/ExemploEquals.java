/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploequals;

/**
 *
 * @author eduardov
 */
public class ExemploEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro miniCooper1 = new Carro("BMW", new Motor());
        
        miniCooper1.setModelo("Mini Cooper");
        miniCooper1.setAnoFabricacao(2016);
        
        Carro miniCooper2 = new Carro("BMW", new Motor());
        
        miniCooper2.setModelo("Mini Cooper");
        miniCooper2.setAnoFabricacao(2016);
        
        if (miniCooper1 == miniCooper2) {
            System.out.println("eles tem a mesma referência");
        } else {
            System.out.println("eles são iquais e tem referencias diferentes. Como comparamos objetos em java?");
        }
        
        if (miniCooper1.equals(miniCooper2)) {
            System.out.println("Os dois objetos são iguais");
        } else {
            System.out.println("O dois objetos são diferentes");
        }

    }
    
}
