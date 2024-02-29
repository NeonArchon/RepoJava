package EJ04;
import java.util.Scanner;
public class EjercicioCambiaNumero {
	
	public static void main(String[] args) {
	
	Scanner leer = new Scanner(System.in);
		
	int[] lista = new int[100];
	
	System.out.println("Elija un un numero que desee reemplazar de la lista ");
	int num1 = leer.nextInt();
	System.out.println("Elija el numero para reemplazar");
	int num2 = leer.nextInt();
	
	for (int i=0; i<lista.length; i++) {
		lista[i] = (int) (Math.random()*20+1);
		System.out.print(" " + lista[i] + " ");
		
		if (lista[i] == num1) {
			lista [i] = num2;
			System.out.println(" ` " + lista[i]+ " ` ");
			}
		}
	}
}