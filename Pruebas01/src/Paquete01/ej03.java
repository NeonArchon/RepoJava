package Paquete01;

import java.util.Scanner;

class ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int r=0;
		double d1=0;
		
		Scanner myscanner=new Scanner(System.in);
		
		System.out.println("escribe a");
		a=myscanner.nextInt();
		System.out.println("escribe b");
		b=myscanner.nextInt();
		System.out.println("escribe c");
		c=myscanner.nextInt();
		System.out.println("escribe d");
		d=myscanner.nextInt();
		System.out.println("escribe r");
		r=myscanner.nextInt();
		System.out.println("escribe d1");
		d1=myscanner.nextInt();
		
		r=(4/3*(r+34))-9*(a+b*c)+3+d*(2+a)/a+b*d;
		System.out.println("el resultado es "+r);
	}

}
