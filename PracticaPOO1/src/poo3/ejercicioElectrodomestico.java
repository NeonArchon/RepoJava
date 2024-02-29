package poo3;

public class ejercicioElectrodomestico {
	
	
	public static void main(String[] args) {
		double total=0;
		double totalTV=0;
		double totalLavadora=0;
		ELECTRODOMESTICO[] E = new ELECTRODOMESTICO[10];
		
		E[0]  = new lavadora();
		E[1]  = new lavadora(100, 40, 20,"ROJO",'B');
		E[2]  = new lavadora(100, 40);
		E[3]  = new television();
		E[4]  = new television(800, "negro",'E', 42,35, false);
		E[5]  = new television(700, 12);
		E[6]  = new Electrodomestico();
		E[7]  = new Electrodomestico(350,"rojo", 'C', 17);
		E[8]  = new Electrodomestico(320, 6);
		E[9]  = new Electrodomestico(120,"azul", 'A', 60);
		
		for (int i=0;i<E.length;i++) {
			try {
				if (((Object)E[i]).getClass().getSimpleName().equals("ELECTRODOMESTICO")) {
					total+=E[i].PrecioFinal();
					
					
				}else if (((Object)E[i]).getClass().getSimpleName().equals("LAVADORA")) {
					totalLavadora+=E[i].PrecioFinal();
					
				}else {
					totalTV+=E[i].PrecioFinal();
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Precio total de los electrodomesticos: "+ total +" euros");
		System.out.println("Precio total de las lavadoras: "+ totalLavadora +" euros");
		System.out.println("Precio total de las televisiones: "+ totalTV +" euros");

	}

}
