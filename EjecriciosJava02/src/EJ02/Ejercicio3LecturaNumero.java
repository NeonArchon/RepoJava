package EJ02; 

import java.util.*;
public class Ejercicio3LecturaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num = leer.nextInt();
		int invert = 0;
		int rest;
		
		while (num > 0) {
			rest = num %10;
			invert = invert *10 +rest;
			num /= 10;
		}
		System.out.println("Numero invertido " + invert);
		}
	}