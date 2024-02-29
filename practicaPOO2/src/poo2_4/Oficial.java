package poo2_4;

public class Oficial extends Operario{
	
	//CONSTRUCTOR POR DEFECTO

	public Oficial() {
	    	
	}
	    
	// CONSTRUCTOR CON PARAMETROS

	public Oficial(String nombre) {
	    	
	    super(nombre);
	    System.out.println("Constructor de Oficial");    
	        
	    }
	    
	//TO STRING MIDIFICADO PARA MOS TRAR EL MENSAJE
	    	   
	@Override
	 public String toString() {
		
	     return super.toString() + " -> Oficial";
	        
	 }
	    
}
	