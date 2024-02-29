package poo2_4;

public class Empleado {
	
	//ATRIBUTOS
	
	String nombre;
	
	//CONSTRUCTOR POR DEFECTO
	
	public Empleado() {
		
		
	}
	
	
	//CONSTRUCTOR CON ATRIBUTOS
	
	public Empleado(String nombre) {
		
		this.nombre = nombre;
		
		System.out.println("Constructor del Empleado" + nombre);
		
	}

	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//METODO TO STRING QUE DEVUELDA LA CADENA: "Empleado" + nombre
	

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}


	public String toSring() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
