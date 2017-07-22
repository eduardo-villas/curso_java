/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sg.produto.controller;

import br.com.sg.produto.model.ProdutoModel;
import br.com.sg.produto.view.ProdutoView;

/**
 *
 * @author EDUARDO
 */
public class ProdutoController {

    final private ProdutoView produtoView;
    final private ProdutoModel produtoModel;
    public ProdutoController(ProdutoModel produtoModel,ProdutoView produtoView) {
        this.produtoModel = produtoModel;
        produtoModel.setDao(new ProdutoDAO());
        this.produtoView = produtoView;
        configureView();
    }

    public void inicia() {
        produtoView.setVisible(true);
    }

    private void configureView() {
        produtoView.setController(this);
        produtoView.setModel(produtoModel);
    }

    public void grava() {
        produtoModel.gravar();
    }
    
}
