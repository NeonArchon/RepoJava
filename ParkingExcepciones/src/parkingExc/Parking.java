package parkingExc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Parking {
	
	
	//atributos
	
		ArrayList<String> Matriculas;
		
		String Nombre;
		
		//constructor
		 
		public Parking(String nombre, int numPlazas) {
		    this.Nombre = nombre;
		    this.Matriculas = new ArrayList<>(Collections.nCopies(numPlazas, null));
		}
		
		
			//metodos
			
		public void Entrada(String matricula, int plaza) throws Exception {
			 // Verifica si la matrícula es válida
		    if (matricula == null || matricula.length() < 4) {
		        throw new Exception("Matrícula incorrecta");
		    }
		    
		    // Verifica si la plaza está ocupada
		    if (Matriculas.get(plaza) != null) {
		        throw new Exception("Plaza ocupada");
		    }
		    
		    // Verifica si la matrícula ya existe en el parking
		    if (Matriculas.contains(matricula)) {
		        throw new Exception("Matrícula repetida");
		    }
		    
		    // Si todo está bien, agrega la matrícula a la plaza especificada
		    Matriculas.set(plaza, matricula);
		}
			
		public int Salida(String matricula) throws Exception {
			 // Busca la matrícula en el parking
		    int plazaLiberada = Matriculas.indexOf(matricula);
		    
		    // Si no se encuentra, lanza una excepción
		    if (plazaLiberada == -1) {
		        throw new Exception("Matrícula no existente");
		    }
		    
		    // Libera la plaza
		    Matriculas.set(plazaLiberada, null);
		    
		    // Devuelve el número de la plaza liberada
		    return plazaLiberada;
		}
			
			public int getPlazasTotales() {
				
				return Matriculas.size();
			}
			
			public int getPlazasOcupadas() {
				 return (int) Matriculas.stream().filter(Objects::nonNull).count();		}
			
			public int getPlazasLibres() {
				 return Matriculas.size() - getPlazasOcupadas();
			}
			
			
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
			    sb.append("Parking ").append(Nombre).append("\n");
			    for (int i =  0; i < Matriculas.size(); i++) {
			        sb.append("Plaza ").append(i).append(": ");
			        sb.append(Matriculas.get(i) != null ? Matriculas.get(i) : "(vacía)\n");
			    }
			    return sb.toString();
			}

			//getters y setters
			
		public ArrayList<String> getMatriculas() {
			return Matriculas;
		}

		public void setMatriculas(ArrayList<String> matriculas) {
			Matriculas = matriculas;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}
	
	
	
	/* 
	
	//atributos
	
	ArrayList<String> Matriculas;
	
	String Nombre;
	
	//constructor
	 
	public Parking(String nombre, int numPlazas) {
	    this.Nombre = nombre;
	    this.Matriculas = new ArrayList<>(Collections.nCopies(numPlazas, null));
	}
	
	
		//metodos
		
	public void Entrada(String matricula, int plaza) throws Exception {
		 // Verifica si la matrícula es válida
	    if (matricula == null || matricula.length() < 4) {
	        throw new Exception("Matrícula incorrecta");
	    }
	    
	    // Verifica si la plaza está ocupada
	    if (Matriculas.get(plaza) != null) {
	        throw new Exception("Plaza ocupada");
	    }
	    
	    // Verifica si la matrícula ya existe en el parking
	    if (Matriculas.contains(matricula)) {
	        throw new Exception("Matrícula repetida");
	    }
	    
	    // Si todo está bien, agrega la matrícula a la plaza especificada
	    Matriculas.set(plaza, matricula);
	}
		
	public int Salida(String matricula) throws Exception {
		 // Busca la matrícula en el parking
	    int plazaLiberada = Matriculas.indexOf(matricula);
	    
	    // Si no se encuentra, lanza una excepción
	    if (plazaLiberada == -1) {
	        throw new Exception("Matrícula no existente");
	    }
	    
	    // Libera la plaza
	    Matriculas.set(plazaLiberada, null);
	    
	    // Devuelve el número de la plaza liberada
	    return plazaLiberada;
	}
		
		public int getPlazasTotales() {
			
			return Matriculas.size();
		}
		
		public int getPlazasOcupadas() {
			 return (int) Matriculas.stream().filter(Objects::nonNull).count();		}
		
		public int getPlazasLibres() {
			 return Matriculas.size() - getPlazasOcupadas();
		}
		
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
		    sb.append("Parking ").append(Nombre).append("\n");
		    for (int i =  0; i < Matriculas.size(); i++) {
		        sb.append("Plaza ").append(i).append(": ");
		        sb.append(Matriculas.get(i) != null ? Matriculas.get(i) : "(vacía)\n");
		    }
		    return sb.toString();
		}

		//getters y setters
		
	public ArrayList<String> getMatriculas() {
		return Matriculas;
	}

	public void setMatriculas(ArrayList<String> matriculas) {
		Matriculas = matriculas;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	*/

}
