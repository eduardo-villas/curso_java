/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author EDUARDO
 */
public interface Adapter {

    public void elementoNaPosicao(int posicaoX, int posicaoY);
    public String pegaElemento(int posicaoX, int posicaoY);
    public Integer quantidadeDeLinhas();
    public Integer quantidadeDeColunas(int linha);

}
