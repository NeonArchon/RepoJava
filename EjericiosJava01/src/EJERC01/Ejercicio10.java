package EJERC01;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Diga un numero");
		int n = leer.nextInt();
		if (n > 7) {
			System.out.println("invalido");
		}else {
		}
		if (n == 1) {
			System.out.println("el dia es lunes ");
		}else {
			if (n == 2) {
				System.out.println("el dia es martes ");
			}else {
				if (n == 3) {
					System.out.println("el dia es miercoles");
				}else 
			if (n == 4) {
				System.out.println("el dia es jueves");
				}else 
			if (n == 5) {
				System.out.println("el dia es viernes");
				}else 
			if (n == 6) {
				System.out.println("el dia es sanado");
				}else 
			if (n == 7) {
				System.out.println("el dia es domingo");
			}
		}
	}
}
}
