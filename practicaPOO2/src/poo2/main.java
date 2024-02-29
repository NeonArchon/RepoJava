package poo2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		 int d, m, a;
		 

		        // Se pide por teclado el dia, mes y año
		        System.out.println("Introduce fecha: ");
		        System.out.print("dia: ");
		        d = sc.nextInt();
		        System.out.print("mes: ");
		        m = sc.nextInt();
		        System.out.print("año: ");
		        a = sc.nextInt();

		        // Se crea un objeto Fecha utilizando el consructor con parámetros
		        Fecha fecha = new Fecha(d, m, a);
		        if (fecha.fechaCorrecta(a, m, a)) {
		            // Se muestra utilizando el método toString()
		            System.out.println("Fecha introducida: " + fecha);

		            // Se muestran los 10 días siguientes utilizando el método diaSiguiente()
		            System.out.println("Los 10 días siguientes son:");
		            for (int i = 1; i <= 10; i++) {
		                fecha.diaSiguiente();
		                fecha.mostrarFecha(); // Utiliza el nuevo método mostrarFecha
		            }
		        } else {
		            // Si la fecha no es correcta
		            System.out.println("Fecha no valida");
		        }
		        
		}
	}