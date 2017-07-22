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
class ImpressoraEpson implements Impressora {

    public ImpressoraEpson() {
    }

    @Override
    public void imprime(String stringDeImpressao) {
        System.out.println("imprimindo na Epson: "+stringDeImpressao);
    }

    @Override
    public void inicializaImpressora() {
        System.out.println("Inicializando impressora Epson.");
    }

    @Override
    public boolean ligada() {
        System.out.println("Verificando se a impressora Epson está ligada.");
        return true;
    }

    @Override
    public boolean pronta() {
        System.out.println("Verificando se a impressora Epson está pronta.");
        return true;
    }
    
}
