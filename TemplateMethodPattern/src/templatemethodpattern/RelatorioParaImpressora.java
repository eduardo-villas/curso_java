/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethodpattern;

import java.io.PrintStream;

/**
 *
 * @author EDUARDO
 */
public class RelatorioParaImpressora extends TemplateMethodRelatorio {

    private PrintStream out;
    @Override
    protected boolean inicializaAmbienteDeImpressao() {
        out = System.out;
        out.println("Inicializando ambiente para relatorio de Impressora");
        return true;
    }

    @Override
    protected boolean inicializaImpressora() {
        out.println("Inicializando impressora ");
        return true;
    }

    @Override
    protected void imprimeRelatorio() {
        out.println("Imprimindo relatório em Impressora");
    }

    @Override
    protected void finalizaRelatorio() {
        out.println("Finalizando relatório de Impressora");
    }

    @Override
    protected void finalizaImpressora() {
        out.println("Finalizando impressora");
    }
    
}
