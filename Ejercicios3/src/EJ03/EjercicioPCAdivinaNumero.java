package EJ03;
import java.util.Scanner;
public class EjercicioPCAdivinaNumero {
	public static void main(String[] args) {
		
	        Scanner leer = new Scanner(System.in);
	        int intentos = 5;
	        int min = 0;
	        int max = 100;
	        int numeroPensado = (int) (Math.random() * (max - min + 1)) + min;
	        String respuesta;

	        System.out.println("Piensa en un número entre 0 y 100 y voy a adivinarlo");

	        while (intentos > 0) {
	            System.out.println("¿Es el número que estás pensando " + numeroPensado + "?");
	            System.out.println("Quedan " + intentos + " intentos.");
	            System.out.println("Responde con 'mayor', 'menor' o 'igual'.");

	            respuesta = leer.nextLine();

	            if (respuesta.equals("igual")) {
	                System.out.println("¡Adiviné! El número que estabas pensando era " + numeroPensado + ".");
	                return;
	            } else if (respuesta.equals("mayor")) {
	                min = numeroPensado + 1;
	            } else if (respuesta.equals("menor")) {
	                max = numeroPensado - 1;
	            } else {
	                System.out.println("Por favor, introduce 'mayor', 'menor' o 'igual'.");
	                continue;
	            }

	            numeroPensado = (int) (Math.random() * (max - min + 1)) + min;
	            intentos--;
	        }

	        System.out.println("No pude adivinar el número en 5 intentos. Usuario gana");
	    }
	}
