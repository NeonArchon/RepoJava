package e;

import java.util.Scanner;

class suma {

	public static void main(String[] args) {

		
		Scanner leer = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("ingresa el primer numero");
		a = leer.nextInt();

		System.out.println("ingresa el segundo numero");
		b = leer.nextInt();
		
		int c = a + b;
		
		System.out.println("El resultado es:" + c);

	}

}
