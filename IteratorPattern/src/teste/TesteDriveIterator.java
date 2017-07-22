package teste;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUARDO
 */
public class TesteDriveIterator {
    
    public static void main(String args[]) {
        TesteDriveIterator test;
        test = new TesteDriveIterator();
        test.runTest();
    }
    
    public void runTest() {
        ClientePrinter clientePrinter = new ClientePrinter();
        
        Cliente clientesArray[] = new Cliente[5];
        fillClientes(clientesArray);
        clientePrinter.printer(new IteratorArray(clientesArray));
        
        List<Cliente> clientesList = new ArrayList<>(5);
        fillClientes(clientesList);
        clientePrinter.printer(new IteratorList(clientesList));
        
    }

    private void fillClientes(Cliente[] clientesArray) {
        for (int i = 0; i < clientesArray.length; ++i) {
            clientesArray[i] = new Cliente();
        }
    }

    private void fillClientes(List<Cliente> clientesList) {
        for (int i = 0; i < 5; ++i) {
            clientesList.add(i, new Cliente());
        }
    }
}
