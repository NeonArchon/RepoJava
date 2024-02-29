package EJ03;

public class Ejercicio20NumerosRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("20 ejecuciones aleatorias");
		for (int i=1; i<=20; i++) {
			int num = (int) (Math.random()*10);
			System.out.print( + num + " ");
		}
	}
}
