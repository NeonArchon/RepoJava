package EJERC01; //triangulo de asteristcos
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int nf = leer.nextInt();
		leer.close();;
		
		System.out.println();
		for(int a=1; a<= nf; a++) { //espacios en blanco
			for(int bl = 1; bl <=nf-a; bl++) {
				System.out.print(" ");
			}
			for(int ast = 1; ast<=(a*2)-1; ast++) {  // asteriscos
				System.out.print("*");
			}
			System.out.println();
		}
	}
}