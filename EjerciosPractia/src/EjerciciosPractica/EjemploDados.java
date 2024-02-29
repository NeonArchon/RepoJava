package EjerciciosPractica;

public class EjemploDados {
		//tirada de dados
	public static void main(String[] args) {	
	System.out.println("tirada de dados");
	
	for (int i=1; i<=10; i++) {
	
		int dado1 = (int) (Math.random()*6+1); 
		int dado2 = (int) (Math.random()*6+1);
	
		int resultado = dado1 + dado2;
	
		
		System.out.println ("tirada: " + dado1 + " " + dado2 + "total: " + resultado);
}
}
}
