/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String[][] letra = new String[4][2];
        String mensaje = "Listado de estudiantes las cuales sus iniciales son"
                + "S,P,T\n"
                + "---------------------------------------\n";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                letra[i][j] = estudiantes[i][j].substring(0, 1);
            }
        }

        for (int i = 0; i < letra.length; i++) {
            for (int j = 0; j < letra[i].length; j++) {
                if (letra[i][j].equals("S")) {
                    mensaje = String.format("%s%s\n", mensaje, estudiantes[i][j]);
                } else {
                    if (letra[i][j].equals("P")) {
                        mensaje = String.format("%s%s\n", mensaje,
                                estudiantes[i][j]);
                    } else {
                        if (letra[i][j].equals("T")) {
                            mensaje = String.format("%s%s\n", mensaje,
                                    estudiantes[i][j]);
                        }
                    }
                }
            }
        }

        System.out.printf(mensaje);
    }

}
