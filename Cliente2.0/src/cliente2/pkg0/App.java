/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente2.pkg0;

/**
 *
 * @author EDUARDO
 */
public class App {

    public static void main(String[] args) {
        EditorCliente editorCliente = new EditorCliente(new ClienteModel());
        editorCliente.editarCliente();
    }

}
