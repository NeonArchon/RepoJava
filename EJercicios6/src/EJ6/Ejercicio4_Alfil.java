package EJ6;

	import java.util.Scanner;
	public class Ejercicio4_Alfil {


	    // Definir el tablero como una constante
	    private static final char[][] Tablero = { //es un modificador para indicar que solo se use cuando se declara
	        {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'},
	        {'1', '2', '3', '4', '5', '6', '7', '8'}
	    };

	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        // Paso 1: Obtener la posicion del alfil
	        System.out.print("En que posición esta el Alfil?: ");
	        String posicion = leer.nextLine();

	        // Paso 2: Convertir la posicion a coordenadas de fila y columna
	        int[] coordenadas = obtenerCoordenadas(posicion);

	        // Paso 3: Mostrar los movimientos válidos del alfil
	        System.out.println("El alfil se puede mover en las siguientes coordenadas:");
	        mostrarMovimientosAlfil(coordenadas[0], coordenadas[1]);
	    }

	    // Función para obtener las coordenadas a partir de la posición
	    private static int[] obtenerCoordenadas(String posicion) {
	        int[] coordenadas = new int[2];

	        // Buscar la posicion en el tablero
	        for (int i = 0; i < Tablero.length; i++) {
	            for (int j = 0; j < Tablero[i].length; j++) {
	                if (Tablero[i][j] == posicion.charAt(0)) {
	                    coordenadas[1] = i + 1; // Fila
	                }
	                if (Tablero[i][j] == posicion.charAt(1)) {
	                    coordenadas[0] = j + 1; // Columna
	                }
	            }
	        }

	        return coordenadas;
	    }

	    // Funcion para mostrar los movimientos validos del alfil
	    private static void mostrarMovimientosAlfil(int filaOrigen, int columnaOrigen) {
	        for (int i = 1; i <= 8; i++) {
	            for (int j = 1; j <= 8; j++) {
	                if (esMovimientoValido(filaOrigen, columnaOrigen, i, j)) {
	                    char columnaLetra = Tablero[0][j - 1];
	                    char filaNumero = Tablero[1][i - 1];
	                    System.out.print(columnaLetra + "" + filaNumero + " ");
	                }
	            }
	        }
	    }

	    // Funcion para verificar si un movimiento es valido
	    private static boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
	        int diferenciaFilas = Math.abs(filaDestino - filaOrigen);
	        int diferenciaColumnas = Math.abs(columnaDestino - columnaOrigen);
	        return diferenciaFilas == diferenciaColumnas && filaDestino != filaOrigen && columnaDestino != columnaOrigen;
	    }
	}