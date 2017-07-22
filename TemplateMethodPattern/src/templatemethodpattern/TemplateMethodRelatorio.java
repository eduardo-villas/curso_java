/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethodpattern;

/**
 *
 * @author EDUARDO
 */
public abstract class TemplateMethodRelatorio {
    
    public void printRelatorio() {
        if (!inicializaAmbienteDeImpressao() || !inicializaImpressora())
            return;
        
        imprimeRelatorio();
        finalizaRelatorio();
        finalizaImpressora();
        finalizaAmbiente();
    }

    abstract protected boolean inicializaAmbienteDeImpressao();
    abstract protected boolean inicializaImpressora();
    abstract protected void imprimeRelatorio();
    abstract protected void finalizaRelatorio();
    abstract protected void finalizaImpressora();
    
    private void finalizaAmbiente() {
        System.out.println("Finalizando ambiente\n");
    }
    
}
