package eedd;

import java.util.Scanner;

public class tareaSecuencial {

    public static void main(String[] args) {
        // Escaner para leer
        Scanner leer = new Scanner(System.in);

        int filas1, columnas1, filas2, columnas2;

        // Crear el primer array
        System.out.println("Ingrese filas del primer array");
        filas1 = leer.nextInt();

        System.out.println("Ingrese columnas del primer array");
        columnas1 = leer.nextInt();

        int[][] a1 = new int[filas1][columnas1];

        // Crear el segundo array
        System.out.println("Ingrese filas del segundo array");
        filas2 = leer.nextInt();

        System.out.println("Ingrese columnas del segundo array");
        columnas2 = leer.nextInt();

        int[][] a2 = new int[filas2][columnas2];

        // Llenar el primer array
        System.out.println("Ingrese los números del primer array:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                a1[i][j] = leer.nextInt();
            }
        }

        // Llenar el segundo array
        System.out.println("Ingrese los números del segundo array:");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                a2[i][j] = leer.nextInt();
            }
        }

        // Comparar arrays
        if (puedenCompararse(filas1, columnas1, filas2, columnas2)) {
            if (sonIguales(a1, a2, filas1, columnas1)) {
                System.out.println("Las matrices son iguales");
            } else {
                System.out.println("Las matrices no son iguales");
            }
        } else {
            System.out.println("Las matrices no pueden ser comparadas");
        }
    }

    // Método para comprobar si las matrices pueden ser comparadas
    private static boolean puedenCompararse(int filas1, int columnas1, int filas2, int columnas2) {
        return filas1 == filas2 && columnas1 == columnas2;
    }

    // Método para comprobar si dos matrices son iguales
    private static boolean sonIguales(int[][] a1, int[][] a2, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (a1[i][j] != a2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}