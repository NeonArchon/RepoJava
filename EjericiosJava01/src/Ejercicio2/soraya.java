package Ejercicio2;
import java.util.*;

public class soraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int c = 0;
		
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
