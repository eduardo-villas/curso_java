/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listandarraylists;
        
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author eduardov
 */
public class ListAndArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int interacoes = 100000;
        
        AdicionaElementos a = new AdicionaElementos(interacoes, new ArrayList<>());
        List<Integer> l = new LinkedList<>();
        AdicionaElementos b = new AdicionaElementos(interacoes, l);
        
    }
    
}
