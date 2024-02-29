package EJ04;
import java.util.Scanner;
public class EjercicioPosicion {

	public static void main(String[] args) {
		

        Scanner leer = new Scanner(System.in);

        int[] lista = new int[20];
        int[] listaN = new int[20];
        int aux = 0;

        // Generar el array original
        System.out.println("Array original:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100 + 1);
            System.out.print("| " + lista[i] + " ");
        }

        // Copiar el contenido del array original a un nuevo array
        System.arraycopy(lista, 0, listaN, 0, lista.length);

        // Ordenar el nuevo array en orden descendente
        for (int i = 0; i < listaN.length - 1; i++) {
            for (int j = i + 1; j < listaN.length; j++) {
                if (listaN[j] > listaN[i]) {
                    aux = listaN[i];
                    listaN[i] = listaN[j];
                    listaN[j] = aux;
                }
            }
        }

        System.out.println("\nArray ordenado:");
        for (int num : listaN) {
            System.out.print("| " + num + " ");
        }
    }
}