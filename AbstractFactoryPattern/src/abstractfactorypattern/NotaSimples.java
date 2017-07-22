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
public class NotaSimples implements Nota {

    @Override
    public String faturaNota(Cliente cliente) {
        return "Nota simples faturando "+cliente.getName();
    }
    
}
