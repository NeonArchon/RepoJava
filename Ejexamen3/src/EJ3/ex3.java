package EJ3;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String[] nombre = new String [20];
		double[] nota1 = new double [20];
		double[] nota2 = new double [20];
		double[] nota3 = new double [20];
		
		double medEstudiante;
		double media1;
		double suma1 = 0;
		double media2;
		double suma2 = 0;
		double media3;
		double suma3 =0;
		double medFinal;
		
		for (int i=0; i<20-1; i++) {
			System.out.println("Ingrese nombre del alumno");
			nombre[i] = leer.next();
			nota1[i] = (double) (Math.random()*20+1);
			suma1 = suma1 + nota1[i];
			nota2[i] = (double) (Math.random()*20+1);
			suma2 = suma2 + nota2[i];
			nota3[i] = (double) (Math.random()*20+1);
		}
			for (int i=0; i<20-1; i++) {
			suma3 = suma3 + nota3[i];
			medEstudiante = (nota1[i] + nota2[i] + nota3[i])/3;
			System.out.println("la media de " + nombre[i] + "es de " + medEstudiante);
			
			
		}
			media1= suma1/20;
			media2= suma2/20;
			media3= suma3/20;
			medFinal = (media1 + media2 + media3)/3;
			System.out.println("la media del primere semestre es de " + media1);
			System.out.println("la media del primere semestre es de " + media2);
			System.out.println("la media del primere semestre es de " + media3);
			System.out.println("la media final del curso es " + medFinal);
	}

}
