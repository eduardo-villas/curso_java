/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente2.pkg0;

import java.io.PrintStream;
import java.util.Date;

/**
 *
 * @author EDUARDO
 */
public class ClienteDAO {

    PrintStream out;

    public ClienteDAO() {
        out = System.out;
    }

    public Boolean grava(Cliente cliente) {
        out.println("\nDados Gravados.\n"
                + "Codigo: " + cliente.getCodigo() + "\n"
                + "Nome: " + cliente.getNome() + "\n"
                + "Sobrenome: " + cliente.getSobreNome() + "\n"
                + "CFP: " + cliente.getCPF() + "\n"
                + "Data: " + cliente.getDataDeNascimento() + "\n"
                + "Endereco: " + cliente.getEndereco() + "\n"
                + "Bairro: " + cliente.getBairro() + "\n"
                + "CEP: " + cliente.getCEP() + "\n"
                + "UF: " + cliente.getUF() + "\n"
                + "Renda: " + cliente.getRenda() + "\n");

        return true;
    }


    

}
