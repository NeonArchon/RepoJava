package EJ6;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int intentos = 5;
        int min = 0;
        int max = 100;
        int numeroPensado = generarNumeroAleatorio(min, max);
        String respuesta;

        System.out.println("Piensa en un número entre 0 y 100 y voy a adivinarlo");

        while (intentos > 0) {
            mostrarIntento(numeroPensado, intentos);
            respuesta = leer.nextLine();

            if (respuesta.equals("igual")) {
                mensajeAdivinado(numeroPensado);
                return;
            } else if (respuesta.equals("mayor")) {
                min = ajustarRangoMayor(numeroPensado);
            } else if (respuesta.equals("menor")) {
                max = ajustarRangoMenor(numeroPensado);
            } else {
                mensajeRespuestaInvalida();
                continue;
            }

            numeroPensado = generarNumeroAleatorio(min, max);
            intentos--;
        }

        mensajeIntentosAgotados();
    }

    private static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private static void mostrarIntento(int numeroPensado, int intentos) {
        System.out.println("¿Es el número que estás pensando " + numeroPensado + "?");
        System.out.println("Quedan " + intentos + " intentos.");
        System.out.println("Responde con 'mayor', 'menor' o 'igual'.");
    }

    private static void mensajeAdivinado(int numeroPensado) {
        System.out.println("¡Adiviné! El número que estabas pensando era " + numeroPensado + ".");
    }

    private static int ajustarRangoMayor(int numeroPensado) {
        return numeroPensado + 1;
    }

    private static int ajustarRangoMenor(int numeroPensado) {
        return numeroPensado - 1;
    }

    private static void mensajeRespuestaInvalida() {
        System.out.println("Por favor, introduce 'mayor', 'menor' o 'igual'.");
    }

    private static void mensajeIntentosAgotados() {
        System.out.println("No pude adivinar el número en 5 intentos. Usuario gana");
    }
}

