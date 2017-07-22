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
class ResultadoSqlAdapter implements Adapter {

    private ResultadoSql resultado;
    public ResultadoSqlAdapter(ResultadoSql resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public void elementoNaPosicao(int posicaoX, int posicaoY) {
        System.out.println("valor do elemente na posicao ["+posicaoX + "]["+posicaoY + "] é "+pegaValor(posicaoX, posicaoY));
    }

    @Override
    public String pegaElemento(int posicaoX, int posicaoY) {
        Cliente cliente = resultado.pegaCliente(posicaoX);
        String elemento = "";
        if (posicaoY == 0)
            elemento += cliente.getCodigo();
        else 
            elemento += cliente.getDescricao();
        return "--"+elemento+"--";
    }

    @Override
    public Integer quantidadeDeLinhas() {
        return resultado.len();
    }

    @Override
    public Integer quantidadeDeColunas(int linha) {
        return 2;
    }

    private String pegaValor(int posicaoX, int posicaoY) {
        Cliente cliente = resultado.pegaCliente(posicaoX);
        if (posicaoY == 0)
            return ""+cliente.getCodigo();

        return cliente.getDescricao();
    }
    
}
