package EJ03;

public class Ejercicio2Dados {

	public static void main(String[] args) {
	int dado1;
	int dado2;
		
	do {
		dado1 = (int) (Math.random()*6+1); 
		System.out.println("D1: " + dado1);
		dado2 = (int) (Math.random()*6+1);
		System.out.println("D2: " + dado2);
		if (dado1 == dado2) {
			System.out.println("los dados coindiden");
		}else {
			System.out.println("Repetir");
				}
		
			}while (dado1 != dado2);
	}
}