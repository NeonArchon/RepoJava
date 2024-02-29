package EJERC01; //MCD y MCM 
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int mcd = 0;
		int mcm = 0;
		
		System.out.println("Ingrese primer numero");
		n1 = leer.nextInt();
		System.out.println("Ingrese segundo numero");
		n2 = leer.nextInt();
		int temporal;
		while (n2!=0) {
			temporal = n2;
			n2 = n1 % n2;
			n1 = temporal;
			mcd = n1;
		}
		do {
			mcm = n2;
			n2 = n1 % n2;
			n1 = mcm;
		}while(n2!= 0);
		System.out.println("el Maximo Comun Divisor de " + n1 + " y de " + n2 + "es :" + mcd);
		System.out.println("el Minimi Comun Multiplo de " + n1 + " y de " + n2 + "es de:" + mcm);
	}

}
