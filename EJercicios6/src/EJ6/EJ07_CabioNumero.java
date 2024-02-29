package EJ6;
import java.util.Scanner;
public class EJ07_CabioNumero {

	 public static void main(String[] args) {
	        Scanner leer = new Scanner(System.in);

	        int[] lista = new int[100];

	        llenarListaAleatoriamente(lista);

	        System.out.println("Elija un numero que desee reemplazar de la lista: ");
	        int num1 = leer.nextInt();

	        System.out.println("Elija el numero para reemplazar: ");
	        int num2 = leer.nextInt();

	        mostrarLista(lista);

	        reemplazarNumero(lista, num1, num2);

	        mostrarLista(lista);
	    }

	    // Función para llenar la lista con números aleatorios
	    private static void llenarListaAleatoriamente(int[] lista) {
	        for (int i = 0; i < lista.length; i++) {
	            lista[i] = (int) (Math.random() * 20 + 1);
	        }
	    }

	    // Función para mostrar la lista
	    private static void mostrarLista(int[] lista) {
	        System.out.println("Lista:");
	        for (int i = 0; i < lista.length; i++) {
	            System.out.print(lista[i] + " ");
	        }
	        System.out.println();
	    }

	    // Función para reemplazar un número en la lista
	    private static void reemplazarNumero(int[] lista, int num1, int num2) {
	        for (int i = 0; i < lista.length; i++) {
	            if (lista[i] == num1) {
	                lista[i] = num2;
	            }
	        }
	    }
	}
