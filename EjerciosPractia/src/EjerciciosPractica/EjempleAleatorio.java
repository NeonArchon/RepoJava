package EjerciciosPractica;
public class EjempleAleatorio {

	public static void main(String[] args) {
		System.out.println("20 ejecuciones aleatorias");
			for (int i=1; i<=20; i++) {
				int num = (int) (Math.random()*10+1);
				System.out.println("Numero" + i + ", " + num);
				
			}
	}

}
