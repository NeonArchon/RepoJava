package multimedia;

public class Pelicula extends Multimedia{
	
	
	//ATRIBUTOS
	
	private String titulo;
	
	private String autor;
	
	private Formato formato;
	
	private int duracion;
	
	private String actorP;
	
	private String actrizP;
	
	
	
	//CONSTRUCTOR
	
	public Pelicula (String titulo, String autor, Formato formato, int duracion, String actorP, String actrizP) {
		
		this.titulo = titulo;
		
		this.autor = autor;
		
		this.formato = formato;
		
		this.duracion = duracion;
		
		this.actorP = actorP;
		
		this.actrizP = actrizP;
		
	}

	//NO LOGRO ENTENDER POR QUE, PERO SIN ESTA LINEA EL LA LISTA MULTIMEDIA DE PELICULA NO CORRE
	public Pelicula(String titulo2, String autor2, String string, String string2, String actorP2, Object actrizP2) {
		
	}
	
	//LO MISMO CON ESTO, ERA RECOMENDACION DEL PROPOIO ECLIPSE
	public Pelicula(String titulo2, String autor2, String string, int duracion2, Object actorP2, Object actrizP2) {
		
	}


	//GETTERS Y SETTERS





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



	public Formato getFormato() {
		return formato;
	}



	public void setFormato(Formato formato) {
		this.formato = formato;
	}



	public int getDuracion() {
		return duracion;
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	public String getActorP() {
		return actorP;
	}


	public void setActorP(String actorP) {
		this.actorP = actorP;
	}


	public String getActrizP() {
		return actrizP;
	}


	public void setActrizP(String actrizP) {
		this.actrizP = actrizP;
	}
	
	//METODO TO STRING



	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + "]";
	}
	
	
	//METODO EQUALS
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pelicula pelicula = (Pelicula) obj;
        return titulo.equals(pelicula.titulo) && autor.equals(pelicula.autor) && formato == pelicula.formato
                && duracion == pelicula.duracion;
    }

}
