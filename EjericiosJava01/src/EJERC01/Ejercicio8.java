package EJERC01; //Pesetas a Euros
import java.util.Scanner;
public class Ejercicio8 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		double eu = 0;
		System.out.println("Ingrese el numero de pesetas");
		float pst = leer.nextInt();
		
		eu = pst/166.39;
			System.out.println("Usted tiene " + eu + " en pesetas");

	}

}
