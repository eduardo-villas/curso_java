/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import br.com.sg.produto.controller.ProdutoController;
import br.com.sg.produto.model.ProdutoModel;
import br.com.sg.produto.view.ProdutoView;

/**
 *
 * @author EDUARDO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController(new ProdutoModel(), new ProdutoView());
        produtoController.inicia();
    }
    
}
