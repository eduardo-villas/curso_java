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
public class Faturamento {

    void fatura(FaturamentoFactory faturamentoFactory) {
        Cliente cliente = faturamentoFactory.factoryCliente();
        Nota nota = faturamentoFactory.factoryNota();
        
        System.out.println(nota.faturaNota(cliente));
    }
    
}
