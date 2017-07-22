/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

/**
 *
 * @author EDUARDO
 */
public class IteratorArray implements Iterator{

    private Cliente clientes[];
    private int currentPos;
    
    public IteratorArray(Cliente clientes[]) {
        this.clientes = clientes;
        currentPos = 0;
    }
    
    @Override
    public Boolean hasNext() {
        return clientes.length > currentPos;
    }

    @Override
    public Object getCurrentObject() {
        return clientes[currentPos];
    }

    @Override
    public void next() {
        ++currentPos;
    }
    
}
