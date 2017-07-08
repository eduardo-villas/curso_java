/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeseobjetos1;

import nossosbojetos.Carro;
import static java.lang.System.out;
/**
 *
 * @author eduardov
 */
public class ClassesEObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variável local ao metodo main
        Carro miniCooper = new Carro();
        
        miniCooper.setMotor("MOTO BMW V6");
        miniCooper.setMarca("BMW");
        miniCooper.setModelo("Mini Cooper");
        miniCooper.setAnoFabricacao(2016);
        
        Carro gol = new Carro();
        
        gol.setMotor("VOLKSWAGEN 1.6");
        gol.setMarca("VOLKSWAGEN");
        gol.setModelo("Gol");
        gol.setAnoFabricacao(2015);
        
        //temos dois objetos que representam um carro
        //um carro tem muito mais atributos, porém é um exemplo.
        //este metodo mostra os atributos do carro.
        //o conjunto de atributos de um carro em um dado momento é
        //chamado estado do objeto.
        mostraEstado(miniCooper);
        mostraEstado(gol);
        
    }

    private static void mostraEstado(Carro carro) {
        
        String modelo = carro.getModelo();
        String marca = carro.getMarca();
        String motor = carro.getMotor();
        int anoFabricadao = carro.getAnoFabricacao();
        
        out.printf("Modelo: %s \n"
                + "Marca: %s\n"
                + "Motor: %s\n"
                + "Ano de fabricação:%d\n",
                modelo, marca, motor, anoFabricadao);
        out.println();        
    }
    
}
