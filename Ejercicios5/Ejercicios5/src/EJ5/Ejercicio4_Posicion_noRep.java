package EJ5;

public class Ejercicio4_Posicion_noRep {
	
	public static void main(String[] args) {
	
		// Dimensiones del Array	
			
			// Dimensiones del Array	
			int Fila = 6;
			int Columna = 10;
			
			int[][] Tabla = new int[Fila][Columna];
			
			int Min = -1;
			int Max = 1001;
			
			boolean Repetido;
			
			// Cargar Array 2D
			
			for (int i = 0; i < Tabla.length; i++) {
				
				for (int j = 0; j < Tabla[i].length; j++) {
					
					do {
						
						Repetido = false;
						
						Tabla[i][j] = (int) (Math.random() * 1000); // Generación de números
						
						for (int k = 0; k <= i; k++) {
							
							for (int l = 0; l < Tabla[k].length; l++) { // For para comprobar datos
								
								if (Tabla[i][j] == Tabla[k][l] && (k != i && l != j)) { // Comprobar datos
									
									Repetido = true; // 
								}
							}
						}
					} while (Repetido);
					
					if (Tabla[i][j] > Max) { // Búsqueda del máximo y el mínimo
						
						Max = Tabla[i][j];
						
					}
					
					if (Tabla[i][j] < Min) {
						
						Min = Tabla[i][j];
						
					}
					
					System.out.printf(" %4d", Tabla[i][j]);
					
				}
				
				System.out.println();
			}
			
			System.out.println("Numero Maximo: " + Max);
			System.out.println("Numero Minimo: " + Min);
		}
	}