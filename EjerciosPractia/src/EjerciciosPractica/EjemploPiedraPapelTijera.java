package EjerciciosPractica;

public class EjemploPiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("vamos a jugar pierda, papel o tijera");
		//jugador1
		//jugador2
		int valor1 = (int) (Math.random()*3);
		int valor2 = (int) (Math.random()*3);
		//jugador 1
		String resultado1="";
		switch (valor1) {
		case 0: 
			resultado1 ="piedra";
			break;
		case 1: 
			resultado1 ="papel";
			break;
		case 2: 
			resultado1 ="tijera";
			break;
		}
		System.out.println(resultado1);
		
		//jugador 2
			String resultado2="";
			switch (valor2) {
			case 0: 
				resultado2 ="piedra";
				break;
			case 1: 
				resultado2 ="papel";
				break;
			case 2: 
				resultado2 ="tijera";
				break;
			}
			System.out.println(resultado2);
			
			//resultados
			if (valor1==valor2) {
				System.out.println("empate");
			}else {
				if ((valor1 == 0 && valor2==2) || (valor1==1 && valor2==0) || (valor1==2 && valor2==1)) {
					System.out.println("Gana jugador 1");
				}else {
					System.out.println("gana jugador 2");
				}
				}
			System.out.println("Jugador 1: " + resultado1);
			System.out.println("Jugador 2: " + resultado2);
			}
	}
