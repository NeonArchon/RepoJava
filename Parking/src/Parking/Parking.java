package Parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	
	//atributos
	
	private String Nombre;
	
	private int CapacidadTotal;
	
	private HoraApertura[] horasApertura; //es un enum
	
	private List<IVehiculo> vehiculosEstacionados; // Lista de vehículos estacionados
	
	//constructor
	
	public Parking(String Nombre, int CapacidadTotal, HoraApertura[] horasApertura) {
		
		this.Nombre = Nombre;
		
		this.CapacidadTotal = CapacidadTotal;
		
		this.horasApertura = horasApertura;
		
	}
	
	
	//getters y setters

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCapacidadTotal() {
		return CapacidadTotal;
	}

	public void setCapacidadTotal(int capacidadTotal) {
		CapacidadTotal = capacidadTotal;
	}

	public HoraApertura[] getHorasApertura() {
		return horasApertura;
	}

	public void setHorasApertura(HoraApertura[] horasApertura) {
		this.horasApertura = horasApertura;
	}
	
	
	//metodo plaza libre
	
	public boolean Libre() { //indica el numero de plazas disponibles
		
		// Verifica si hay plazas libres en el aparcamiento
        // Puedes comparar la cantidad de vehículos estacionados con la capacidad total
        // Utiliza la encapsulación para acceder a la información necesaria
        // Devuelve true si hay plazas libres, de lo contrario, devuelve false
        // Considera también las horas de apertura si es relevante para la disponibilidad de plazas
		
		int plazasOcupadas = vehiculosEstacionados.size();
        return plazasOcupadas < CapacidadTotal;
	}
	
	
	public int Disponible() { //muestra el numero de plazas totales de plazas libres en el estacionamiento
		
		// Muestra el número total de plazas libres en el aparcamiento
        // Puedes restar la cantidad de vehículos estacionados de la capacidad total
        // Utiliza la encapsulación para acceder a la información necesaria
        // Devuelve el número de plazas libres
        // Considera también las horas de apertura si es relevante para la disponibilidad de plazas
		   
        int plazasOcupadas = vehiculosEstacionados.size();
        return CapacidadTotal - plazasOcupadas;
	}
	
	// Método para estacionar un vehículo
    public void estacionar(IVehiculo vehiculo) {
        if (Libre()) {
            vehiculosEstacionados.add(vehiculo);
        } else {
            // Manejar la situación cuando no hay plazas disponibles
            // Por ejemplo, lanzar una excepción o devolver un valor de error
        }
    }
	
    // Método para abandonar un vehículo
    public void abandonar(IVehiculo vehiculo) {
        vehiculosEstacionados.remove(vehiculo);
    }
		

}
