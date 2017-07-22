/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sg.produto.model;

import br.com.sg.produto.controller.ProdutoDAO;
import java.util.ArrayList;

/**
 *
 * @author EDUARDO
 */
public class ProdutoModel {

    Produto produto;
    AbstractProdutoDAO produtoDAO;

    public ProdutoModel() {
        produto = new Produto();
    }

    public int getCodigo() {
        return produto.getCodigo();
    }

    public void setCodigo(int codigo) {
        produto.setCodigo(codigo);
    }

    public String getDescricao() {
        return produto.getDescricao();
    }

    public void setDescricao(String descricao) {
        produto.setDescricao(descricao);
    }

    public void gravar() {
        if (produtoDAO.grava(produto)) {
            avisaObservadores(EventoOcorrido.PRODUTO_GRAVADO_COM_SUCESSO);
        } else {
            avisaObservadores(EventoOcorrido.PRODUTO_ERRO_AO_GRAVAR);
        }
    }

    private void avisaObservadores(EventoOcorrido eventoOcorrido) {
        for (ObservadorProdutoModel observadorProdutoModel : observadores) {
            observadorProdutoModel.ocorreuUmEvento(eventoOcorrido);
        }
    }

    public void setDao(AbstractProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public enum EventoOcorrido {

        PRODUTO_GRAVADO_COM_SUCESSO,
        PRODUTO_ERRO_AO_GRAVAR
    }

    public interface ObservadorProdutoModel {

        public void ocorreuUmEvento(EventoOcorrido eventoOcorrido);
    }

    ArrayList<ObservadorProdutoModel> observadores = new ArrayList<>();

    public void registraObservador(ObservadorProdutoModel observadorProdutoModel) {
        observadores.add(observadorProdutoModel);
    }
}
