package parkingExc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

	        Parking parking = new Parking("Parking Centro",  10);
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	          int  opcion = Integer.parseInt(scanner.nextLine());
	            opcion = 0;
		        do {
		            System.out.println("1. Entrada de coche");
		            System.out.println("2. Salida de coche");
		            System.out.println("3. Mostrar parking");
		            System.out.println("4. Salir del programa");
		            System.out.print("Seleccione una opción: ");
		            try {
		                opcion = Integer.parseInt(scanner.nextLine());
		                switch (opcion) {
		                    case  1:
		                        System.out.print("Introduzca la matrícula: ");
		                        String matricula = scanner.nextLine();
		                        System.out.print("Introduzca la plaza: ");
		                        int plaza = Integer.parseInt(scanner.nextLine());
		                        try {
		                            parking.Entrada(matricula, plaza);
		                            System.out.println("Plazas totales: " + parking.getPlazasTotales());
		                            System.out.println("Plazas ocupadas: " + parking.getPlazasOcupadas());
		                            System.out.println("Plazas libres: " + parking.getPlazasLibres());
		                        } catch (Exception e) {
		                            System.out.println(e.getMessage());
		                        }
		                        break;
		                    case  2:
		                        System.out.print("Introduzca la matrícula: ");
		                        matricula = scanner.nextLine();
		                        try {
		                            plaza = parking.Salida(matricula);
		                            System.out.println("Coche salido de la plaza " + plaza);
		                            System.out.println("Plazas totales: " + parking.getPlazasTotales());
		                            System.out.println("Plazas ocupadas: " + parking.getPlazasOcupadas());
		                            System.out.println("Plazas libres: " + parking.getPlazasLibres());
		                        } catch (Exception e) {
		                            System.out.println(e.getMessage());
		                        }
		                        break;
		                    case  3:
		                        System.out.println(parking);
		                        break;
		                    case  4:
		                        System.out.println("Saliendo del programa...");
		                        break;
		                    default:
		                        System.out.println("Opción no válida");
		                }
		            } catch (NumberFormatException e) {
		                System.out.println("Por favor, introduzca un número válido");
		            }
		        } while (opcion !=  4);
		        scanner.close();
		    
	        } catch (NumberFormatException e) {
	            System.out.println("Por favor, introduzca un número válido");
	            // Limpiar el buffer del scanner
	            scanner.nextLine();
	        }
	        
	        
	        /*
	        int opcion = 0;
	        do {
	            System.out.println("1. Entrada de coche");
	            System.out.println("2. Salida de coche");
	            System.out.println("3. Mostrar parking");
	            System.out.println("4. Salir del programa");
	            System.out.print("Seleccione una opción: ");
	            try {
	                opcion = Integer.parseInt(scanner.nextLine());
	                switch (opcion) {
	                    case  1:
	                        System.out.print("Introduzca la matrícula: ");
	                        String matricula = scanner.nextLine();
	                        System.out.print("Introduzca la plaza: ");
	                        int plaza = Integer.parseInt(scanner.nextLine());
	                        try {
	                            parking.Entrada(matricula, plaza);
	                            System.out.println("Plazas totales: " + parking.getPlazasTotales());
	                            System.out.println("Plazas ocupadas: " + parking.getPlazasOcupadas());
	                            System.out.println("Plazas libres: " + parking.getPlazasLibres());
	                        } catch (Exception e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case  2:
	                        System.out.print("Introduzca la matrícula: ");
	                        matricula = scanner.nextLine();
	                        try {
	                            plaza = parking.Salida(matricula);
	                            System.out.println("Coche salido de la plaza " + plaza);
	                            System.out.println("Plazas totales: " + parking.getPlazasTotales());
	                            System.out.println("Plazas ocupadas: " + parking.getPlazasOcupadas());
	                            System.out.println("Plazas libres: " + parking.getPlazasLibres());
	                        } catch (Exception e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case  3:
	                        System.out.println(parking);
	                        break;
	                    case  4:
	                        System.out.println("Saliendo del programa...");
	                        break;
	                    default:
	                        System.out.println("Opción no válida");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Por favor, introduzca un número válido");
	            }
	        } while (opcion !=  4);
	        scanner.close();
	    }
	
	*/
	
	
	}
