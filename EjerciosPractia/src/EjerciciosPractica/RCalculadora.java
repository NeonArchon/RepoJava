package EjerciciosPractica;
import java.util.Scanner;
public class RCalculadora {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		double v1 = 0.00;
		double v2 = 0.00;
		double R = 0.00;
		int Op;
		
		do {
			System.out.println("Calculadora");
			System.out.println("------------");
			System.out.println("1 2 3 4 5 6");
			
			Op = (int) leer.nextInt();
			
			switch (Op) {
			case 1:
				System.out.println("suma");
				System.out.println("primer numero");
				v1 = leer.nextDouble();
				System.out.println("segundo numero");
				v2 = leer.nextDouble();
				R = v1 + v2;
				System.out.println("Respuesta: " + R);
				System.out.println("***********\n");
				break;
			case 2:
				System.out.println("resta");
				System.out.println("primer numero");
				v1 = leer.nextDouble();
				System.out.println("segundo numero");
				v2 = leer.nextDouble();
				R = v1 - v2;
				System.out.println("Respuesta: " + R);
				System.out.println("***********\n");
				break;
			case 3:
				System.out.println("multiplicacion");
				System.out.println("primer numero");
				v1 = leer.nextDouble();
				System.out.println("segundo numero");
				v2 = leer.nextDouble();
				R = v1 * v2;
				System.out.println("Respuesta: " + R);
				System.out.println("***********\n");
				break;
			case 4:
				System.out.println("division ");
				System.out.println("primer numero");
				v1 = leer.nextDouble();
				System.out.println("segundo numero");
				v2 = leer.nextDouble();
				R = v1 / v2;
				System.out.printf("Respuesta: %.2f\n" + R);
				System.out.println("***********\n");
				break;
			case 5:
				System.out.println("division resto");
				System.out.println("primer numero");
				v1 = leer.nextDouble();
				System.out.println("segundo numero");
				v2 = leer.nextDouble();
				R = v1 % v2;
				System.out.printf("Respuesta: %.2f\n" , R);
				System.out.println("***********\n");
				break;
			case 6:
				System.out.println("potencia al cuadrado");
				System.out.println("primer numero");
				v1 = leer.nextDouble();
				R = Math.pow(v1, 2);
				System.out.printf("Respuesta: " , R);
				System.out.println("***********\n");
				break;
			case 7:
				System.out.println("Invalido, inserte otro numero");
			case 0:
				System.out.println("adios");
			}
			
		}while (Op != 0);

	}

}
