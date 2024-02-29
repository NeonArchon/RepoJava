package EJ5;

public class Ejercicio3_PosocionMinMax {

	public static void main(String[] args) {


		  // Dimensiones del Array	
        int Fila = 6;
        int Columna = 10;

        int[][] Tabla = new int[Fila][Columna];

        int Min = -1;
        int Max = 1001;

        boolean Repetido;

        // Cargar Array 2D

        for (int i = 0; i < Tabla.length; i++) {

            for (int j = 0; j < Tabla[i].length; j++) {

                do {

                    Repetido = false;

                    Tabla[i][j] = (int) (Math.random() * 1000); // Generación de números

                } while (Repetido);

                if (Tabla[i][j] > Max) { // Búsqueda del máximo y el mínimo

                    Max = Tabla[i][j];

                }

                if (Tabla[i][j] < Min) {

                    Min = Tabla[i][j];

                }

                System.out.printf(" %4d", Tabla[i][j]);

            }

            System.out.println();
        }

        System.out.println("Numero Maximo: " + Max);
        System.out.println("Numero Minimo: " + Min);
    }
}