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
public class FactoryImpressoraHP extends FactoryImpressora {

    @Override
    protected Impressora createImpressora() {
        return new ImpressoraHp();
    }
    
}
