package EJ5;
import java.util.Scanner;
public class Ejercicio5_Alfil {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("En que posicion esta el Alfil?: ");
        String posicion = leer.nextLine();

        int fila = posicion.charAt(1) - '0';
        int columna = posicion.charAt(0) - 'a' + 1;

        System.out.println("El alfil se puede mover en las siguientes coordenadas:");

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (esMovimientoValido(fila, columna, i, j)) {
                    char columnaLetra = (char) ('a' + j - 1);
                    System.out.print(columnaLetra + "" + i + " ");
                }
            }
        }
    }

    private static boolean esMovimientoValido(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        // El alfil se mueve en diagonal, por lo que la diferencia absoluta entre las filas y columnas debe ser la misma
        int diferenciaFilas = Math.abs(filaDestino - filaOrigen);
        int diferenciaColumnas = Math.abs(columnaDestino - columnaOrigen);

        return diferenciaFilas == diferenciaColumnas && filaDestino != filaOrigen && columnaDestino != columnaOrigen;
    }
}
	
