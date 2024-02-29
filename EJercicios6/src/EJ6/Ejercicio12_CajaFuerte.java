package EJ6;
import java.util.Scanner;
public class Ejercicio12_CajaFuerte {

	public static void main(String[] args) {
		

		Scanner leer = new Scanner(System.in);
        int intentos = 4;

        boolean correcto = false;

        do {
            int pass = introducirContraseña(leer);
            correcto = verificarContraseña(pass);

            if (!correcto) {
                System.out.println("Clave incorrecta");
            }

            intentos--;

        } while (intentos > 0 && !correcto);

        if (correcto) {
            System.out.println("La caja fuerte se abrió");
        } else {
            System.out.println("Se quedó sin intentos");
        }
    }

    private static int introducirContraseña(Scanner leer) {
        System.out.println("Introduzca la contraseña:");
        return leer.nextInt();
    }

    private static boolean verificarContraseña(int pass) {
        return pass == 1234;
    }
}