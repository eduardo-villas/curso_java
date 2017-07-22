/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente2.pkg0;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class EditorCliente implements Observador {

    final private ClienteModel clienteModel;

    EditorCliente(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
        clienteModel.registerObservador(this);
        clienteModel.setDAO(new ClienteDAO());
    }

    public void editarCliente() {
        Scanner input;
        PrintStream out;

        input = new Scanner(System.in);
        out = System.out;

        out.print("Digite o codigo do cliente: ");
        clienteModel.setCodigo(input.nextInt());

        out.print("Digite o nome do cliente: ");
        input.nextLine();//limpa o buffer 

        clienteModel.setNome(input.nextLine());

        out.print("Digine o sobrenome:");
        clienteModel.setSobreNome(input.nextLine());

        out.print("Digite o CPF:");
        clienteModel.setCPF(input.nextLine());

        out.print("Digite a Data de nascimento:");
        clienteModel.setDataDeNascimento(pegaData(input));

        out.print("Digite o endereco:");
        clienteModel.setEndereco(input.nextLine());

        out.print("Digite o bairro:");
        clienteModel.setBairro(input.nextLine());

        out.print("Digite o CEP:");
        clienteModel.setCEP(input.nextLine());

        out.print("Digite o UF:");
        clienteModel.setUF(input.nextLine());

        out.print("Digite a renda:");
        clienteModel.setRenda(input.nextDouble());

        clienteModel.grava();

    }

    private Date pegaData(Scanner input) {
        String stringData = input.nextLine();
        Date data;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            data = df.parse(stringData);
        } catch (ParseException e) {
            data = new Date();
        }

        return data;
    }

    @Override
    public void update(String msg) {
        System.out.println(msg);
    }

}
