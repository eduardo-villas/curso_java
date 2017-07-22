package factorymethodpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUARDO
 */
abstract public class FactoryImpressora {
    
    final public Impressora fatoryImpressora() {
        Impressora impressora = createImpressora();
        if (impressora == null)
            impressora = new ImpressoraNull();
        
        if (impressora.ligada())
            impressora.inicializaImpressora();
        
        return impressora;    
    }
    
    abstract protected Impressora createImpressora();
}
