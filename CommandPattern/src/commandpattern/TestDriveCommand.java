/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDUARDO
 */
public class TestDriveCommand {

    void run() {
        List<Command> comandos = new ArrayList<>();
        comandos.add(new AcendeLampadaCommand(new Lampada()));
        comandos.add(new ApagaLampadaCommand(new Lampada()));
        comandos.add(new LigaTelevisaoCommand(new Televisao()));
        comandos.add(new DesligaTelevisaoCommand(new Televisao()));
        
        executaTodosOsComandos(comandos);
    }

    private void executaTodosOsComandos(List<Command> comandos) {
        for (Command command : comandos) {
            command.execute();
        }
    }
    
}
