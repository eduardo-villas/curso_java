/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploequals;

import java.util.Objects;

/**
 *
 * @author eduardov
 */
public class Carro {

    private String marca;
    private String modelo;
    private Motor motor;
    private int anoFabricacao;
     //construtor sem argumentos
    //o compilador já oferece um construtor sem argumentos.
    //tente deletar o construtor e compilar sem ele.
    public Carro(String m, Motor motor) {
        this.marca = m;
        this.motor = motor;
        this.motor.cilindrada = 2.0f;
        this.motor.valvulas = 20;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Motor getMotor() {
       return this.motor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.anoFabricacao != other.anoFabricacao) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.motor, other.motor)) {
            return false;
        }
        return true;
    }
    
    

}
