/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matriz = new double[5][6];
        double[][] resultado = new double[5][6];
        double num;

        System.out.println("Ingrese un número entero o real");
        num = entrada.nextDouble();

        System.out.println("Ingrese valores a la matriz de 5 filas y 6 columnas");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Ingrese valor de [%d][%d]:", i, j);
                matriz[i][j] = entrada.nextDouble();
                resultado[i][j] = matriz[i][j] * num;
            }
        }
        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Matriz multiplicada por (" + num+")");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.printf("%.2f\t", resultado[i][j]);
            }
            System.out.println("");
        }
    }
}
