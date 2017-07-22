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
class ImpressoraNull implements Impressora {

    public ImpressoraNull() {
    }

    @Override
    public void imprime(String stringDeImpressao) {
        
    }

    @Override
    public void inicializaImpressora() {
    }

    @Override
    public boolean ligada() {
        return false;
    }

    @Override
    public boolean pronta() {
        return false;
    }
    
}
