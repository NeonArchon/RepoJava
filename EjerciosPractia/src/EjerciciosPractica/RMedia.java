package EjerciciosPractica;
import java.util.Scanner;
public class RMedia {
	
	public static void main(String[] args) {

	Scanner leer = new Scanner(System.in);
	
	int totalAlumnos = 2;
	
	String [] nombres = new String [totalAlumnos];
	
	double [] Notas1 = new double [totalAlumnos];
	double [] Notas2 = new double [totalAlumnos];
	double [] Notas3 = new double [totalAlumnos];
	
	
	System.out.println("\n ***** Notas Medias ***** \n");
	
	for (int i=0; i<totalAlumnos; i++) {
		System.out.print("Nombre y Apellido \t"); // \t es tabulacion
		 
		nombres[i] = leer.nextLine();
		Notas1[i] = Math.random()*100/10;
		Notas2[i] = Math.random()*100/10;
		Notas3[i] = Math.random()*100/10;
		
	}
	
	double [] NotaMedia = new double[totalAlumnos];
	for (int k = 0; k<NotaMedia.length; k++) {
		
		NotaMedia[k] = (Notas1[k] + Notas2[k] + Notas3[k]) / 3.0;
	}
	
	double Media1T = 0.00;
	double Media2T = 0.00;
	double Media3T = 0.00;
	
		for (int l=0; l<totalAlumnos; l++) {
			Media1T = Media1T + Notas1[l];
			Media2T = Media2T + Notas2[l];
			Media3T = Media3T + Notas3[l];
		}
	
		double MediaTotal = 0.00;
		for (int x = 0; x < NotaMedia.length; x++) {
			
			MediaTotal = MediaTotal + NotaMedia[x];
		}
		
		MediaTotal = MediaTotal / NotaMedia.length;
		
		//forma alterna MediaTotal = (Media1T + Media2T + Media3T) /3
		
		System.out.println("Resultados:");
		
		System.out.println("Notas de Alumnos");
		
		System.out.println("Nombre y Apellido - \t (Pimre Tr - Segundo Tr - Tercer Tr)  \t - Final");
		for (int k = 0; k < NotaMedia.length; k++) {
			
			System.out.println(nombres[k] + " (" + Notas1[k] + " - " + Notas2[k] + " - " + Notas3[k] + " - " +NotaMedia[k]);
			
		}
		
		System.out.println("Media Primer Trimestre" + Media1T);
		System.out.println("Media Segundo Trimestre" + Media2T);
		System.out.println("Media Tercer Trimestre" + Media3T);
		System.out.println("---------------------------------");
		System.out.println("Nota Media Del Grupo " + Media1T);
		System.out.println("---------------------------------");
	}
}
