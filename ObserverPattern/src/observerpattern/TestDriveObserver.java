/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observerpattern;

/**
 *
 * @author EDUARDO
 */
public class TestDriveObserver implements ProdutoObserver {

    void run() {
        Produto produto = new Produto();
        produto.setCodigo(10);
        produto.setDescricao("teste");
        
        ProdutoModel produtoModel = new ProdutoModel(produto);
        produtoModel.register(this);
        produtoModel.grava();
    }

    @Override
    public void update(String string) {
        System.out.println(string);
    }
    
}
