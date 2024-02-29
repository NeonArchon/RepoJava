package EJ02;
import java.util.Scanner;
public class Ejercicio4SolicitudFecha {

	public static void main(String[] args) {{
	        Scanner scanner = new Scanner(System.in);
	        int dia1, dia2, hora1, hora2;

	        System.out.println("Ingrese el día de la semana (1-7) y la hora del día (0-23) para el primer momento:");
	        dia1 = obtenerDiaValido(scanner);
	        hora1 = obtenerHoraValida(scanner);

	        System.out.println("Ingrese el día de la semana (1-7) y la hora del día (0-23) para el segundo momento:");
	        dia2 = obtenerDiaValido(scanner);
	        hora2 = obtenerHoraValida(scanner);

	        int horasTranscurridas = calcularHorasTranscurridas(dia1, hora1, dia2, hora2);
	        if (horasTranscurridas >= 0) {
	            System.out.println("Las horas transcurridas entre los dos momentos son: " + horasTranscurridas + " horas.");
	        } else {
	            System.out.println("Datos incorrectos. Verifica los valores ingresados para los días y las horas.");
	        }
	    }
	}
	    public static int obtenerDiaValido(Scanner scanner) {
	        int dia;
	        do {
	            System.out.print("Ingrese un día de la semana (1-7): ");
	            while (!scanner.hasNextInt()) {
	                System.out.print("Por favor, ingrese un número válido: ");
	                scanner.next();
	            }
	            dia = scanner.nextInt();
	        } while (dia < 1 || dia > 7);
	        return dia;
	    }

	    public static int obtenerHoraValida(Scanner scanner) {
	        int hora;
	        do {
	            System.out.print("Ingrese una hora del día (0-23): ");
	            while (!scanner.hasNextInt()) {
	                System.out.print("Por favor, ingrese un número válido: ");
	                scanner.next();
	            }
	            hora = scanner.nextInt();
	        } while (hora < 0 || hora > 23);
	        return hora;
	    }

	    public static int calcularHorasTranscurridas(int dia1, int hora1, int dia2, int hora2) {
	        final int horasPorDia = 24;
	        final int diasEnUnaSemana = 7;

	        int horasTotales1 = (dia1 - 1) * horasPorDia + hora1;
	        int horasTotales2 = (dia2 - 1) * horasPorDia + hora2;

	        if (horasTotales1 <= horasTotales2) {
	            return horasTotales2 - horasTotales1;
	        } else {
	            return (diasEnUnaSemana * horasPorDia) - (horasTotales1 - horasTotales2);
	        }
	    }
	}
