package EJ02;

import java.util.Scanner;
public class EJ2PiramideNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("introduzca el numero de filas");
		int numfila = leer.nextInt();
		int h = numfila;
		int k= 2;
		for(int i=1; i <= numfila; i++) {
			for(int a =h; a>0; a--) {
				System.out.print("   ");
			}
			h--;
			for(int b = 1; b < k; b++) {
				if(b<10) {
					System.out.print(" "+ 0 + b + " ");
				}
				else {
					System.out.print(" " + b + " ");
				}
			}
			k = k+2;
			System.out.println(" ");
		}
	}
}