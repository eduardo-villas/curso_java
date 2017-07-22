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
class ResultadoSql {

    Cliente cliente[];

    public ResultadoSql() {
        String nomes[] = new String[] {"Alberto", "Ronaldo", "Leandro", "Arnaldo", "João"};
        cliente = new Cliente[5];
        for (int i = 0; i < 5; ++i) {
            cliente[i] = new Cliente(i+1, nomes[i]);
        }
    }

    Cliente pegaCliente(int posicaoX) {
        return cliente[posicaoX];
    }

    public Integer len() {
        return cliente.length;
    }

}
