package poo2_3;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una persona y establecer sus datos
        Persona persona = new Persona();
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());
        System.out.print("Ingrese la dirección: ");
        persona.setDireccion(scanner.nextLine());
        System.out.print("Ingrese el código postal: ");
        persona.setcPostal(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la ciudad: ");
        persona.setCiudad(scanner.nextLine());
        System.out.print("Ingrese la fecha de nacimiento (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anyo = scanner.nextInt();
        persona.setFecha(new Fecha(dia, mes, anyo));

        // Mostrar información sobre la persona
        System.out.println(persona);
        if (persona.MayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}