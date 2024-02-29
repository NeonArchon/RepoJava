package poo2_4;

public class Operario extends Empleado {
	
	//CONSTRUCTOS POR DEFECTO
	
	public Operario() {
		
		
	}

	// CONSTRUCTOR CON PARAMETROS
	
	public Operario (String nombre) {
		
		super(nombre);
		System.out.println(" Operario ");
		
	}
	
	//TO STRING MIDIFICADO PARA MOS TRAR EL MENSAJE
	
	@Override
	public String toSring() {
		
		return super.toString() + " -> Operario";
		
	}
	
	
}
