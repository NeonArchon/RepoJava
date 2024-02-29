package poo2_4;

public class Directivo extends Operario{
	
	//CONSTRUCTOR POR DEFECTO
	
	public Directivo() {
		
    }
	
	// CONSTRUCTOR CON PARAMETROS
   
    public Directivo(String nombre) {
    	
        super(nombre);
        System.out.println("Constructor de Directivo");                                                           
    }
    
	//TO STRING MIDIFICADO PARA MOS TRAR EL MENSAJE
   
    @Override
    public String toString() {
    	
        return super.toString() + " -> Directivo";
    }
    
}