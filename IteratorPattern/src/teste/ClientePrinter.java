/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author EDUARDO
 */
public class ClientePrinter {

    public void printer(Iterator iterador) {

        while (iterador.hasNext()) { //aqui tem polimorifsmo
            printCliente((Cliente) iterador.getCurrentObject()); //aqui tem polimorifsmo
            iterador.next(); //aqui tem polimorifsmo
        }
        
    }

    private void printCliente(Cliente cliente) {
        System.out.println("\nDados Gravados.\n"
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
    }

}
