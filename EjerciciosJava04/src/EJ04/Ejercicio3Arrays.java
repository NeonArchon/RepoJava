package EJ04;

public class Ejercicio3Arrays {

	public static void main(String[] args) {
	 
		//Se crean 3 arrays
		
		int[] NUMERO = new int[20];
		
		int[] CUADRADO = new int[20];
		
		int[] CUBO = new int[20];
		
		
		for (int i = 0; i < NUMERO.length; i ++) { //Se crea el bucle para el array. Siempre empiezan en cero y el tamaño en -1
			
			NUMERO[i] = (int) (Math.random()*100+1); // Se crea el Array NUMERO
			System.out.println("NUMERO: " + NUMERO[i] + " " ); // Se muestra el Array NUMERO
			
			
			CUADRADO[i] =  NUMERO[i] * NUMERO[i]  ; // Se crea Array CUADRADO en base al array NUMERO
			System.out.println("CUADRADO: "+ CUADRADO[i] + " " ); //Se muestra el array CUADRADO
			
			
			CUBO[i] =  NUMERO[i] * NUMERO[i] * NUMERO[i]; // Se crea Array CUBO en base al array NUMERO
			System.out.println("CUBO: " + CUBO[i] + " "); //Se muestra el array CUBO
			
		}
	}

}
