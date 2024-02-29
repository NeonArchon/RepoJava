package EJ6;
import java.util.Random;
public class Ejercicio10_Dados {

	public static void main(String[] args) {
        jugarAlJuego();
    }

    private static void jugarAlJuego() {
        int dado1, dado2;
        
        do {
            dado1 = lanzarDado();
            System.out.println("D1: " + dado1);
            
            dado2 = lanzarDado();
            System.out.println("D2: " + dado2);
            
            if (dadosCoinciden(dado1, dado2)) {
                System.out.println("¡Los dados coinciden!");
            } else {
                System.out.println("Repetir");
            }
        } while (!dadosCoinciden(dado1, dado2));
    }

    private static int lanzarDado() {
        return new Random().nextInt(6) + 1;
    }

    private static boolean dadosCoinciden(int dado1, int dado2) {
        return dado1 == dado2;
    }
}