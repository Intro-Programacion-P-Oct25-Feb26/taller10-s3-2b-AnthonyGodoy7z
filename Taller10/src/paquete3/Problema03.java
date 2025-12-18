/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}};
        int[] fallo = new int[4];
        int suma;
        String msgFallo = "";
        String msgFunc = "";
        for (int i = 0; i < sensores.length; i++) {
            suma = 0;
            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j] == false) {
                    suma = suma + 1;
                }
            }
            fallo[i] = suma;
        }
        for (int e = 0; e < fallo.length; e++) {
            if (fallo[e] > 0) {
                msgFallo = String.format("%sZONA %d: se encuentra con %d "
                        + "falla(s)\n",msgFallo, e + 1, fallo[e]);
            }else{
                msgFunc = String.format("%sZONAS en las que no hay fallas: %d", 
                        msgFunc, e + 1, fallo[e]);
            }
        }
        System.out.printf("Listado de sensores de seguridad\n\n"
                + "%s\n\n"
                + "ZONAS CON FALLOS\n\n%s\n", msgFunc, msgFallo);
    }

}
