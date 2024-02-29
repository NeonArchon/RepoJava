package EJ04;
import java.util.Scanner;
public class EjercicioTemperatura {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int[] listaClima = new int [12];
		
		for (int i=0; i< listaClima.length; i++) {
		System.out.println("Ingrese temperatura ");
		listaClima [i] = leer.nextInt();
		
		}
		
		for (int i=0; i< listaClima.length; i++) {
			System.out.println("Mes numeor: " + (i+1) + ": ");
			
			 for (int j = 0; j < listaClima[i]; j++) {
	                System.out.print("*");
			
			}
		System.out.println();
		}

	}
}