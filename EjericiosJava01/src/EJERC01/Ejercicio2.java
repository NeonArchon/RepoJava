package EJERC01; //Numeros amigos

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		int n1,n2,s = 0, i;
		
		System.out.println("Ingrese primer numero");
		n1 = leer.nextInt();
		System.out.println("Ingrese segundo numero");
		n2 = leer.nextInt();
		
		for (i = 1; i< n1 ; i++) {
			if(n1%i==0) {
				s=s+i;
			}
		}
		if(s==n2) {
			s=0;
			for(i = 1;i < n2;i++);{
				s=s+i;
			}
			if(s==n1) {
				if(s==n1) {
					System.out.println("Son Amigos");
				}else {
					System.out.println("No son Amigos");
				}
			}
			else {
				System.out.println("No son Amigos");
			}
		}
	}
}
