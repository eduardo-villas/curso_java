package abstractfactorypattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUARDO
 */
public interface FaturamentoFactory {
    public Cliente factoryCliente();
    public Nota factoryNota();
}
