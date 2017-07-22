/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategypattern;

/**
 *
 * @author EDUARDO
 */
public class JurosComMulta implements StrategyJuros {

    @Override
    public Double calculaJuros(Double valorDaConta) {
        if (valorDaConta == 0)
            return 0d;
        return ( valorDaConta * 0.10) + 2.00d;
    }
    
}
