package EJ2;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num;
		int a = 1;
		int b = 1;
		
		do {
		System.out.println("Ingrese un numero para empezar la Fobonacci");
		num = leer.nextInt();
		} while (num<=1);
		
		System.out.println("Secuecia Fibonacci de: " + num);
		
		System.out.print(a + " ");
		for(int i=2; i<= num; i++) {
			System.out.print(b + " ");
			b = a + b;
			a = b - a;
		}
		System.out.println();
	}

}
