package EJERC01; //Numero Factorial
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n;
		double f=1;
		Scanner leer = new Scanner(System.in);
		do { //introducir un un mumero mayor a cero
			System.out.println("Introduce un umero mayor a cero");
			n = leer.nextInt();
			
		} while (n<0);
		//multiplicar todos los numeros desde 1 hasta n
		//el resultado de las multiplicaciones se acumula en la variable factorial
		for (int i = 1; i <= n; i++)
			f = f * i;
	
	
	System.out.println("facrotial de " + n + " es de " + f);
	}
}

