/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeseobjetos1;

import nossosbojetos.Carro;
import static java.lang.System.out;
import nossosbojetos.Motor;
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
        Carro miniCooper = new Carro("BMW", new Motor());
        
        miniCooper.setModelo("Mini Cooper");
        miniCooper.setAnoFabricacao(2016);
        
        Carro gol = new Carro("VOLKSWAGEN", new Motor());
        
        gol.setModelo("Gol");
        gol.setAnoFabricacao(2015);
        
        //temos dois objetos que representam um carro
        //um carro tem muito mais atributos, porém é um exemplo.
        //este metodo mostra os atributos do carro.
        //o conjunto de atributos de um carro em um dado momento é
        //chamado estado do objeto.
        mostraEstadoEAltera(gol);
        mostraEstadoEAltera(miniCooper);
        
        
    }

    private static void mostraEstadoEAltera(Carro carro) {
        mostraEstado(carro);
        alteraAnoFabricacao(carro);
        mostraEstado(carro);
    }

    private static void alteraAnoFabricacao(Carro carro) {
        carro.setAnoFabricacao(1500);
    }
    
    private static void mostraEstado(Carro carro) {
        
        String modelo = carro.getModelo();
        String marca = carro.getMarca();
        Motor motor = carro.getMotor();
        int anoFabricadao = carro.getAnoFabricacao();
        
        out.printf("Modelo: %s \n"
                + "Marca: %s\n"
                + "Motor: %s\n"
                + "Ano de fabricação:%d\n",
                modelo, marca, motor.toString(), anoFabricadao);
        out.println();        
    }

    
    
    
}
