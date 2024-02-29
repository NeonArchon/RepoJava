package poo2_2;

import java.util.Scanner;

public class NIF {
	

	    // Atributos de la clase
	
	private int numeroDNI;
    private char letra;

    // Constructor por defecto
    public NIF() {
        this.numeroDNI = 0;
        this.letra = 'A'; // Otra letra por defecto
    }

    // Constructor que recibe el DNI y calcula la letra correspondiente
    public NIF(int numeroDNI) {
        this.numeroDNI = numeroDNI;
        this.calcularLetra();
    }

    // Método leer() para ingresar el número de DNI desde el teclado
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de DNI: ");
        this.numeroDNI = scanner.nextInt();
        this.calcularLetra();
    }

    // Método toString() para mostrar el NIF en formato especificado
    @Override
    public String toString() {
        return String.format("%08d-%c", this.numeroDNI, this.letra);
    }

    // Método para calcular y asignar la letra correspondiente al número de DNI
    private void calcularLetra() {
        // Utiliza la tabla dada para calcular la letra del DNI
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        this.letra = letras[this.numeroDNI % 23];
    }

    // Método para obtener la letra del NIF
    public char obtenerLetra() {
        return this.letra;
    }
    
}