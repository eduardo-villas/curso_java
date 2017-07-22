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
public class ProductOwner implements MembroDeTimeScrum {

    @Override
    public void priorizarBacklog() {
        System.out.println("Priorizando backlog com base nas necessidades do cliente...");
    }

    @Override
    public void blindarTime() {}

    @Override
    public void implementarFuncionalidades() {}
    
}
