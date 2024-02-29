package multimedia;

public class Disco extends Multimedia{
	
	//ATRIBUTOS
	

	
	private Genero genero;
	
	//CONSTRUCTOR
	
	public Disco() {
		
		
	}
	
	
	//CONSTRUCTOR CON ATRIBUTOS
	
	   public Disco(Genero genero, Formato formato, String titulo, String autor, int duracion) {
	        super(formato, titulo, autor, duracion);
	        this.genero = genero;
	    }
	   
	//GETTERS Y SETTERS
	
	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
	//METODO TOSTRING
	
	@Override
	public String toString() {
		return "Disco [genero=" + genero + "]";
	}
	
	
	
	

}
