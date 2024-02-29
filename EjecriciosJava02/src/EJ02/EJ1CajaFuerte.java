package EJ02; //caja fuerte

import java.util.Scanner;
public class EJ1CajaFuerte {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int intentos = 4;
		int pass;
		boolean correcto = false;
		
		do{
			System.out.println("introduzca la contraseña");
			pass = leer.nextInt();
			
			if (pass == 1234) {
				correcto = true;
			} else {
				System.out.println("clave incorreta");
			}
			
			intentos--;
		}while ((intentos >0) && (!correcto));
		if (correcto) {
			System.out.println("La caja fuerte se abrió");
		}else {
			System.out.println("Se quedo sin intentos");
		}
	}
}