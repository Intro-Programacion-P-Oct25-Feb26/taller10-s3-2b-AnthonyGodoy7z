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
        boolean mayorIgual = true;
        boolean mayor = false;

        System.out.println("Ingrese valores de la matriz A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("ingrese valor de (%d)(%d): ", i, j);
                a[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Ingrese valores de la matriz B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("ingrese valor de (%d)(%d): ", i, j);
                b[i][j] = entrada.nextInt();

            }
        }

        System.out.println("\nMatriz A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\nMatriz B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%d\t", b[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < b[i][j]) {
                    mayorIgual = false;
                }
                if (a[i][j] > b[i][j]) {
                    mayor = true;
                }
            }
        }
        if (mayorIgual && mayor) {
            System.out.println("\nLa matriz A es mayor que la matriz B");
        } else {
            System.out.println("\nLa matriz A no es mayor que la matriz B");
        }
    }
}
