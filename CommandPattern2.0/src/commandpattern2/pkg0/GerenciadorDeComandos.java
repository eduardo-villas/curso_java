/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern2.pkg0;

import java.util.Stack;

/**
 *
 * @author EDUARDO
 */
public class GerenciadorDeComandos {

    final private Stack<Command> undo;
    final private Stack<Command> redo;

    public GerenciadorDeComandos() {
        undo = new Stack<>();
        redo = new Stack<>();
    }

    public void executeCommand(Command c) {
        c.execute();
        undo.push(c);
        redo.clear(); 
    }
    
    public void undo() {
        if (undo.isEmpty()) {
            System.out.println("Impossivel desfazer");
            return;
        }
        Command c = undo.pop();
        c.undo();
        redo.push(c);
    }
    
    public void redo() {
        if (redo.isEmpty()) {
            System.out.println("Impossível refazer");
            return;
        }
        Command c = redo.pop();
        c.redo();
        undo.push(c);
    }

}
