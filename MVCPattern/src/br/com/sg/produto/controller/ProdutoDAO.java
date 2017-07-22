/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sg.produto.controller;

import br.com.sg.produto.model.AbstractProdutoDAO;
import br.com.sg.produto.model.Produto;
import java.util.Random;

/**
 *
 * @author EDUARDO
 */
public class ProdutoDAO implements AbstractProdutoDAO {

    @Override
    public boolean grava(Produto produto) {
        System.out.println("Gravando produto " + produto.getDescricao());
        Random randomGenerator = new Random();
        int randoNumber = randomGenerator.nextInt() % 2;
        return randoNumber == 1;
    }

}
