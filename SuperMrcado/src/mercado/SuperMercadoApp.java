package mercado;

import java.time.LocalDate;
import java.util.ArrayList;

public class SuperMercadoApp {

	public static void main(String[] args) {
		
		//clase principal. Prieba de supermercado
		
		//Elementos de tipo Cereal
		Cereal Kellogs = new Cereal ("Kellogs", 2.35, "Maiz", LocalDate.now());
		Cereal ConrFlakes = new Cereal ("ConrFlakes", 2.40, "Maiz", LocalDate.now());
		
		
		
		//Elementos de tipo Vino
		
		Vino Tomelloso = new Vino("Tomelloso", "Tinto", 7.40, 6.75, 0.0, 0.75, "Cristal", LocalDate.now());
		Vino Barbadillo = new Vino("Barbadillo", "Blanco", 7.40, 8.00, 0.0, 0.75, "Cristal", LocalDate.now());
		
		
		//elementos de Detergentes
		Detergente WippExpress = new Detergente("WippExpress", 21.5, 5, "PET", 0.0);
		Detergente Ariel = new Detergente("Ariel", 24.75, 4.5, "PET", 0.0);
		
		
				
		
				
		ArrayList<IesAlimento> MisAlimentos = new ArrayList<IesAlimento>();
		
		MisAlimentos.add(Kellogs);
		MisAlimentos.add(ConrFlakes);
		MisAlimentos.add(Tomelloso);
		MisAlimentos.add(Barbadillo);

		double caloriasTotales = 0.0;
		
		for(IesAlimento alimento : MisAlimentos) {
			
			caloriasTotales += alimento.getCalorias();
			
		}
		System.out.println("Calorias Totales: " + caloriasTotales);
		
		
		//metodos
		
		LocalDate fecha = LocalDate.of(2024, 2, 14);
		LocalDate fecha2 = LocalDate.now();
		
		System.out.println("Fecha " + fecha.getDayOfMonth() + "//" + fecha.getMonthValue()+ "//" + fecha.getYear());
		System.out.println("Fecha " + fecha2.getDayOfMonth() + "//" + fecha2.getMonthValue()+ "//" + fecha2.getYear());
				
		System.out.println("Volumend de Detergente Ariel " + Ariel.getVolumen());
		System.out.println("Cereales "+ Kellogs.getMarca() +"Cduca en " + Kellogs.getCaducidad());
		System.out.println(" Vino: " + Barbadillo.getTipoVino());
		
		
		
		
		
	}

}
