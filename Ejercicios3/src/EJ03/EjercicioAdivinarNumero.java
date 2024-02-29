package EJ03;
import java.util.Scanner;
public class EjercicioAdivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int numS= (int) (Math.random()*100+1);
		int intentos = 4;
		System.out.println("Adivine el numero");
		do {
			int respuesta = leer.nextInt();
			if (respuesta != numS) {
				
				System.out.println("respuesta equivocada, le quedan " + intentos + " intentos");
				intentos = intentos -1;
			}
				if (intentos == -1) {
					System.out.println("Se ha quedado sin intentos");
					
				}else if (respuesta == numS){
						System.out.println("has adivinado el numero");
					}
			}while (intentos >=0);
		}
		}


