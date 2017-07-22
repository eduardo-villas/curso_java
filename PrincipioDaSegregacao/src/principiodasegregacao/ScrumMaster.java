/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principiodasegregacao;

/**
 *
 * @author EDUARDO
 */
public class ScrumMaster implements MembroDeTimeScrum {

    @Override
    public void priorizarBacklog() {}

    @Override
    public void blindarTime() {
        System.out.println("Os desenvolvedores estão trabalhando, não perturbe...");
    }

    @Override
    public void implementarFuncionalidades() {}
    
}
