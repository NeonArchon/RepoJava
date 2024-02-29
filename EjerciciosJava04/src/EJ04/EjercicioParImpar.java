package EJ04;
import java.util.Scanner;
public class EjercicioParImpar {

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner (System.in);
		
		int[] lista = new int [8];
		
		for (int i =0; i < lista.length; i++) {
			
			System.out.println("Ingrese un numero");  // Solicitar al usuario que ingrese 8 números enteros
			lista[i] = leer.nextInt();
				if (lista[i] %2 ==0) {
					System.out.println("Numero " + lista[i] + " es Par");
				} else {
					System.out.println("Numero " + lista[i] + " es Impar");
				}
			
			}
		
		}
		
	}