/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}};

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] diasAsis = new int[5];
        int suma;
        String reporte = "Listado de la asistencia de los estudiantes\n";
        String mensajeAsis = "";

        for (int i = 0; i < asistencia.length; i++) {
            suma = 0;
            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j] == true) {
                    suma = suma + 1;
                }
            }
            diasAsis[i] = suma;
            reporte = String.format("%sEstudiante %s un total de %d dias\n", 
                    reporte, estudiantes[i], diasAsis[i]);
        }
        
        for (int e = 0; e < asistencia.length; e++){
            if(diasAsis[e] == 5){
                mensajeAsis = String.format("%s%s tiene asistencia completa\n", 
                        mensajeAsis, estudiantes[e]);
                
            
            }   
        }

        reporte = String.format("%s\nEstudiantes con asistencia completa\n"
                + "%s", reporte, mensajeAsis);
        
        System.out.printf(reporte);
        
    }

}


