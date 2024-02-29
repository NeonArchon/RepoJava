package EJ03;

public class EjercicioGeneracionRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int par = 0;
		
			do {
				
				num = (int) (Math.random()*100+1); // generacion aleatoria
				System.out.print(" - "+ num);
					if (num % 2 == 0)
							par = par +1;
								
				
			}while (num != 24);
			System.out.println(" Se han generado " + par + " numeros pares");
		}
	}