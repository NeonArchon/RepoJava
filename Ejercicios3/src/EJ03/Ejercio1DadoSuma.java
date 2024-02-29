package EJ03;

public class Ejercio1DadoSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma;
		System.out.println("lanze los dados");
		int dado1 = (int) (Math.random()*6+1);
		System.out.println("primer dado" +dado1);
		int dado2 = (int) (Math.random()*6+1);
		System.out.println("segundo dado" +dado2);
		int dado3 = (int) (Math.random()*6+1);
		System.out.println("primer dado" +dado3);
		suma = dado1 + dado2 + dado3;
		System.out.println("resultado final: " +suma);
	}

}
