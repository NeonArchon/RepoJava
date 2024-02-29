package Parking;

public class Principal {

	public static void main(String[] args) {

		// Crear un objeto de la clase Parking
        Parking parking = new Parking("Parking Central",  100, new HoraApertura[]{HoraApertura.SEIS, HoraApertura.DIECIOCHO});

        // Crear un objeto de la clase VehiculoCliente
        VehiculoCliente vehiculoCliente = new VehiculoCliente("ABC-123");

        // Establecer el tiempo de estancia del vehículo en el parking
        vehiculoCliente.setTiempo(120); //  2 horas

        // Verificar si hay plaza en el parking
        boolean hayPlaza = vehiculoCliente.hayPlaza(parking);
        System.out.println("Hay plaza en el parking: " + hayPlaza);

        // Estacionar el vehículo en el parking
        vehiculoCliente.aparca(parking);

        // Calcular la factura del vehículo
        double factura = vehiculoCliente.factura();
        System.out.println("La factura del vehículo es: " + factura + "€");

        // Verificar el número de plazas libres en el parking
        int plazasLibres = parking.Disponible();
        System.out.println("Plazas libres en el parking: " + plazasLibres);


	}

}
