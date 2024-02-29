package poo2_4;

public class Tecnico extends Operario{
	
	//CONSTRUCTOR POR DEFECTO
	
	public Tecnico() {
		
    }
	
	// CONSTRUCTOR CON PARAMETROS

    public Tecnico(String nombre) {
    	
        super(nombre);
        System.out.println("Constructor de Tecnico");  
        
    }
    
	//TO STRING MIDIFICADO PARA MOS TRAR EL MENSAJE
   
    @Override
    public String toString() {
    	
        return super.toString() + " -> Tecnico";
        
    }
    
}