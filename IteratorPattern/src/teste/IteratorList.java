/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import java.util.List;

/**
 *
 * @author EDUARDO
 */
public class IteratorList implements Iterator{

    private List<Cliente> clientes;
    private int currentPos;
    
    public IteratorList(List<Cliente> clientes) {
        this.clientes = clientes;
        currentPos = 0;
    }
    
    @Override
    public Boolean hasNext() {
        return clientes.size() > currentPos;
    }

    @Override
    public Object getCurrentObject() {
        return clientes.get(currentPos);
    }

    @Override
    public void next() {
        ++currentPos;
    }
        
}
