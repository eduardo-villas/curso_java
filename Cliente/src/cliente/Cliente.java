/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */

    public Cliente() {
    }

    public void editarCliente() {
        Integer codigo;
        String nome;
        String sobreNome;
        String CPF;
        Date dataDeNascimento;
        String endereco;
        String bairro;
        String CEP;
        String UF;
        Double renda; 
        Scanner input;
        PrintStream out;
        
        input = new Scanner(System.in);
        out = System.out;
        
        out.print("Digite o codigo do cliente: ");
        codigo = input.nextInt();
        
        out.print("Digite o nome do cliente: ");
        input.nextLine();//limpa o buffer 
        
        nome = input.nextLine();
        out.print("Digine o sobrenome:");
        sobreNome = input.nextLine();
        
        out.print("Digite o CPF:");
        CPF = input.nextLine();
        
        out.print("Digite a Data de nascimento:");
        dataDeNascimento = pegaData(input);
        
        out.print("Digite o endereco:");
        endereco = input.nextLine();
        
        out.print("Digite o bairro:");
        bairro = input.nextLine();
        
        out.print("Digite o CEP:");
        CEP = input.nextLine();
        
        out.print("Digite o UF:");
        UF = input.nextLine();
        
        out.print("Digite a renda:");
        renda = input.nextDouble();
        
        gravaDados(out,
                codigo,
                nome,
                sobreNome,
                CPF,
                dataDeNascimento,
                endereco,
                bairro,
                CEP,
                UF,
                renda);
        
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

    private void gravaDados(PrintStream out, 
            Integer codigo, 
            String nome, 
            String sobreNome, 
            String CPF, 
            Date dataDeNascimento, 
            String endereco, 
            String bairro, 
            String CEP, 
            String UF, 
            Double renda) {
        
        out.println("\nDados Gravados.\n"
                + "Codigo: "+codigo+"\n"
                + "Nome: "+nome+"\n"
                + "Sobrenome: "+sobreNome+"\n"
                + "CFP: "+CPF+"\n"
                + "Data: "+dataDeNascimento+"\n"
                + "Endereco: "+endereco+"\n"
                + "Bairro: "+bairro+"\n"
                + "CEP: "+CEP+"\n"
                + "UF: "+UF+"\n"
                + "Renda: "+renda+"\n");
    }

}
