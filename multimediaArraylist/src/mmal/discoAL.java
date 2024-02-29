package mmal;

public class discoAL extends multimediaAL {
	
	//ATRIBUTOS
	
		private String titulo;
	
		private String autor;
	
		private Formato formato;
	
		private int duracion;

		private Genero genero;
		
		//CONSTRUCTOR
		
		public discoAL() {
			
			
		}
		
		
		//CONSTRUCTOR CON ATRIBUTOS
		
		   public discoAL(String genero, Formato formato, String titulo, String autor, int duracion) {
		        
		    }
		   
		//GETTERS Y SETTERS
		

		   public discoAL(String string, String string2, String string3, String string4, String string5) {
			// TODO Auto-generated constructor stub
		}


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
