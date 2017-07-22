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
public class TestDriveFactoryMethod {

    void run(FactoryImpressora factoryImpressora) {
        Impressora impressora = factoryImpressora.fatoryImpressora();
        if (impressora.pronta())
            impressora.imprime("TESTE");
        
    }
    
}
