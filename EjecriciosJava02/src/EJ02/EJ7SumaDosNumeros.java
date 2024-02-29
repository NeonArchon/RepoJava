package EJ02;
import java.util.Scanner;
public class EJ7SumaDosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		int num1 = leer.nextInt();
		System.out.println("ingrese el segundo numero");
		int num2 = leer.nextInt();
		
		int par = 0;
		int impar = 0;
		
		while (num1 > 0) {
			int digito = num1 % 10;
			if (digito % 2 == 0){
		} else {
			impar = impar * 10 +digito;
		}
			num1 /= 10;
		}
		while (num2 > 0) {
			int digito = num2 % 10;
			if(digito % 2 ==0) {
				par = par * 10 + digito;
		}else {
			impar = impar * 10 + digito;
		}
			num2 /= 10;
		}
		System.out.println("digitos pares: " + par);
		System.out.println("digitos impares: " + impar);
	}
}
