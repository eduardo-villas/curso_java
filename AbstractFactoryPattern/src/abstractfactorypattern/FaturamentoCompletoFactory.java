/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactorypattern;

/**
 *
 * @author EDUARDO
 */
public class FaturamentoCompletoFactory implements FaturamentoFactory {

    @Override
    public Cliente factoryCliente() {
        return new ClienteCompleto();
    }

    @Override
    public Nota factoryNota() {
        return new NotaCompleta();
    }
    
}
