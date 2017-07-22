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
public interface ProdutoObservable {
    public void register(ProdutoObserver observer);
}
