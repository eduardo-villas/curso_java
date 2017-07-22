/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
class ConsoleVisualizador {

    final private Adapter adapter;
    ConsoleVisualizador(Adapter adapter) {
        this.adapter = adapter;
    }

    void run() {
        Scanner inputUser = new Scanner(System.in);
        while (true) {
            desenhaMatriz(adapter);
            System.out.println("Digite a linha da matriz: ");
            int posicaoX = inputUser.nextInt();
            System.out.println("Digite a coluna da matriz: ");
            int posicaoY = inputUser.nextInt();
            if (posicaoX == -1 || posicaoY == -1)
                break;
            if (posicaoX > adapter.quantidadeDeLinhas() - 1 || posicaoY > adapter.quantidadeDeColunas(posicaoX) - 1) {
                System.out.println("Posicao inexistente dentro da estrutura");
                continue;
            }
            adapter.elementoNaPosicao(posicaoX, posicaoY);
        }

    }

    private void desenhaMatriz(Adapter adapter) {
        System.out.println("Browse digite -1 para a linha ou para a coluna para sair do browses");
        int quantidadeDeLinhas = adapter.quantidadeDeLinhas();
        for (int i = 0 ; i < quantidadeDeLinhas; ++i) {
            int quantidadeDeColunas = adapter.quantidadeDeColunas(i);
            for (int j = 0; j < quantidadeDeColunas; ++j) {
                System.out.print(adapter.pegaElemento(i, j)+" ");
            }
            System.out.println();
        }
    }

}
