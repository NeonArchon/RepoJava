package EJ03;

public class Ejercicio50Random {
	
	public static void main(String[] args) {
	
	int min=0;
	int max=0;
	int med=0;
	int total=0;
	
	for (int i=1; i<=50;i++) {
		
		int num = (int) (Math.random()*100+100);
		System.out.println(+ num);
		total = total + num;
		if (num > max) {
			max = num;
			
		}else if (num < min || num !=0) {
				min = num;

			}
		
			}

		System.out.println(+ max + " Es el numero mayor");
		System.out.println(+ min + " Es el numero menor");
		med = total/50;
		System.out.println("La media es :" + med );
	}
}