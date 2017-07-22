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
public class PrincipioDaSegregacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        (new PrincipioDaSegregacao()).initialize();
    }

    private void initialize() {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        ProductOwner productOwner = new ProductOwner();
        ScrumMaster scrumMaster = new ScrumMaster();
        
        desenvolvedor.implementarFuncionalidades();
        productOwner.priorizarBacklog();
        scrumMaster.blindarTime();
        
    }
    
}
