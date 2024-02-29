package EJ03;

public class EjercicioQuiniela {

	public static void main(String[] args) {
				
			int resultado;
			int columna = 3;
			
			for (int fila = 1; fila <= 14; fila ++) { //generacion de las filas
				System.out.printf("%2d. |", fila); 
				
				for (int apuestas = 1; apuestas <= columna; apuestas ++) { //generacion de los resultados de los partidos
					resultado = (int) (Math.random()*3+1);
					switch (resultado){
					case 1:
						System.out.print(" 1 |");
						break;
					case 2:
						System.out.print(" 2 |");
						break;
					case 3:
						System.out.print(" x |");
					}
					
				}
				System.out.println();
				
			}
			
			System.out.print("El Plemo al 15");  //Generacion del Pleno
			
			resultado = (int) (Math.random()*3+1);
			switch (resultado){
			case 1:
				System.out.print(" 1 |");
				break;
			case 2:
				System.out.print(" 2 |");
				break;
			case 3:
				System.out.print(" x |");
		}
	}
	}
