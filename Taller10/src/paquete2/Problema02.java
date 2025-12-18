/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}};
        int[] mayores = new int[3];
        int menores = 0;
        String mensaje = "Listado de edades de las familias\n";
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] < 18) {
                    menores = menores + 1;
                }else{
                    mayores[i] = mayores[i] + 1;              
                }

            }
        }
        
        mensaje = String.format("%sMenores de edad totales de la familia: %d\n", 
                mensaje, menores);

        for (int e = 0; e < mayores.length; e++) {
           mensaje = String.format("%sMayores de edad en la familia %d: %d\n", 
                mensaje, e+1, mayores[e]);

                }
                System.out.printf("%s\n", mensaje);
            }
}
