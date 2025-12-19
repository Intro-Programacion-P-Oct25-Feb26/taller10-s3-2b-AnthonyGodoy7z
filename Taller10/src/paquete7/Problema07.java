/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author tonyx
 */
public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizX = new double[3][3];
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        boolean compara = true;

        System.out.println("Ingrese valores a la matriz de 3 filas y 3 columnas");
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                System.out.printf("Ingrese valor de [%d][%d]:", i, j);
                matrizX[i][j] = entrada.nextDouble();
            }
        }
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                double x = matrizX[i][j];
                matrizA[i][j] = (x + 1) * (x + 1);
                matrizB[i][j] = x * x + 2 * x + 1;
            }
        }
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    compara = false;
                }
            }
        }
        System.out.println("Matriz X");
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                System.out.printf("%.2f\t", matrizX[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("%.2f\t", matrizA[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Matriz B");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("%.2f\t", matrizB[i][j]);
            }
            System.out.println("");
        }
        if (compara) {
            System.out.println("La identidad algebraica se cumple");
        } else {
            System.out.println("La identidad algebraica NO se cumple");
        }
    }
}
