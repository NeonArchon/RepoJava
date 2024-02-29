package poo2_2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        // Ejemplo de uso
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de DNI: ");
        int dni = sc.nextInt();

        // Crear un objeto NIF usando el constructor que recibe el DNI
        NIF nif = new NIF(dni);

        // Mostrar el NIF usando el método toString
        System.out.println("NIF: " + nif.toString());

        // Obtener la letra del NIF y mostrarla
        System.out.println("Letra del NIF: " + nif.obtenerLetra());
    }

}
