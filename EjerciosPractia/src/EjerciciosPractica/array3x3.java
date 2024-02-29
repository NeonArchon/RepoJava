package EjerciciosPractica;

public class array3x3 {

	public static void main(String[] args) {

		int [][] numeros = new int [3][3];
		
		//carga del array 2D
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("fila: " + (i+1));
			for (int j=0; j<numeros[i].length; j++) {
				System.out.println("Columna: " + (j+1));
				numeros[i][j] = i+j;
			}
		}
		
		System.out.println("-------------");
		
		//visualizar el array
	
		
		for (int i=0; i<numeros.length; i++) {
			
			for (int j=0; j<numeros[i].length; j++) {
				
				numeros[i][j] = i+j;
				
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
	}
}