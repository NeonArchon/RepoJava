package EJ02;
import java.util.Scanner;

public class Ejercicio6UdeAsteriscos {
public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la altura");
    int altura = leer.nextInt();
    
    // Formando la U con asteriscos (sin asteriscos en las esquinas)
    for (int largo = 1; largo < altura; largo++) {
        if (largo < altura - 1 || largo == 1) {
            System.out.print("* ");
        } else {
            System.out.print(" ");
        }
        for (int espacio = 2; espacio < altura; espacio++) {
            if (largo < altura - 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("*");
    }
}
}