/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author EDUARDO
 */
public class DesligaTelevisaoCommand implements Command {

    final private Televisao televisao;

    public DesligaTelevisaoCommand(Televisao televisao) {
        this.televisao = televisao;
    }

    @Override
    public void execute() {
        televisao.desliga();
    }

}
