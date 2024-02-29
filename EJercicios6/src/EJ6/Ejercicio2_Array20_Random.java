package EJ6;

import java.util.Scanner;

public class Ejercicio2_Array20_Random {

		public static void main(String[] args) {

	        int[][] tabla = cargarDatos();
	        int[] sumFila = calcularSumaFilas(tabla);
	        int[] sumColumna = calcularSumaColumnas(tabla);

	        mostrarTabla(tabla, sumFila, sumColumna); //esto mostrara la tabla y las suman con la funcion
	    }

		private static int[][] cargarDatos() { //se cargan los datos de forma aleatoria
		    int[][] tabla = new int[4][5];
		    for (int i = 0; i < 4; i++) {
		        for (int j = 0; j < tabla[i].length; j++) {
		            tabla[i][j] = (int) (Math.random() * 100 + 99);
		        }
		    }
		    return tabla;
		}

	    private static int[] calcularSumaFilas(int[][] tabla) { //aqui se suman las filas
	        int[] sumFila = new int[4];

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	                sumFila[i] += tabla[i][j];
	            }
	        }

	        return sumFila;
	    }

	    private static int[] calcularSumaColumnas(int[][] tabla) { //aqui se suman las filas
	        int[] sumColumna = new int[6];

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	                sumColumna[j] += tabla[i][j];
	                sumColumna[5] += tabla[i][j];
	            }
	        }

	        return sumColumna;
	    }

	    private static void mostrarTabla(int[][] tabla, int[] sumFila, int[] sumColumna) { //esta funcion se encarga de mostrar la tabla
	        System.out.printf("%12s %10s %10s %10s %10s %10s %10s", " ", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Suma Fila");
	        System.out.println("");
	        for (int i = 0; i < 5; i++) {
	            if (i == 4) {
	                System.out.printf("%12s", "Suma Columna");
	            } else {
	                System.out.printf("%12s", "fila" + (i + 1));
	            }
	            for (int j = 0; j < 6; j++) {
	                if (i == 4) {
	                    System.out.printf("%11d", sumColumna[j]);
	                } else if (j == 5) {
	                    System.out.printf("%11d", sumFila[i]);
	                } else {
	                    System.out.printf("%11d", tabla[i][j]);
	                }
	            }
	            System.out.println("");
	        }
	    }
	}
