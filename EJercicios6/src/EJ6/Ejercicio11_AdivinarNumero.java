package EJ6;
import java.util.Scanner;
public class Ejercicio11_AdivinarNumero {

	    public static void main(String[] args) {
	        adivinarNumero();
	    }

	    private static void adivinarNumero() {
	        Scanner leer = new Scanner(System.in);
	        int numS = numeroAleatorio();
	        int intentos = 4;

	        System.out.println("Adivine el numero");

	        do {
	            int respuesta = leer.nextInt();

	            if (respuesta != numS) {
	                System.out.println("Incorrecto, le quedan " + intentos + " intentos");
	                intentos = intentos - 1;
	            }

	            if (intentos == -1) {
	            	
	                System.out.println("Sin intentos");
	                
	            } else if (respuesta == numS) {
	            	
	                System.out.println("Ha adivinado el numero!");
	            }

	        } while (intentos >= 0);
	    }

	    private static int numeroAleatorio() {
	        return (int) (Math.random() * 1000 + 1);
	    }
	}