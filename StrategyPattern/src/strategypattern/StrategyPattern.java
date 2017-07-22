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
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaReceber contaReceber = new ContaReceber(new JurosComMulta());
        contaReceber.setValorDaConta(30d);
        System.out.println("Juros com multa: "+contaReceber.calculaJuros());
        contaReceber.setStrategyJuros(new JurosSimples());
        System.out.println("Juros simples: "+contaReceber.calculaJuros());
    }
    
}
