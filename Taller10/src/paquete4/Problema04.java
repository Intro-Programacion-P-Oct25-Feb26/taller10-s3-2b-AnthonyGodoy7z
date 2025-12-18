/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] a = new int[3][2];
        int[][] b = new int[3][2];

        System.out.println("Ingrese valores de la matriz A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("ingrese valor de (%d)(%d): ", i, j);
                a[i][j] = entrada.nextInt();
            }
        }
    }
}
