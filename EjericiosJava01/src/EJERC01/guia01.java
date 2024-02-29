package EJERC01;// Algoritmo que los digitos de un numero

import java.util.Scanner;

public class guia01 {
	

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int c = 0;
		System.out.println();
		System.out.println("escriba numero");
		int n = leer.nextInt();
		if (n == 0) {
			c = 1;
		} else {
			for (int i = Math.abs(n); i > 0; i /= 10){
				c++;
			}
		}
		
		System.out.println("el numero tiene: " + c + " digitos");
	}
}