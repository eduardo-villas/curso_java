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
public interface Impressora {
    public void imprime(String stringDeImpressao);

    public void inicializaImpressora();
    public boolean ligada();
    public boolean pronta();
}
