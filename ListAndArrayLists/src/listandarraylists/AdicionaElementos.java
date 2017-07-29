/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listandarraylists;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author eduardov
 */
class AdicionaElementos {

    AdicionaElementos(int interacoes, List<Integer> list) {
        long milisegundosInicial = new Date().getTime();
        
        for (int i = 0;i < interacoes; ++i) {
            list.add(i);
        }

        long milisegundosFinal = new Date().getTime();
        System.out.printf("Tempo == % d\n\n", milisegundosFinal - milisegundosInicial);
    }
        
}
