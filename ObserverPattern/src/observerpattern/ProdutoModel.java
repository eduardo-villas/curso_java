package observerpattern;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUARDO
 */
public class ProdutoModel implements ProdutoObservable {
    
    
    final private List<ProdutoObserver> observadores;
    final private Produto produto;

    public ProdutoModel(Produto produto) {
        observadores = new ArrayList<>();
        this.produto = produto;
    }
        
    public void grava() {
        updateObservers();
    }    

    private void updateObservers() {
        for (ProdutoObserver produtoObserver : observadores) {
            produtoObserver.update("Produto Codigo: "+ produto.getCodigo() +", descrição: "+ produto.getDescricao() +" foi gravado com sucesso.");
        }
    }

    @Override
    public void register(ProdutoObserver observer) {
        observadores.add(observer);
    }
}
