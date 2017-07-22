/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author EDUARDO
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    private Integer codigo;
    private String nome;
    private String sobreNome;
    private String CPF;
    private Date dataDeNascimento;
    private String endereco;
    private String bairro;
    private String CEP;
    private String UF;
    private Double renda;

    public Cliente() {
        codigo = 10;
        nome = "Teste de nome";
        sobreNome = "Teste de sobrenome";
        CPF = "034978855-22";
        dataDeNascimento = Calendar.getInstance(Locale.ENGLISH).getTime();
        endereco = "Endereco";
        bairro = "bairro";
        CEP = "89044172";
        UF = "PR";
        renda = 4590.35D;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }


    
}
