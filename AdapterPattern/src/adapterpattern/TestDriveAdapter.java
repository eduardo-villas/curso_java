/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adapterpattern;

/**
 *
 * @author EDUARDO
 */
public class TestDriveAdapter {
    
    public void run() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(new Integer[][]{
                                                                     {1,2},
                                                                     {4,5},
                                                                     {1,5,6,8,9}
                                                                    });
        ConsoleVisualizador consoleVisualizadorArray = new ConsoleVisualizador(arrayAdapter);
        consoleVisualizadorArray.run();
        
        ResultadoSqlAdapter resultadoSqlAdapter = new ResultadoSqlAdapter(new ResultadoSql());
        ConsoleVisualizador consoleVisualizadorResultadoSql = new ConsoleVisualizador(resultadoSqlAdapter);
        consoleVisualizadorResultadoSql.run();
        
    }
    
}
