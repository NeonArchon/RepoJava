package mega;

import java.util.Scanner;

public class sumaPOO {
	
	//atributos
	
	private int numA;
	
	private int numB;
	
	
	
	public sumaPOO(int numA, int numB) {
		
		this.numA = numA;
		
		this.numB = numB;
		
	}

	//getters y setters

	public int getNumA() {
		return numA;
	}



	public void setNumA(int numA) {
		this.numA = numA;
	}



	public int getNumB() {
		return numB;
	}



	public void setNumB(int numB) {
		this.numB = numB;
	}
	
	
	public static int sumar(int numA, int numB) {
		
		return  numA + numB;
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		
		int numA = leer.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		
		int numB = leer.nextInt();
		
		System.out.println("El resultado es: " + sumar(numA, numB));
		
	}
	
	
}
