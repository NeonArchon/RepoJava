package EJERC01; //piramide de asteristcos (hueca)

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int nf = leer.nextInt();
		leer.close();
		
		System.out.println();
		
		for(int FILA=1; FILA<= nf; FILA++) { 
			
			//espacios en blanco
			for(int bl = 1; bl <=nf-FILA; bl++) {
				System.out.print(" ");
			}
			
			for(int COLUMNA = 1; COLUMNA<=(FILA*2)-1; COLUMNA++) {  // asteriscos
				if (COLUMNA==1 || COLUMNA==(FILA*2)-1 || FILA==nf) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

