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
public class ArrayAdapter implements Adapter {

    Integer matriz[][];
    public ArrayAdapter(Integer matriz[][]) {
        this.matriz = matriz;
    }

    @Override
    public void elementoNaPosicao(int posicaoX, int posicaoY) {
        System.out.println("valor do elemente na posicao ["+posicaoX + "]["+posicaoY + "] é "+matriz[posicaoX][posicaoY]);
    }
    
    @Override
    public String pegaElemento(int posicaoX, int posicaoY) {
        return "--"+matriz[posicaoX][posicaoY]+"--";
    }
    
    @Override
    public Integer quantidadeDeLinhas() {
        return matriz.length;
    }
    
    @Override
    public Integer quantidadeDeColunas(int linha) {
        return matriz[linha].length;
    }
    
}
