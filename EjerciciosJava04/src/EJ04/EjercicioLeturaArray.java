package EJ04;
import java.util.Scanner;
public class EjercicioLeturaArray {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		Scanner  leer = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i ++) { // los array SIEMPER empiezan en CERO y acaban en el TAMAÑO -1
			
			System.out.println("introduzca un numero: ");
			num[i] = leer.nextInt();
				
		}
		for (int i = num.length -1 ; i >=0; i --)	{ // Se empieza en el tamano -1 y la condicion segunda siempre es de mayor
			
			System.out.print("| " + num[i] + " |");
		}
	}
}