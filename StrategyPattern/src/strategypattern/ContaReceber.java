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
public class ContaReceber {

    private StrategyJuros strategyJuros;
    private Double valorDaConta;
    public ContaReceber(StrategyJuros strategyJuros) {
        this.strategyJuros = strategyJuros;
        valorDaConta = 0d;
    }
    
    public Double calculaJuros() {
        return strategyJuros.calculaJuros(valorDaConta);
    }

    public void setStrategyJuros(StrategyJuros strategyJuros) {
        this.strategyJuros = strategyJuros;
    }

    public Double getValorDaConta() {
        return valorDaConta;
    }

    public void setValorDaConta(Double valorDaConta) {
        this.valorDaConta = valorDaConta;
    }
    
    
}
