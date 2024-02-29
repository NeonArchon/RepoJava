package EJ04;
import java.util.Scanner;
public class EjercicioDestacar {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int lista[] = new int[100];
		int min = 500;
		int max = 0;
		String R;
		
			//creacion del aray
		
		for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 500 + 1);
            System.out.print("| " + lista[i] + " ");
        }
		System.out.println(); //esto es para que aparezca la pregunta de abajo
		
		//se pregunta si quiere el minimo o el maximo
		System.out.println("Quiere saber el numero minimo o el maximo?");
		R = leer.nextLine();
		
		if(R.equalsIgnoreCase("max")) {
		
			for (int i =0; i < lista.length; i++) { // explorar el array para buscar el maximo
			
				if (lista[i] >max) {
					max = lista[i]; //almacenamos el maximo aqui
				}
				 
			}
			for (int i=0; i < lista.length; i++) { //el array con el maximo resaltado
				if (lista[i] == max) {
					System.out.print("|*" + lista[i] + "*");
				} else {
					System.out.print("| " + lista[i] + " ");
				}
			}
			System.out.println();
			System.out.println("El maximo es:" + max);
				}
		if(R.equalsIgnoreCase("min")) {
			
			for (int i =0; i < lista.length; i++) {
			
				if (lista[i] <min) {
					min = lista[i];
				}
				 
			}
			for (int i=0; i < lista.length; i++) {
				if (lista[i] == min) {
					System.out.print("|*" + lista[i] + "*");
				} else {
					System.out.print("| " + lista[i] + " ");
				}
			}
			System.out.println();
			System.out.println("El minimi es:" + min);
			}
	}
	
}
