/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandpattern2.pkg0;

/**
 *
 * @author EDUARDO
 */
public class ApagaLampadaCommand implements Command {

    final private Lampada lampada;
    public ApagaLampadaCommand(Lampada lampada) {
        this.lampada = lampada;
    }
    
    @Override
    public void execute() {
        lampada.apaga();
    }

    @Override
    public void undo() {
        lampada.acende();
    }

    @Override
    public void redo() {
        lampada.apaga();
    }
    
}
