package EJ02;
import java.util.Scanner;
public class Ejercicio5DigitosPardeNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        long numero = leer.nextLong();

        // Llamada a la función para calcular y mostrar los dígitos pares y su suma
        calcularDigitosPares(numero);
    }

    public static void calcularDigitosPares(long numero) {
        long nAbsoluto = Math.abs(numero); // Tomamos el valor absoluto para manejar números negativos
        long sumaPar = 0;
        System.out.print("Los dígitos pares son: ");

        while (nAbsoluto > 0) {
            long digito = nAbsoluto % 10; // Obtener el dígito actual

            if (digito % 2 == 0) { // Verificar si el dígito es par 
                System.out.print(digito + " ");
                sumaPar += digito; // Sumamos el dígito par a la suma total
            }

            nAbsoluto /= 10; // Pasar al siguiente dígito
        }

        System.out.println("\nLa suma de los dígitos pares es: " + sumaPar);
    }
}