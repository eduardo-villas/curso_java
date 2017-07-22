/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern2.pkg0;

import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class TestDriveCommand {

    void run() {
        System.out.println("Test drive undo e redo utilizando command.");
        System.out.println("1 para ligar a lampada");
        System.out.println("2 para desligar a lampada");
        System.out.println("3 para ligar a televisao");
        System.out.println("4 para desligar a televisao");
        System.out.println("5 para desfazer");
        System.out.println("6 para refazer");
        System.out.println("7 para sair");
        GerenciadorDeComandos gerenciadorDeComandos = new GerenciadorDeComandos();
        Scanner userInput = new Scanner(System.in);
        while (true) {
            int option = userInput.nextInt();
            if (option == 7) {
                break;
            }
            if (option == 6) {
                gerenciadorDeComandos.redo();
            } else if (option == 5) {
                gerenciadorDeComandos.undo();
            } else if (option > 0 && option < 5) {
                Command command = criaCommando(option);
                gerenciadorDeComandos.executeCommand(command);
            } else {
                System.out.println("Test drive undo e redo utilizando command.");
                System.out.println("1 para ligar a lampada");
                System.out.println("2 para desligar a lampada");
                System.out.println("3 para ligar a televisao");
                System.out.println("4 para desligar a televisao");
                System.out.println("5 para desfazer");
                System.out.println("6 para refazer");
                System.out.println("7 para sair");

            }

        }
    }

    private Command criaCommando(int option) {
        if (option == 1)
            return new AcendeLampadaCommand(new Lampada());
        else if (option == 2)
            return new ApagaLampadaCommand(new Lampada());
        else if (option == 3)
            return new LigaTelevisaoCommand(new Televisao());
        else if (option == 4)
            return new DesligaTelevisaoCommand(new Televisao());
        return null;
    }

}
