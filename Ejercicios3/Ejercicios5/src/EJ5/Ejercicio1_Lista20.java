package EJ5;
import java.util.Scanner;
public class Ejercicio1_Lista20 {

	public static void main(String[] args) {	
	
		int tabla[][] = new int[4][5];
		int sumFila[] = new int[5];
		int sumColumna[] = new int[6];
		
		Scanner leer =new Scanner (System.in);
		
		//Cargar Array
		System.out.println("Introduce los numeros para la tabla");
		for (int i=0; i<4; i++) { //tambien se puede usar el nombre del array.length
			for (int j=0; j<5; j++) {
				System.out.println("Fila " + (i + 1) + "Columna " + (j + 1) + " ");
				tabla[i][j] = leer.nextInt();
				sumColumna[5] += tabla[i][j]; //suma final
				sumFila[i] += tabla[i][j]; //suma de filas
				sumColumna[i] += tabla[i][j]; //suma de columnan
			}
		}
		System.out.printf("%12s %10s %10s %10s %10s %10s", " " , "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Suma Fila");
		System.out.println("");
		for (int i =0 ; i<5; i++) { //lectura de filas
			if (i == 4) {
				System.out.printf("%12s", "Suma Columna");	
			}else {
				System.out.printf("%12s", "fila" + (i+1));
			}
			for (int j = 0; j<6; j++) {
				if (i == 4) {
					System.out.printf("%11d", sumColumna[j]);
				} else if (j == 5) {
					System.out.printf("%11d", sumFila[i]);
				} else {
					System.out.printf("%11d", tabla[i][j]);
					}
				}
			System.out.println("");
			}
		}
	}
