package multimedia;

public class Multimedia {
	
	//ATRIBUTOS
	


	private Formato formato;
	
	private String titulo;
	
	private String autor;
	
	private int duracion;
	
	//CONSTRUCTOR 
	
	public Multimedia(){
		
		
	}

	
	//CONSTRUCTOR CON ATRIBUTOS
	
	public  Multimedia (Formato formato, String titluo, String autor, int durarion) {
		
		this.formato = formato;
		
		this.titulo = titulo;
		
		this.autor = autor;
		
		this.duracion =  duracion;
		
	}


	// GETTERS Y SETTERS

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	//METODO TOSTRING

	@Override
	public String toString() {
		return "Multimedia [formato=" + formato + ", titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion
				+ "]";
	}
	
	//METODO EQUALS
	
	@Override
	 public boolean equals(Object obj) {
		
		// Paso 1: Comprobar si los objetos son idénticos
	        if (this == obj) {
	            return true;
	        }
	        
	     // Paso 2: Comprobar si el objeto pasado como parámetro es nulo o de una clase diferente
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        
	     // Paso 3: Convertir el objeto pasado como parámetro al tipo Multimedia   
	        Multimedia multimedia = (Multimedia) obj;
	        
	     // Paso 4: Comparar los atributos relevantes (titulo y autor)
	        return titulo.equals(multimedia.titulo) && autor.equals(multimedia.autor);
	    }

	
}
	