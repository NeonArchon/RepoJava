package ex1;
import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num1;
		int num2;
		int opcion;
	
		do {
			System.out.println("Elija una opcion para empezar la calculadora");
			System.out.println("[1] Suma | [2] Resta | [3] Multiplicacion | [4] Division| [5] Resto DIvision| [6] Potencia a 2| [0] Salir");
			opcion = leer.nextInt();
			if (opcion >6){
				System.out.println("Opcion invalida");
			} else if (opcion== 1){
				System.out.println("SUMA");
				System.out.println("Ingrese un numero");
				num1= leer.nextInt();
				System.out.println("Ingrese otro numero");
				num2= leer.nextInt();
				int suma= num1 + num2;
				System.out.println("Suma de: " + suma);
				}	else if (opcion== 2){
					System.out.println("RESTA");
					System.out.println("Ingrese un numero");
					num1= leer.nextInt();
					System.out.println("Ingrese otro numero");
					num2= leer.nextInt();
					int resta= num1 - num2;
					System.out.println("Suma de: " + resta);
						} else if (opcion== 3){
							System.out.println("MULTIPLICACION");
							System.out.println("Ingrese un numero");
							num1= leer.nextInt();
							System.out.println("Ingrese otro numero");
							num2= leer.nextInt();
							int multi= num1 * num2;
							System.out.println("Suma de: " + multi);
							} else if (opcion== 4){
								System.out.println("DIVISION");
								System.out.println("Ingrese un numero");
								num1= leer.nextInt();
								System.out.println("Ingrese otro numero");
								num2= leer.nextInt();
								int div= num1 / num2;
								System.out.println("Suma de: " + div);
								} else if (opcion== 5){
									System.out.println("DIVISION (RESTO)");
									System.out.println("Ingrese un numero");
									num1= leer.nextInt();
									System.out.println("Ingrese otro numero");
									num2= leer.nextInt();
									int mod= num1 % num2;
									System.out.println("Suma de: " + mod);
									} 
		
		} while (opcion !=0);
		
		}

	}

