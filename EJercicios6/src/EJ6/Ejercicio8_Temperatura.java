package EJ6;
import java.util.Scanner;
public class Ejercicio8_Temperatura {


	    public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        int[] listaClima = new int[12];

	        // Llenar la lista con temperaturas ingresadas por el usuario
	        llenarListaTemperaturas(leer, listaClima);

	        // Mostrar el gráfico de barras para cada mes
	        mostrarGraficoBarras(listaClima);
	    }

	    // Función para llenar la lista con temperaturas ingresadas por el usuario
	    private static void llenarListaTemperaturas(Scanner leer, int[] listaClima) {
	        for (int i = 0; i < listaClima.length; i++) {
	            System.out.println("Ingrese temperatura para el mes " + (i + 1) + ": ");
	            listaClima[i] = leer.nextInt();
	        }
	    }

	    // Función para mostrar el gráfico de barras para cada mes
	    private static void mostrarGraficoBarras(int[] listaClima) {
	        for (int i = 0; i < listaClima.length; i++) {
	            System.out.print("Temperatura del mes " + (i + 1) + ": ");
	            mostrarBarras(listaClima[i]);
	            System.out.println();
	        }
	    }

	    // Función para mostrar las barras en el gráfico
	    private static void mostrarBarras(int cantidadBarras) {
	        for (int j = 0; j < cantidadBarras; j++) {
	            System.out.print("*");
	        }
	    }
	}
