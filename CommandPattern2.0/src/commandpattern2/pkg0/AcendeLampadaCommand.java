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
public class AcendeLampadaCommand implements Command {

    final private Lampada lampada;
    public AcendeLampadaCommand(Lampada lampada) {
        this.lampada = lampada;
    }
    
    @Override
    public void execute() {
        lampada.acende();
    }

    @Override
    public void undo() {
        lampada.apaga();
    }

    @Override
    public void redo() {
        lampada.acende();
    }
    
}
