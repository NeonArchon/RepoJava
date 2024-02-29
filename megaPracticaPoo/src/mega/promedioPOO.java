package mega;

import java.util.Scanner;
import java.util.Arrays;

public class promedioPOO {
	

	Scanner l = new Scanner(System.in);
	
	//atributos
	
	int notas[] = new int[4];
	
	//constructor
	
	public promedioPOO(int notas[]) {
		
		this.notas = notas;
		
	}
	
	//getters y setters
	
	public int[] getNotas() {
		return notas;
	}


	public void setNotas(int[] notas) {
		this.notas = notas;
	}



	//metodo ingresar notas


	public int[] ingresarNotas(int notas[]) {
	
	System.out.println("Ingrese las notas del alumno");
	
	for(int i=0; i<=3; i++) {
		
		notas[i] = l.nextInt();
		 
		}
		
		return notas;
	}
	
	@Override
	public String toString() {
		return "promedioPOO [notas=" + Arrays.toString(notas) + "]";
	}
	

	//metodo calcular promedio

	
	

	public int calcularPromedio(int notas[]) {
		
		int sumaNotas = 0;
		
		
		for(int i=0; i<3; i++) {
			
			sumaNotas = notas[i]++;
			
		}
		
		int promedio = sumaNotas/4;
		
		return promedio;
	}
	
	public static void main(String[] args) {
		promedioPOO programa = new promedioPOO(new int[4]);
		
		programa.ingresarNotas(programa.getNotas());
		
		System.out.println("Las notas del alumno: " + java.util.Arrays.toString(programa.getNotas()));
		
		 int promedio = programa.calcularPromedio(programa.getNotas());
		
		System.out.println("El promedio es: " + promedio);
		
	}
	
	
}
