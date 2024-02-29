package EJERC01;// Piramide al reves (normal y hueca)

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int nf = leer.nextInt();
		leer.close();
		
		for(int FILA=nf; FILA>= 1; FILA--) { //espacios en blanco
			for(int bl = nf - FILA; bl >0; bl--) {
				System.out.print(" ");
			}
			for(int COLUMNA = 1; COLUMNA <=(FILA*2)-1; COLUMNA++) {  // asteriscos
					System.out.print("*");
				}
			System.out.println();
			}
			
		System.out.println();


		for(int FILA=nf; FILA>= 1; FILA--) { //espacios en blanco
			for(int bl = nf - FILA; bl >0; bl--) {
				System.out.print(" ");
			}
			for(int COLUMNA = 1; COLUMNA <=(FILA*2)-1; COLUMNA++) {  // asteriscos
	
				if (COLUMNA == 1 || COLUMNA == (FILA*2)-1 || FILA == nf) {
						System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}