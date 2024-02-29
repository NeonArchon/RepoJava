package EJ6;

public class Ejercicio6_3Arrays {

		public static void main(String[] args) {
		 
			  // Definir y mostrar los arrays
	        int[] numero = generarNumeros();
	        mostrarArray("Numero: ", numero);

	        int[] cuadrado = generarCuadrados(numero);
	        mostrarArray("Cuadrado: ", cuadrado);

	        int[] cubo = generarCubos(numero);
	        mostrarArray("Cubo: ", cubo);
	    }

	    // Función para generar números aleatorios
	    private static int[] generarNumeros() {
	        int[] numeros = new int[20];
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = (int) (Math.random() * 100 + 1);
	        }
	        return numeros;
	    }

	    // Función para generar cuadrados en base a un array de números
	    private static int[] generarCuadrados(int[] numeros) {
	        int[] cuadrados = new int[numeros.length];
	        for (int i = 0; i < numeros.length; i++) {
	            cuadrados[i] = numeros[i] * numeros[i];
	        }
	        return cuadrados;
	    }

	    // Función para generar cubos en base a un array de números
	    private static int[] generarCubos(int[] numeros) {
	        int[] cubos = new int[numeros.length];
	        for (int i = 0; i < numeros.length; i++) {
	            cubos[i] = numeros[i] * numeros[i] * numeros[i];
	        }
	        return cubos;
	    }

	    // Función para mostrar un array
	    private static void mostrarArray(String mensaje, int[] array) {
	        System.out.print(mensaje);
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}