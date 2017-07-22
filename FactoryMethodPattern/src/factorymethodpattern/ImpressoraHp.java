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
class ImpressoraHp implements Impressora {

    public ImpressoraHp() {
    }

    @Override
    public void imprime(String stringDeImpressao) {
        System.out.println("imprimindo na HP: "+stringDeImpressao);
    }

    @Override
    public void inicializaImpressora() {
        System.out.println("Inicializando impressora HP.");
    }

    @Override
    public boolean ligada() {
        System.out.println("Verificando se a impressora HP está ligada.");
        return true;
    }

    @Override
    public boolean pronta() {
        System.out.println("Verificando se a impressora HP está pronta.");
        return true;
    }
    
}
