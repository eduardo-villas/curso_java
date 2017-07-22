/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente2.pkg0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author EDUARDO
 */
public class ClienteModel {

    final private Cliente cliente;
    final private List<Observador> observadores;
    private ClienteDAO clienteDAO;

    public ClienteModel() {
        this.cliente = new Cliente();
        observadores = new ArrayList<>();
    }

    public Integer getCodigo() {
        return cliente.getCodigo();
    }

    public void setCodigo(Integer codigo) {
        cliente.setCodigo(codigo);
    }

    public String getNome() {
        return cliente.getNome();
    }

    public void setNome(String nome) {
        cliente.setNome(nome);
    }

    public String getSobreNome() {
        return cliente.getSobreNome();
    }

    public void setSobreNome(String sobreNome) {
        cliente.setSobreNome(sobreNome);
    }

    public String getCPF() {
        return cliente.getCPF();
    }

    public void setCPF(String CPF) {
        cliente.setCPF(CPF);
    }

    public Date getDataDeNascimento() {
        return cliente.getDataDeNascimento();
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        cliente.setDataDeNascimento(dataDeNascimento);
    }

    public String getEndereco() {
        return cliente.getEndereco();
    }

    public void setEndereco(String endereco) {
        cliente.setEndereco(endereco);
    }

    public String getBairro() {
        return cliente.getBairro();
    }

    public void setBairro(String bairro) {
        cliente.setBairro(bairro);
    }

    public String getCEP() {
        return cliente.getCEP();
    }

    public void setCEP(String CEP) {
        cliente.setCEP(CEP);
    }

    public String getUF() {
        return cliente.getUF();
    }

    public void setUF(String UF) {
        cliente.setUF(UF);
    }

    public Double getRenda() {
        return cliente.getRenda();
    }

    public void setRenda(Double renda) {
        cliente.setRenda(renda);
    }

    void grava() {
        clienteDAO.grava(cliente);
        updateObservers();
    }

    void registerObservador(Observador observador) {
        observadores.add(observador);
    }

    void setDAO(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    private void updateObservers() {
        for (Observador observador : observadores) {
            observador.update("Cliente: " + cliente.getCodigo() + " Nome: " + cliente.getNome());
        }
    }

}
