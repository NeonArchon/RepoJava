package EJ03;

public class EjercicioNotasRandom {

	public static void main(String[] args) {
		
		for (int i=1; i<=20; i++) { // generacion de notas
			
			int nota = (int) (Math.random()*10+1); //calsulo de notas aleatorio
			
			if (nota < 5) { // bucle para evaluar notas
				System.out.println("[ nota : " + nota + " Suspenso ]");
			} else if (nota >=5 && nota <=6 ) {
				System.out.println("[ nota : " + nota + " Suficiente ]");
			} else if (nota >=7 && nota <=8 ) {
				System.out.println("[ nota : " + nota + " Bien ]");
			} else if (nota == 9 ) {
				System.out.println("[ nota : " + nota + " Notable ]");
			} else {
				System.out.println("[ nota : " + nota + " Sobresaliente ]");
			}
		}

	}

}
