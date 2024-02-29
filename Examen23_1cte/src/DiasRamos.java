import java.time.LocalDate;
import java.util.Scanner;

public class DiasRamos {

    public static void main(String[] args) {
        int diasRamos = calcularDias();
        System.out.println("Quedan " + diasRamos + " días para el Domingo de Ramos 2024.");
        System.out.println("\n\t ------- Gracias y adiós !!!!!! ---------");
    }

    private static int calcularDias() {
        int dias = 0;
        int nDia = leerDia();
        int nMes = leerMes();
        int nAnyo = leerAnyo();

        // Obtener la fecha de Domingo de Ramos 2024
        LocalDate domingoRamos2024 = LocalDate.of(2024, 3, 24);

        // Obtener la fecha ingresada por el usuario
        LocalDate fechaIngresada = LocalDate.of(nAnyo, nMes, nDia);

        // Calcular la diferencia en días
        dias = (int) Math.abs(domingoRamos2024.toEpochDay() - fechaIngresada.toEpochDay());

        return dias;
    }

    //aqui ingresamos la fecha
    private static int leerAnyo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        return scanner.nextInt();
    }

    private static int leerMes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el mes: ");
        return scanner.nextInt();
    }

    private static int leerDia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el día: ");
        return scanner.nextInt();
    }
}
