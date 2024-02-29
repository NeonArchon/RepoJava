package poo2_3;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Persona {
		
		// ARIBUTOS
		
		private String nombre;
		
		private String direccion;
		
		private String ciudad;
		
		private int cPostal;
		
		private Fecha fNacimiento;
	
	
	//CONSTRUCTOR POR DEFECTO
	
	public Persona() {
		
		
	}
	
	
	//CONSTRUCTOR CON ATRIBUTOS
	
	public Persona(String nombre, String direccion, String ciudad, int cPostal, Fecha fNacimiento){
		
		this.nombre = nombre;
		
		this.direccion = direccion;
		
		this.ciudad = ciudad;
		
		this.cPostal = cPostal;
		
		this.fNacimiento = fNacimiento;
		
		
	}
	
	//GETTERS Y SETTERS


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public int getcPostal() {
		return cPostal;
	}


	public void setcPostal(int cPostal) {
		this.cPostal = cPostal;
	}


	public Fecha getFecha() {
		return fNacimiento;
	}


	public void setFecha(Fecha fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	
	//METODO "Mayor de Edad"
	
	public boolean MayorDeEdad() {
	    LocalDate fechaActual = LocalDate.now();
	    LocalDate fNacimiento = LocalDate.parse(this.fNacimiento.toString());  // Convertir la cadena de fecha de nacimiento a un objeto LocalDate
	    Period period = Period.between(fNacimiento, fechaActual); // Calcular la diferencia de años entre la fecha de nacimiento y la fecha actual
	    return period.getYears() >= 18;
	}

	
	
	//METODO TO STRING

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", cPostal=" + cPostal
				+ ", fecha de nacimiento=" + fNacimiento + "]";
		
	}
	
	
	//METODO COMPROBAR SI ES MAYOR DE EDAD
	
	public String esMayor() {
		
		if (MayorDeEdad()==true) {
				return "Mayor de Edad";
			}else {
				return "Menor de Edad";
			}
		}
		
	}
	
