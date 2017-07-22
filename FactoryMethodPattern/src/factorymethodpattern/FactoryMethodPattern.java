/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethodpattern;

/**
 *
 * @author EDUARDO
 */
public class FactoryMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestDriveFactoryMethod testDriveFactoryMethod = new TestDriveFactoryMethod();
        
        FactoryImpressora factoryImpressoraHP = new FactoryImpressoraHP();
        FactoryImpressora factoryImpressoraEpson = new FactoryImpressoraEpson();
        
        testDriveFactoryMethod.run(factoryImpressoraHP);
        testDriveFactoryMethod.run(factoryImpressoraEpson);
        
    }
    
}
