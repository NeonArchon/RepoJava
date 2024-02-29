package EJ6;

public class Ejercicio9_Notas {
	public static void main(String[] args) {
	    // Generar y mostrar notas aleatorias
	    generarYMostrarNotas();
	}

	// Función para generar y mostrar notas aleatorias
	private static void generarYMostrarNotas() {
	    for (int i = 1; i <= 20; i++) {
	        int nota = generarNotaAleatoria();
	        mostrarResultadoNota(nota);
	    }
	}

	// Función para generar una nota aleatoria entre 1 y 10
	private static int generarNotaAleatoria() {
	    return (int) (Math.random() * 10 + 1);
	}

	// Función para mostrar el resultado de la nota
	private static void mostrarResultadoNota(int nota) {
	    System.out.print("[ nota : " + nota + " ");

	    if (nota < 5) {
	        System.out.println("Suspenso ]");
	    } else if (nota >= 5 && nota <= 6) {
	        System.out.println("Suficiente ]");
	    } else if (nota >= 7 && nota <= 8) {
	        System.out.println("Bien ]");
	    } else if (nota == 9) {
	        System.out.println("Notable ]");
	    } else {
	        System.out.println("Sobresaliente ]");
	    	}
		}
	}