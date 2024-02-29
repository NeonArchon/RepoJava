package EJ6;

public class Ejercicio3_PosocionMinMax {

		public static void main(String[] args) {
	        int fila = 6;
	        int columna = 10;

	        int[][] tabla = cargarDatos(fila, columna);
	        int minimo = encontrarMinimo(tabla);
	        int maximo = encontrarMaximo(tabla);

	        mostrarTabla(tabla);

	        System.out.println("Numero Maximo: " + maximo);
	        System.out.println("Numero Minimo: " + minimo);
	    }

	    private static int[][] cargarDatos(int filas, int columnas) {
	        int[][] tabla = new int[filas][columnas];
	        

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                tabla[i][j] = (int) (Math.random()*1000+1); // Generación de números aleatorios
	            }
	        }

	        return tabla;
	    }

	    private static void mostrarTabla(int[][] tabla) {  // Dimensiones del Array	
	        for (int i = 0; i < tabla.length; i++) {
	            for (int j = 0; j < tabla[i].length; j++) {
	                System.out.printf(" %4d", tabla[i][j]);
	            }
	            System.out.println();
	        }
	    }

	    private static int encontrarMinimo(int[][] tabla) { //funcion para encontrar el numero minimo el la tabla
	        int minimo = tabla[0][0];

	        for (int[] fila : tabla) {
	            for (int elemento : fila) {
	                if (elemento < minimo) {
	                    minimo = elemento;
	                }
	            }
	        }

	        return minimo;
	    }

	    private static int encontrarMaximo(int[][] tabla) { // numero maximo para encontrar el numero maximo en la tabla
	        int maximo = tabla[0][0];

	        for (int[] fila : tabla) {
	            for (int elemento : fila) {
	                if (elemento > maximo) {
	                    maximo = elemento;
	                }
	            }
	        }

	        return maximo;
	    }
	}