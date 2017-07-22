/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethodpattern;

/**
 *
 * @author EDUARDO
 */
public class TestDriveTemplateMethod {

    void run() {
        
        TemplateMethodRelatorio relatorioImpressora = new RelatorioParaImpressora();
        TemplateMethodRelatorio relatorioVideo = new RelatorioParaVideo();
        
        relatorioImpressora.printRelatorio();
        relatorioVideo.printRelatorio();
        
    }
    
}
